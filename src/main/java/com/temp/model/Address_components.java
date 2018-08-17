package com.temp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address_components{
  private Object types;
  private String short_name;
  private String long_name;
  public void setTypes(Object types){
   this.types=types;
  }
  public Object getTypes(){
   return types;
  }
  public void setShort_name(String short_name){
   this.short_name=short_name;
  }
  public String getShort_name(){
   return short_name;
  }
  public void setLong_name(String long_name){
   this.long_name=long_name;
  }
  public String getLong_name(){
   return long_name;
  }
}