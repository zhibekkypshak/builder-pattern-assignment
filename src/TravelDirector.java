public class TravelDirector {
    public TravelPackage createBudgetTrip(TravelBuilder builder) {
        return builder
                .setDestination("Turkey")
                .setHotel("3-star hotel")
                .setTransport("Economy flight")
                .setMeals("Breakfast included")
                .setActivities("Group city tour")
                .setInsurance("Basic insurance")
                .build();
    }
    public TravelPackage createLuxuryTrip(TravelBuilder builder) {
        return builder
                .setDestination("Turkey")
                .setHotel("5-star luxury hotel")
                .setTransport("Business class flight")
                .setMeals("All Inclusive")
                .setActivities("Private yacht tour")
                .setInsurance("Premium insurance")
                .build();
    }
}
