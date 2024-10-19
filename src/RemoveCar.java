import java.util.Scanner;

public class RemoveCar {
    private Gallery gallery;
    public void Remove(Gallery gallery) {
        this.gallery = gallery;
    }

    public void deleteCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car ID for REMOVE: ");
        int carID = sc.nextInt();
        gallery.removeCar(carID);

    }
}
