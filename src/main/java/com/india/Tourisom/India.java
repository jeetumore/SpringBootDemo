package com.india.Tourisom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class India {

  @Autowired
  @Qualifier("mumbai")
  private TouristPlace touristPlace;

  public void setTouristPlace(TouristPlace touristPlace) {
    this.touristPlace = touristPlace;
  }

  public void touristPlace() {
    if (touristPlace != null) {
      touristPlace.Malls();
      touristPlace.Monuments();
      touristPlace.Praks();
      touristPlace.ZoologicalParks();
    }
    else {
      System.out.println("No Tourist Place method found");
    }
  }
}
