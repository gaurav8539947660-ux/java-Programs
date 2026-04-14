class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }
}

public class Q14_Parking_Lot_System {
    int carSpots = 2;
    int bikeSpots = 2;

    void park(Vehicle v) {
        if (v.type.equals("Car") && carSpots > 0) {
            carSpots--;
            System.out.println("Car parked");
        } else if (v.type.equals("Bike") && bikeSpots > 0) {
            bikeSpots--;
            System.out.println("Bike parked");
        } else {
            System.out.println("No space");
        }
    }

    public static void main(String[] args) {
        Q14_Parking_Lot_System p = new Q14_Parking_Lot_System();
        p.park(new Vehicle("Car"));
        p.park(new Vehicle("Bike"));
    }
}
