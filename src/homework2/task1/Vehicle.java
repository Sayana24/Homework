package homework2.task1;

public interface Vehicle {
    public default void start(){
        System.out.println("Vehicle started");
    };
    public default void stop(){
        System.out.println("Vehicle stopped");
    };
    String getFuelType();
}
