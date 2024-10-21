import java.util.Scanner;

public class Rent {
    private RentStrategy rentStrategy;

    public void setRentStrategy(RentStrategy rentStrategy) {
        this.rentStrategy = rentStrategy;
    }

    public void rent(){
        Gallery gallery = new Gallery();
        System.out.println("Enter Car ID: ");
        Scanner sc = new Scanner(System.in);
        int rentID = sc.nextInt();

        System.out.println("Enter rental duration (days/years/months): ");
        int duration = sc.nextInt();


        for (Car car : gallery.getCars()) {
            if (car.getCarId() == rentID && !car.getIsRent()) {
                rentStrategy.rent(car, duration);
                break;
            }
        }



    }
}
