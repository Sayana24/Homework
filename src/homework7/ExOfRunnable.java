package homework7;

import java.util.ArrayList;
import java.util.List;

public class ExOfRunnable implements Runnable{
    static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product("Ручка синяя", 50.00));
        products.add(new Product("Карандаш", 30.00));
        products.add(new Product("Ластик", 40.00));
        products.add(new Product("Ручка красная", 45.00));
        products.add(new Product("Ручка зеленая", 60.00));
    }

    public void run()
    {
        Buyer.enterToMarket();
        List<Product> busket = new ArrayList<>();
        UseBusket.takeBusket();

        int n = (int) (Math.random()*4 + 1);
        System.out.println(n + " товаров выберет " + Thread.currentThread().getName());

        for (int i = 0; i < n; i++) {
            Buyer.chooseGoods();
            int index = (int) (Math.random()*5);
            busket.add(products.get(index));
            try {
                Thread.sleep((int) (Math.random()*1500 + 500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        UseBusket.putGoodsToBusket();
        Buyer.goOut();
        busket.stream().map((s) -> s.getName() + " " + s.getPrice())
                .forEach((s) -> System.out.println(Thread.currentThread().getName() + "  " + s));
    }
}
