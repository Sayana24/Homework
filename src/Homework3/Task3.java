package Homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[3];

        System.out.println(" Введите три строки:  ");
        for (int i = 0; i < 3; i++) {
            str[i] = scan.next();
        }

        for (int i = 0; i < 3; i++) {
            boolean flag = true;
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = j+1; k < str[i].length(); k++) {
                    if (str[i].charAt(j) == str[i].charAt(k)) {
                        flag = false;
                        j = str[i].length();
                        break;
                    }
                }
            }
            System.out.println(flag);
            if (flag){
                System.out.println(str[i]);
                i = 3;
            }
        }
    }
}
