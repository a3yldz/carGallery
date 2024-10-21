import java.util.Scanner;

public class AddCar {

    private Gallery gallery;
    public AddCar(Gallery gallery){
        this.gallery=gallery;
    }

    public void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Add Brand: ");
        String brand = in.nextLine();
        System.out.println("Add Model: ");
        String model = in.nextLine();
        System.out.println("Add Year: ");
        int year = in.nextInt();
        in.nextLine();
        System.out.println("Add Segment: ");
        String segment = in.nextLine();
        System.out.println("Add Engine Type: ");
        String type = in.nextLine();
        System.out.println("Add Gear Type: ");
        String gear = in.nextLine();
        System.out.println("Add Fuel Consumption: ");
        int consumption = in.nextInt();
        System.out.println("Add Maximum Seats: ");
        int seats = in.nextInt();
        System.out.println("Add Engine Capacity: ");
        int capacity = in.nextInt();
        System.out.println("Add Door: ");
        int door = in.nextInt();
        System.out.println("Add Rental Fee: ");
        int rentalFee = in.nextInt();
        System.out.println("Add Purchase Fee: ");
        int purchaseFee = in.nextInt();
        in.nextLine();
        System.out.println("Add Color: ");
        String color = in.nextLine();
        System.out.println("Add CarID: ");
        int carID = in.nextInt();
        System.out.println("Add Accident (true/false): ");
        boolean accident = in.nextBoolean();
        System.out.println("Add Is Rent (true/false): ");
        boolean isRent = in.nextBoolean();


        Car newCar = new Car(brand, model, segment, type, gear, consumption, seats, capacity, year, door, rentalFee, purchaseFee, color, carID, accident, isRent);
        gallery.addCar(newCar);

    }
}
