package homework2.task2;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        ImmutablePerson sam = new ImmutablePerson("Sam", 25, List.of(new String[]{"cycle", "poker"}));
        System.out.println(sam.getName() + " is immutable. He is " + sam.getAge() +
                " and has interest in " + sam.getHobbies());

        MutablePerson john = new MutablePerson("John", 77, List.of(new String[]{"crossword", "painting"}));
        System.out.println(john.getName() + " is mutable. He is " + john.getAge() +
                " and has interest in " + john.getHobbies());
        john.setAge(john.getAge()+1);
        john.setName("John Tailor");
        System.out.println(john.getName() + " is mutable. He is " + john.getAge() +
                " and has interest in " + john.getHobbies());
    }
}
