package homework6.task1;

import homework6.task1.exception.WrongLoginException;
import homework6.task1.exception.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static boolean enter(String login, String password, String confirmPassword)
        throws WrongLoginException, WrongPasswordException {
        boolean answer = false;

        if (login.length() > 19 )
            throw new WrongLoginException("Исключение. Логин должен быть меньше 20 символов");
        if (login.contains(" "))
            throw new WrongLoginException("Исключение. Логин не должен содержать пробелы");

        if (password.length() > 19)
            throw new WrongPasswordException("Исключение. Пароль должен быть меньше 20 символов");

        if (password.contains(" "))
            throw new WrongPasswordException("Исключение. Пароль не должен содержать пробелы");

        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Исключение. Пароль не подтвержден");

        if (!password.matches(".*\\d.*"))
            throw new WrongPasswordException("Исключение. Пароль должен содержать хотя бы одну цифру");
        answer = true;
        return answer;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Повторите пароль: ");
        String confirmPassword = scanner.nextLine();

        try{
            System.out.println(enter(login, password, confirmPassword));
        }
        catch(WrongLoginException | WrongPasswordException e){

            System.out.println(e.getMessage());

        }

    }
}
