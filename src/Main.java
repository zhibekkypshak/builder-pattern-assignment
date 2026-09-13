public class Main {

    public static void main(String[] args) {
        TravelDirector director = new TravelDirector();
        TravelBuilder budgetBuilder = new BudgetTravelBuilder();
        TravelPackage budgetTrip = director.createBudgetTrip(budgetBuilder);
        System.out.println("=== BUDGET TRAVEL PACKAGE ===");
        System.out.println(budgetTrip);
        System.out.println();
        TravelBuilder luxuryBuilder = new LuxuryTravelBuilder();
        TravelPackage luxuryTrip = director.createLuxuryTrip(luxuryBuilder);
        System.out.println("=== LUXURY TRAVEL PACKAGE ===");
        System.out.println(luxuryTrip);
    }
}