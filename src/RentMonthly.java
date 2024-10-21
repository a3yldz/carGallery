public class RentMonthly implements RentStrategy{
    public void rent(Car car, int duration) {
        car.setRent(true);
        int calculate= ((duration*31) * car.getRentalFee());
        calculate -= (int) (calculate*0.15);

        System.out.println("Monthly Rent " +
                "Your car is: "+car.getBrand() + " "
                + car.getModel() + " "
                + car.getYear()+
                "\n Pay for " + duration+ " month: " + calculate + "TL");
    }

}
