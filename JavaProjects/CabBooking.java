package JavaProjects;
abstract class Ride {
    String pickup;
    String drop;

    Ride(String pickup, String drop) {
        this.pickup = pickup;
        this.drop = drop;
    }

    abstract Double money();

    void print(String cabType) {
        System.out.println(cabType);
    }

    void print(int money, String cabType) {
        System.out.println("cab type:" + cabType + " " + money);
    }
}

class Car extends Ride {
    Car(String pickup, String drop) {
        super(pickup, drop);
    }

    @Override
    Double money() {
        // TODO Auto-generated method stub
        return 300.0;
    }
}

class Sedan extends Ride {
    Sedan(String pickup, String drop) {
        super(pickup, drop);
    }

    @Override
    Double money() {
        // TODO Auto-generated method stub
        return 500.0;
    }
}

class Bike extends Ride {
    Bike(String pickup, String drop) {
        super(pickup, drop);
    }

    @Override
    Double money() {
        // TODO Auto-generated method stub
        return 200.0;
    }
}

public class CabBooking {
    public static void main(String[] args) {
        Ride r = new Car("A", "B");
        System.out.println(r.money());
        r.print("Car");
        r = new Sedan("A", "B");
        System.out.println(r.money());
        r.print(500, "Sedan");
        r = new Bike("A", "B");
        System.out.println(r.money());
        r.print("Bike");


         System.out.println(r.money());
          System.out.println(r.money());
           System.out.println(r.money());
           r=new Car("A", "B");
           System.out.println(r.money());

    }
}
