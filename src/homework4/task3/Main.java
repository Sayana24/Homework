package homework4.task3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Sam", 20));
        people.add(new Person("Ann", 25));
        people.add(new Person("Anton", 24));

        for (Person person : people) {
            System.out.println(person);
        }

        for (Person person : people) {
            System.out.println(person.getName() + "  " + person.getAge());
        }
        System.out.println("---------------------------------");

        for (Person person : people) {
            people.remove(person);
            break;
        }

        for (Person person : people) {
            System.out.println(person.getName() + "  " + person.getAge());
        }
        System.out.println("---------------------------------");

        Iterator<Person> iterator = people.iterator();
        if(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        for (Person person : people) {
            System.out.println(person.getName() + "  " + person.getAge());
        }

    }
}
