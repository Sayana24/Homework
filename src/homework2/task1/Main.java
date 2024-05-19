package homework2.task1;

public class Main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(5,400, "petrol");
        sedan1.start();
        sedan1.setLuxuryLevel("lux");
        sedan1.stop();
        System.out.println("Sedan: " + "numberOfDoors - " + sedan1.getNumberOfDoors() +
                ", \n trunkCapacity - " + sedan1.getTrunkCapacity() +
                ", \n fuelType - " + sedan1.getFuelType() +
                ", \n luxuryLevel - " + sedan1.getLuxuryLevel());

        Truck truck1 = new Truck(2,1000, "diesel", 5000);
        truck1.start();
        truck1.stop();
        System.out.println("Truck: " + "numberOfDoors - " + truck1.getNumberOfDoors() +
                ", \n trunkCapacity - " + truck1.getTrunkCapacity() +
                ", \n fuelType - " + truck1.getFuelType() +
                ", \n maxLoadCapacity - " + truck1.getMaxLoadCapacity());

    }
}
