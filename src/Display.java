public class Display {
    private Gallery gallery;

    public Display(Gallery gallery) {
        this.gallery = gallery;
    }

    public void displayCarInfo(Car car) {
        System.out.println();
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Segment: " + car.getSegment());
        System.out.println("Engine Type: " + car.getEngineType());
        System.out.println("Gear Type: " + car.getGear());
        System.out.println("Fuel Consumption: " + car.getFuelConsumption() + " L/100km");
        System.out.println("Maximum Seats: " + car.getMaximumSeats());
        System.out.println("Engine Capacity: " + car.getEngineCapacity() + " cc");
        System.out.println("Year: " + car.getYear());
        System.out.println("Door: " + car.getDoor());
        System.out.println("Rental Fee: " + car.getRentalFee());
        System.out.println("Purchase Fee: " + car.getPurchaseFee());
        System.out.println("Color: " + car.getColor());
        System.out.println("CarID is: " + car.getCarId());
        System.out.println("Accident: " + (car.getIsAccident()));
        System.out.println("Is Rent: " + (car.getIsRent()));
        System.out.println("-------------------------------");
    }

    public void displayAvailableCars() {
        for (Car car : gallery.getCars()) {
            if (!car.getIsRent()) {
                displayCarInfo(car);
            }
        }
    }

    public void displayAllCars() {
        for (Car car : gallery.getCars()) {
            displayCarInfo(car);
        }
    }

    public void displayUnavailableCars() {
        for (Car car : gallery.getCars()) {
            if (car.getIsRent()) {
                displayCarInfo(car);
            }
        }
    }
}
