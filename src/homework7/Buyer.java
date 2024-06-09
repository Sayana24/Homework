package homework7;

public class Buyer {

    static void enterToMarket(){
        System.out.println(Thread.currentThread().getName() + " зашел в магазин");
    };

    static void chooseGoods(){
        System.out.println(Thread.currentThread().getName() + " выбирает товар");
    };

    static void goOut(){
        System.out.println(Thread.currentThread().getName() + " выходит из магазина");
    };
}
