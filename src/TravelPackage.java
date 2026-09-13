public class TravelPackage {
    private String destination;
    private String hotel;
    private String transport;
    private String meals;
    private String activities;
    private String insurance;

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    public void setTransport(String transport) {
        this.transport = transport;
    }
    public void setMeals(String meals) {
        this.meals = meals;
    }
    public void setActivities(String activities) {
        this.activities = activities;
    }
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
    public boolean isValid() {
        return destination != null &&
                hotel != null &&
                transport != null;
    }

    @Override
    public String toString() {
        return "Travel Package:" +
                "\nDestination: " + destination +
                "\nHotel: " + hotel +
                "\nTransport: " + transport +
                "\nMeals: " + meals +
                "\nActivities: " + activities +
                "\nInsurance: " + insurance;
    }
}