package homework8;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, оканчивающееся на 5. Возведем его в квадрат");
        long n = sc.nextInt();
        System.out.println((n/10 * (n/10 + 1)) * 100 + 25);
    }
}
