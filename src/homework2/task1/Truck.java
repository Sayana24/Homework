package homework2.task1;

public class Truck extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private String fuelType;
    private  int maxLoadCapacity;

    @Override
    int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public Truck(int numberOfDoors, int trunkCapacity, String fuelType, int maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }
}
