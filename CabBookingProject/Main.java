package CabBookingProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many Drivers are there...");

        int size = sc.nextInt();
        sc.nextLine();

        Driver[] drivers = new Driver[size];

        for (int i = 0; i < drivers.length;) {

            try {

                System.out.println("Enter the name");
                String name = sc.nextLine();

                System.out.println("Enter the Phone Number");
                long phoneNum = sc.nextLong();
                sc.nextLine();

                System.out.println("Enter Vehicle Name");
                String vehicle = sc.nextLine();

                System.out.println("Enter Rating");
                double rating = sc.nextDouble();
                sc.nextLine();

                drivers[i] = new Driver(name, phoneNum, vehicle, rating);

                i++;

            }

            catch (Exception e) {

                System.out.println(e.getMessage());

            }

        }

        System.out.println("\nDriver Details:\n");

        for (int i = 0; i < drivers.length; i++) {

            if (drivers[i] != null)

                drivers[i].Display();

        }

    }

}