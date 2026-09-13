# Travel Package Builder Pattern
## Description
This project demonstrates the Builder Design Pattern using a travel package system.
The application creates different travel package configurations, including budget and luxury travel packages.

## Builder Pattern Structure
- `TravelPackage` - Product that represents a travel package.
- `TravelBuilder` - Builder interface that defines the construction steps.
- `BudgetTravelBuilder` - Concrete Builder for creating travel packages.
- `LuxuryTravelBuilder` - Concrete Builder for creating travel packages.
- `TravelDirector` - Director that defines budget and luxury travel configurations.
- `Main` - Client that demonstrates the Builder Pattern.

## Travel Package Options
A travel package can contain:
- Destination
- Hotel
- Transport
- Meals
- Activities
- Insurance
The project demonstrates two configurations:

### Budget Travel Package
Uses a 3-star hotel, economy flight, breakfast, group city tour, and basic insurance.

### Luxury Travel Package
Uses a 5-star luxury hotel, business class flight, All Inclusive meals, private yacht tour, and premium insurance.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 or later is configured.
3. Open `Main.java`.
4. Run the `main()` method.
5. The budget and luxury travel packages will be displayed in the console.

## Technologies
- Java
- IntelliJ IDEA
- Git
- GitHub