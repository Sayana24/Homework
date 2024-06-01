package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[3];

        System.out.println(" Введите три строки:  ");
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            str[i] = scan.next();
            sum += str[i].length();
        }
        for (int i = 0; i < 3; i++) {
            if (str[i].length() < (sum/3))
                System.out.println("Строка, длина которой меньше средней:  " + str[i] + "\tЕе длина: " + str[i].length());
        }
    }
}
