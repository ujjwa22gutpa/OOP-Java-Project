package CabBookingProject;
import CabBookingProject.User;

  public class Driver extends User {
    private String vehicle;
    private double rating;

    Driver(String name, Long phoneNum, String vehicle, double rating) {
        super(name, phoneNum);
        if (vehicle == null || vehicle.trim().isEmpty())
            throw new IllegalArgumentException("Please enter the correct vehicle");
        else
            this.vehicle = vehicle;

        if (rating < 0 || rating > 5)
            throw new IllegalArgumentException("Please enter the rating from 0 to 5 only");
        else
            this.rating = rating;
    }

    public String getVehicle() {
        return vehicle;
    }

    public double getRating() {
        return rating;
    }

    void Display() {
        System.out.println(getName() + "  " + getPhoneNum() + " " + getVehicle() + " " + getRating());
    }
}

