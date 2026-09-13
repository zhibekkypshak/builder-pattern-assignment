public interface TravelBuilder {
    TravelBuilder setDestination(String destination);
    TravelBuilder setHotel(String hotel);
    TravelBuilder setTransport(String transport);
    TravelBuilder setMeals(String meals);
    TravelBuilder setActivities(String activities);
    TravelBuilder setInsurance(String insurance);
    TravelPackage build();
}
