package com.temp.Controller;

import com.eclipsesource.json.JsonObject;
import com.github.dvdme.ForecastIOLib.ForecastIO;
import com.temp.model.WeatherPayload;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    @RequestMapping(value="city/{location}", method = RequestMethod.GET)
    @ResponseBody
    public String findWeather(@PathVariable("location") String location){

        String urlForLocation="http://maps.googleapis.com/maps/api/geocode/json?address=$$&sensor=true";
        WeatherPayload weatherPayload=new RestTemplate().getForObject(urlForLocation.replace("$$",location), WeatherPayload.class);
        while(!weatherPayload.getStatus().equalsIgnoreCase("OK")){
            weatherPayload=new RestTemplate().getForObject(urlForLocation.replace("$$",location), WeatherPayload.class);
        }
        Integer lat = weatherPayload.getResults().get(0).getGeometry().getLocation().getLat();
        Integer lng = weatherPayload.getResults().get(0).getGeometry().getLocation().getLng();

        String apiKey="08311b57a43b85c6856a17b09444eb18";
        ForecastIO fio = new ForecastIO(apiKey);
        fio.setUnits(ForecastIO.UNITS_SI);
        fio.getForecast(lat.toString(),lng.toString());
        String result= "";
        for(JsonObject.Member key : fio.getCurrently()){
            result +=key.getName();
            result +=" : ";
            result +=key.getValue();
            result +="\n";
        }
        return result;
        //return fio.getCurrently().get("summary").asString();
        }

}
