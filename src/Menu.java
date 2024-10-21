import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Gallery gallery = new Gallery();
        Display display = new Display(gallery);
        Rent rent1 = new Rent();
        Buy buy1 = new Buy();
        Return returnCar = new Return();

        System.out.println("**** Welcome to YILDIZ Gallery ****");
        star();
        System.out.println();

        do {
            System.out.println("1. List Available Cars");
            System.out.println("2. List All Cars");
            System.out.println("3. List Unavailable Cars");
            System.out.println("4. Rent a Car");
            System.out.println("5. Buy a Car");
            System.out.println("6. Return");
            System.out.println("7. Add a Car");
            System.out.println("8. Delete a Car");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Displaying Available Cars...");
                    star();
                    display.displayAvailableCars();
                    star();
                    break;
                case 2:
                    System.out.println("Displaying All Cars...");
                    star();
                    display.displayAllCars();
                    star();
                    break;
                case 3:
                    System.out.println("Displaying Unavailable Cars...");
                    star();
                    display.displayUnavailableCars();
                    star();
                    break;
                case 4:
                    System.out.println("Rent a Car...");
                    star();
                    display.displayAvailableCars();
                    System.out.println("Choose rental type (1: Daily, 2: Monthly, 3: Annual): ");
                    int rentalType = scanner.nextInt();

                    switch (rentalType) {
                        case 1:
                            rent1.setRentStrategy(new RentDaily());
                            break;
                        case 2:
                            rent1.setRentStrategy(new RentMonthly());
                            break;
                        case 3:
                            rent1.setRentStrategy(new RentAnnual());
                            break;
                        default:
                            System.out.println("Invalid choice. Defaulting to daily rent.");
                            rent1.setRentStrategy(new RentDaily());
                    }
                    rent1.rent();
                    break;

                case 5:
                    System.out.println("Buy a Car...");
                    buy1.buy();
                    break;
                case 6:
                    System.out.println("Return...");
                    returnCar.returnCar();
                    break;
                case 7:
                    System.out.println("Add a Car...");
                    AddCar addCar = new AddCar(gallery);
                    addCar.add();
                    break;

                case 8:
                    System.out.println("Delete a Car...");
                    break;
                case 9:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            star();
            System.out.println();
        } while (choice != 9);

        scanner.close();
    }


    public void star(){
        for (int i=0;i<33;i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }

}
