package com.india.Tourisom.Person;

public class Human {

  private Heart heart;

  public Human(Heart heart) {
    this.heart = heart;
  }

  public void setHeart(Heart heart) {
    this.heart = heart;
  }

  public void startpumping(){
    if (heart != null ){
      heart.pumping();
    }
    else {
      System.out.println(" You are Dead");
    }

  }
}
