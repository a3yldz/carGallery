import java.util.Scanner;

public class Return {
    public void returnCar(){
        Gallery gallery = new Gallery();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the ID of the car");
        int carId=scanner.nextInt();

        for (Car car : gallery.getCars()) {
            if (car.getCarId()==carId && car.getIsRent()) {
                System.out.println("Car ID: "+car.getCarId());
                System.out.println("Car is returning");
                car.setRent(false);
            }
        }

    }
}
