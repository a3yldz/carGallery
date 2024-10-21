public class RentDaily implements RentStrategy{

    @Override
    public void rent(Car car, int duration) {
        car.setRent(true);
        System.out.println("Daily Rent " +
                "Your car is: "+car.getBrand() + " "
                + car.getModel() + " "
                + car.getYear()+
                "\n Pay for " + duration+ " day: " + (duration * car.getRentalFee()) + "TL");
    }
}
