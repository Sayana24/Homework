package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();

        Computer.Processor processor = new Computer.Processor();
        processor.setModel("Intel");
        processor.getDetails();

    }
}
