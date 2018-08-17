package com.temp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Southwest{
  private Integer lng;
  private Integer lat;
  public void setLng(Integer lng){
   this.lng=lng;
  }
  public Integer getLng(){
   return lng;
  }
  public void setLat(Integer lat){
   this.lat=lat;
  }
  public Integer getLat(){
   return lat;
  }
}