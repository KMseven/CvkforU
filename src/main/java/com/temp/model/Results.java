package com.temp.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Results{
  private String formatted_address;
  private Geometry geometry;
  private List<Address_components> address_components;
  private String place_id;
  public void setFormatted_address(String formatted_address){
   this.formatted_address=formatted_address;
  }
  public String getFormatted_address(){
   return formatted_address;
  }
  public void setGeometry(Geometry geometry){
   this.geometry=geometry;
  }
  public Geometry getGeometry(){
   return geometry;
  }
  public void setAddress_components(List<Address_components> address_components){
   this.address_components=address_components;
  }
  public List<Address_components> getAddress_components(){
   return address_components;
  }
  public void setPlace_id(String place_id){
   this.place_id=place_id;
  }
  public String getPlace_id(){
   return place_id;
  }
}