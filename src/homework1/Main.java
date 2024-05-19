package homework1;
class Dog{
    String name;
    int age;
}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", "Магнит", 480);
        employee.work();
        employee.work("Пятерочка");
        employee.setSalary(500);
        System.out.println(employee.getName() + " имеет зарплату в " + employee.getSalary());
        employee.toRaiseTheSalary(20);
        employee.toRaiseTheSalary(-100);
        employee.work("Магнит");
        employee.setSalary(480);

        Employee newEmployee = new Employee("Василий", "Магнит", 480);
        newEmployee.work();

        Cat cat = new Cat("Мурка", 3);
        cat.voice();

        Cat newCat = new Cat();
        newCat.voice();

        Cat cat1 = new Cat(8, "Тома");
        cat1.snore();

        Dog dog = new Dog();
        dog.age = 10;
        dog.name = "Шарик";
        System.out.println("У нас появился пес по имени " + dog.name + ", ему " + dog.age + " лет.");
    }
}