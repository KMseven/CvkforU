package com.temp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Viewport{
  private Southwest southwest;
  private Northeast northeast;
  public void setSouthwest(Southwest southwest){
   this.southwest=southwest;
  }
  public Southwest getSouthwest(){
   return southwest;
  }
  public void setNortheast(Northeast northeast){
   this.northeast=northeast;
  }
  public Northeast getNortheast(){
   return northeast;
  }
}