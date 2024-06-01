package homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder doubleStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            doubleStr.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(doubleStr.toString());
    }
}
