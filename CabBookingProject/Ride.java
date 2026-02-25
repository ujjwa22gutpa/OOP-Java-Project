package CabBookingProject;

import java.io.IOException;

abstract class Ride {
       private String pickUp;
       private String Drop;

       Ride(String pickUp , String Drop){
          if(pickUp == null || pickUp.trim().isEmpty() || Drop == null || Drop.trim().isEmpty()){
            throw new IllegalArgumentException("please enter the valid locations");
          }
          else{
            this.Drop=Drop;
            this.pickUp=pickUp;
          }
       }

     abstract double calculateFare(int distance);    
} 

class Car extends Ride{
    Car(String pickUp , String Drop){
        super(pickUp, Drop);
    }
   
     @Override
    double calculateFare(int distance){
        return distance*6.0 ;
    }
}

class Bike extends Ride{
    Bike(String pickUp , String Drop){
        super(pickUp, Drop);
    }
   
     @Override
    double calculateFare(int distance){
        return distance*3.0 ;
    }
}

class SUV extends Ride{
    SUV(String pickUp , String Drop){
        super(pickUp, Drop);
    }
   
     @Override
    double calculateFare(int distance){
        return distance*9.0 ;
    }
}