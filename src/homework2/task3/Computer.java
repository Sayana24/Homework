package homework2.task3;

public class Computer {

    public static  class Processor{
        String model;

        String getDetails(){
            System.out.println(" Model:  " + model + " from static class");
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
    private class RAM{
        int size;
        int getDetails(){
            System.out.println(" Size:  " + size + " from class RAM");
            return size;
        }
        RAM(int size){
            this.size = size;
        }
    }

    Computer(){};

    public void start(){
        RAM ram = new RAM(4);
        ram.getDetails();
        System.out.println("Computer is starting");
    }

}

