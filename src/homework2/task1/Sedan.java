package homework2.task1;

public class Sedan extends Car {
    private int numberOfDoors;
    private int trunkCapacity;
    private String fuelType;
    private String luxuryLevel;

    @Override
    int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("Sedan started");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public Sedan(int numberOfDoors, int trunkCapacity, String fuelType) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public String getLuxuryLevel() {
        return luxuryLevel;
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

    public void setLuxuryLevel(String luxuryLevel) {
        this.luxuryLevel = luxuryLevel;
    }
}

