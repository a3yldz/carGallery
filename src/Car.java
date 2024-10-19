public class Car {
    private String brand;
    private String model;
    private String segment;
    private String engineType;
    private String gear;
    private int fuelConsumption;
    private int maximumSeats;
    private int engineCapacity;
    private int year;
    private int door;
    private int rentalFee;
    private int purchaseFee;
    private String color;
    private int carId;
    private boolean accident;
    private boolean isRent;

    public Car(String brand, String model, String segment, String engineType, String gear, int fuelConsumption,
               int maximumSeats, int engineCapacity, int year, int door, int rentalFee, int purchaseFee, String color, int carId, boolean accident, boolean isRent) {
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.engineType = engineType;
        this.gear = gear;
        this.fuelConsumption = fuelConsumption;
        this.maximumSeats = maximumSeats;
        this.engineCapacity = engineCapacity;
        this.year = year;
        this.door = door;
        this.rentalFee = rentalFee;
        this.purchaseFee = purchaseFee;
        this.color = color;
        this.carId = carId;
        this.accident = accident;
        this.isRent = isRent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getGear() {
        return gear;
    }
    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaximumSeats() {
        return maximumSeats;
    }

    public void setMaximumSeats(int maximumSeats) {
        this.maximumSeats = maximumSeats;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(int rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getPurchaseFee() {
        return purchaseFee;
    }
    public void setPurchaseFee(int purchaseFee) {
        this.purchaseFee = purchaseFee;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }


    public boolean getIsAccident() {
        return accident;
    }

    public void setAccident(boolean accident) {
        this.accident = accident;
    }

    public boolean getIsRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }
}
