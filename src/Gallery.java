import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private List<Car> cars;

    public Gallery() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", "C", "Hybrid", "Automatic", 5, 5, 1800, 2023, 4, 1500, 15, "White",1, false, true));
        cars.add(new Car("Honda", "Civic", "C", "Petrol", "Manual", 6, 5, 1600, 2022, 4, 1000, 2, "Black", 2,false, true));
        cars.add(new Car("Ford", "Focus", "C", "Diesel", "Manual", 7, 5, 2000, 2021, 4, 850, 9, "Red",3, true, true));
        cars.add(new Car("Mercedes", "C-Class", "Luxury", "Petrol", "Manual", 8, 5, 2500, 2023, 4, 850, 9, "Silver",4, false, false));
        cars.add(new Car("BMW", "3 Series", "Luxury", "Diesel", "Manual", 5, 5, 2200, 2020, 4, 850, 1, "Blue",5, false, true));
        cars.add(new Car("Nissan", "Juke", "D", "Hybrid", "Automatic", 5, 5, 2000, 2012, 4, 1500,15,"White",6, false, true));
        cars.add(new Car("Hyundai", "Elantra", "C", "Petrol", "Automatic", 7, 5, 1600, 2023, 4,1500,15, "Gray",7, false, true));
        cars.add(new Car("Kia", "Forte", "C", "Diesel", "Automatic", 6, 5, 1500, 2021, 4, 1500,15,"Orange", 8,false, false));
        cars.add(new Car("Chevrolet", "Malibu", "D", "Petrol","Automatic", 7, 5, 2000, 2020, 4, 1500,15,"Purple",9, false, true));
        cars.add(new Car("Volkswagen", "Golf", "C", "Petrol", "Manual", 6, 5, 1800, 2021, 4, 870, 10, "Green",10, false, true));
        cars.add(new Car("Volkswagen", "Passat", "D", "Diesel", "Manual", 6, 5, 1800, 2023, 4, 1200, 15, "Black",11, false, true));

    }

    public List<Car> getCars() {
        return cars;
    }
}
