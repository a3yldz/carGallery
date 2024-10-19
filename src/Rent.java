import java.util.Scanner;

public class Rent {
    public void rent(){
        Gallery gallery = new Gallery();
        System.out.println("Enter Car ID: ");
        Scanner sc = new Scanner(System.in);
        int rentID = sc.nextInt();

        System.out.println("Enter rent day: ");
        Scanner dy = new Scanner(System.in);
        int day = sc.nextInt();


        for (Car car: gallery.getCars()){
            if (car.getCarId()== rentID && !car.getIsRent()){
                car.setRent(true);
                System.out.println("Rent successfully " +
                        "Your car is: "+car.getBrand() + " "
                        + car.getModel() + " "
                        + car.getYear()+
                "Pay for choose day: " + (day * car.getRentalFee()) + "TL");
                break;
            }
        }


    }
}
