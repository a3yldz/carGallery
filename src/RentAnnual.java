public class RentAnnual implements RentStrategy{
    public void rent(Car car, int duration) {
        car.setRent(true);
        int calculate= ((duration*365) * car.getRentalFee());
        calculate -= (int) (calculate*0.75);
        System.out.println("Annual Rent " +
                "Your car is: " + car.getBrand() + " "
                + car.getModel() + " "
                + car.getYear() +
                "\n Pay for " + duration + " year: " + calculate + "TL");
    }

}
