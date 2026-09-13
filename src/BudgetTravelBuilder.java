public class BudgetTravelBuilder implements TravelBuilder{
    private TravelPackage travelPackage;
    public BudgetTravelBuilder(){
        this.travelPackage = new TravelPackage();
    }

    @Override
    public TravelBuilder setDestination(String destination) {
        travelPackage.setDestination(destination);
        return this;
    }
    @Override
    public TravelBuilder setHotel(String hotel) {
        travelPackage.setHotel(hotel);
        return this;
    }
    @Override
    public TravelBuilder setTransport(String transport) {
        travelPackage.setTransport(transport);
        return this;
    }
    @Override
    public TravelBuilder setMeals(String meals) {
        travelPackage.setMeals(meals);
        return this;
    }
    @Override
    public TravelBuilder setActivities(String activities) {
        travelPackage.setActivities(activities);
        return this;
    }
    @Override
    public TravelBuilder setInsurance(String insurance) {
        travelPackage.setInsurance(insurance);
        return this;
    }
    @Override
    public TravelPackage build() {
        return travelPackage;
    }
}