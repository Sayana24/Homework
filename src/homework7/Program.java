package homework7;

public class Program {

    static ExOfRunnable exOfRunnable;
    public static void main(String[] args) throws InterruptedException {


        exOfRunnable = new ExOfRunnable();
        System.out.println("Главный поток запущен...");

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            int n = (int) (Math.random()*3);
            System.out.println(n + "  покупателей в " + i + "-ю секунду");
            for (int j = 0; j < n; j++) {
                Thread myThread = new Thread(exOfRunnable);
                myThread.start();
            }
        }
        System.out.println("Главный поток завершён...");

    }
}
