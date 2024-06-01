package homework5.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static Stream<Employee> createList(){
        Collection<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иванов Иван", 35, "IT", 85000));
        employees.add(new Employee("Петрова Мария", 25, "IT", 58000));
        employees.add(new Employee("Пак Михаил", 32, "HR", 70000));
        employees.add(new Employee("Борщев Лаврентий", 45, "IT", 75000));
        employees.add(new Employee("Минина Ольга", 55, "HR", 68000));
        employees.add(new Employee("Николаев Петр", 29, "HR", 65000));
        employees.add(new Employee("Семенов Семен", 38, "ADM", 60000));
        return employees.stream();
    }

    public static List<Employee> ageMore30AndSorted(Stream<Employee> stream){
        List<Employee> employeesAgeMore30AndSorted =
                stream.filter(emp -> emp.getAge() > 30)//.peek(System.out::println)
                .sorted(Comparator.comparingInt(Employee::getAge))//.peek(System.out::println)
                .collect(Collectors.toList());
        return employeesAgeMore30AndSorted;
    }

    public static long sumEmloyeeInIT(Stream<Employee> stream){
        return stream.filter(emp -> emp.getDepartment().equals("IT")).count();
    }

    public static Employee highestPaidEmployee(Stream<Employee> stream){
        return stream.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(1).toList().getFirst();
    }

    public static List<String> namesOfHR(Stream<Employee> stream){
        return stream.filter(emp -> emp.getDepartment()
                .equals("HR"))
                .map(Employee::getName)
                .sorted()
                .toList();
    }

    public static double averageSalary(Stream<Employee> stream){
        return stream.map(Employee::getSalary).mapToInt(Integer::intValue).average().orElse(Double.NaN);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stream<Employee> stream = createList();
        System.out.println(" Выберите метод: 1. Найти всех сотрудников старше 30 лет и отсортировать их по возрасту.");
        System.out.println("                 2. Посчитать общее количество сотрудников в отделе \"IT\".");
        System.out.println("                 3. Найти сотрудника с максимальной зарплатой.");
        System.out.println("                 4. Получить список имен всех сотрудников, работающих в отделе \"HR\", и отсортировать их по имени.");
        System.out.println("                 5. Рассчитать среднюю зарплату всех сотрудников.");

        int method = scan.nextInt();

        switch(method) {
            case 1:
                //  Найти всех сотрудников старше 30 лет и отсортировать их по возрасту.
                System.out.println(ageMore30AndSorted(stream));
                break;
            case 2:
                // Посчитать общее количество сотрудников в отделе "IT".
                System.out.println(sumEmloyeeInIT(stream));
                break;
            case 3:
                // Найти сотрудника с максимальной зарплатой.
                System.out.println(highestPaidEmployee(stream));
                break;
            case 4:
                // Получить список имен всех сотрудников, работающих в отделе "HR", и отсортировать их по имени.
                System.out.println(namesOfHR(stream));
                break;
            case 5:
                // Рассчитать среднюю зарплату всех сотрудников.
                System.out.println((int)averageSalary(stream));
                break;
            default:
                System.out.println("Ошибка");
        }

    }
}
