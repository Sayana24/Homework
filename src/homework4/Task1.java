package homework4;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Russia");
        countries.add("USA");
        countries.add("France");
        System.out.println(countries);

        countries.set(1, "Mongolia");
        System.out.println(countries);

        countries.remove(1);
        System.out.println(countries);

        countries.remove("Russia");
        System.out.println(countries);

        countries.add("USA");
        countries.add("Russia");
        countries.add("Mongolia");
        System.out.println(countries);

        System.out.println(countries.indexOf("Mongolia"));

        System.out.println(countries.indexOf("China"));

        System.out.println(countries.contains("Russia"));

        System.out.println(countries.contains("China"));

    }
}
