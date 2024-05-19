package homework2.task1;

public abstract class Car implements Vehicle {
    abstract int getNumberOfDoors();
    abstract int getTrunkCapacity();

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
