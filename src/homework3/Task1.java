package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[3];

        int max = 0;
        int min = 1000;
        System.out.println(" Введите три строки:  ");

        for (int i = 0; i < 3; i++) {
            str[i] = scan.next();
            if (str[i].length() > max)
                max = str[i].length();
            if (str[i].length() < min)
                min = str[i].length();
        }
        for (int i = 0; i < 3; i++) {
            if (str[i].length() == min)
                System.out.println("Самая короткая строка:  " + str[i] + "\tЕе длина: " + str[i].length());
            if (str[i].length() == max)
                System.out.println("Самая длинная строка:  " + str[i] + "\tЕе длина: " + str[i].length());
        }
    }
}
