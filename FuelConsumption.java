public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40; // full tank liters
        double normalPer100km = 8.0;
        // rough road +15% fuel consumption
        double roughPer100km = normalPer100km * 1.15;

        // distance = (total liters / fuel per 100km ) * 100
        double distanceNormal = (tankCapacity / normalPer100km ) *100;
        double distanceRough = (tankCapacity / roughPer100km ) *100;

        System.out.println("Full tank 40L, Normal road distance: "+ distanceNormal + " km");
        System.out.println("Full tank 40L, Rough road distance: "+ distanceRough + " km");
    }
}
