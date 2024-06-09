package homework7;

public class UseBusket {
    static void takeBusket(){
        System.out.println(Thread.currentThread().getName() + " взял корзину");
    };
    static void putGoodsToBusket(){
        System.out.println(Thread.currentThread().getName() + " положил товар в корзину");
    }
}
