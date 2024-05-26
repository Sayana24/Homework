package homework4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {


        LinkedList<String> countries = new LinkedList<>();

        countries.addFirst("Russia");
        countries.addFirst("China");
        countries.addLast("Poland");
        countries.addLast("France");
        System.out.println(countries);

        countries.pollFirst();
        System.out.println(countries);

        countries.pollLast();
        System.out.println(countries);

        System.out.println(countries.getFirst());

        System.out.println(countries.getLast());










    }
}
