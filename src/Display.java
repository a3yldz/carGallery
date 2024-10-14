public class Display {
    public void displayCarInfo(Car car) {
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
        System.out.println("Color: " + car.getColor());
        System.out.println("Accident: " + (car.isAccident() ? "Yes" : "No"));
    }
}
