import java.util.Scanner;

public class Buy {
        public void buy(){
            Gallery gallery = new Gallery();
            Display display = new Display(gallery);
            System.out.println("Enter Car ID: ");
            Scanner sc = new Scanner(System.in);
            int rentID = sc.nextInt();

            for (Car car: gallery.getCars()){
                if (car.getCarId()== rentID){
                    display.displayCarInfo(car);
                    if (car.getIsAccident()){
                        System.out.println("Are you sure you want to buy this car? (Y/N)");
                        String answer = sc.next();

                        if (answer.equals("Y") || answer.equals("y")){
                            System.out.println("Buy this car successfully! "+
                                    "\n"+car.getPurchaseFee()+"00000 TL");
                        }
                        if (answer.equals("N") || answer.equals("n")) {
                            break;
                        }
                    }
                    else {
                        System.out.println("Buy this car successfully! "+ car.getPurchaseFee()+"00000 TL");
                    }
                }
            }


    }

}
