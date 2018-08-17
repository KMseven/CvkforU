package com.temp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Geometry{
  private Viewport viewport;
  private Bounds bounds;
  private Location location;
  private String location_type;
  public void setViewport(Viewport viewport){
   this.viewport=viewport;
  }
  public Viewport getViewport(){
   return viewport;
  }
  public void setBounds(Bounds bounds){
   this.bounds=bounds;
  }
  public Bounds getBounds(){
   return bounds;
  }
  public void setLocation(Location location){
   this.location=location;
  }
  public Location getLocation(){
   return location;
  }
  public void setLocation_type(String location_type){
   this.location_type=location_type;
  }
  public String getLocation_type(){
   return location_type;
  }
}