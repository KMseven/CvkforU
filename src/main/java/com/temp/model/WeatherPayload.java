package com.temp.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherPayload{
  private List<Results> results;
  private String status;
  public void setResults(List<Results> results){
   this.results=results;
  }
  public List<Results> getResults(){
   return results;
  }
  public void setStatus(String status){
   this.status=status;
  }
  public String getStatus(){
   return status;
  }
}