package homework4.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static ArrayList<Student> findBestStudents(ArrayList<Student> students){

        System.out.println(students.size());
        ArrayList<Student> bestStudents = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).average(students.get(i)) >= 3.0) {
                students.get(i).setCourse(students.get(i).getCourse() + 1);
                bestStudents.add(students.get(i));
            }
        }
        return bestStudents;
    }
    static void printStudents(List<Student> students, int course){
        System.out.println("На " + course + " курсе обучаются: ");
        for (Student student : students){
            if (student.getCourse() == course){
                System.out.println(student.getName() + "\t" + student.getCourse());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 3, 2, 3, 2, 2);
        students.add(new Student("Иван Иванов    ", 9102, 3,  list1));

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 2,3,3,3,2);
        students.add(new Student("Антон Антонов  ", 9107, 2, list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 4,5,5,5,4);
        students.add(new Student("Илья Ильинов   ", 9102, 1 , list3));

        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 4,3,3,3,4);
        students.add(new Student("Петр Петров    ", 9102, 3, list4));

        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 2,3,3,3,4);
        students.add(new Student("Марина Сергеева", 9102, 3, list5));

        for (Student student : students){
            System.out.println(student.getName() + "\t" + student.getGroup() + "\t" +
                    student.getCourse() + "\t" + student.getValues());
        }

        ArrayList<Student> bestStudents = findBestStudents(students);

        System.out.println("Переведены на следующий курс:");

        for (Student student : bestStudents){
            System.out.println(student.getName() + "\t" + student.getGroup() + "\t" +
                    student.getCourse() + "\t" + student.getValues());
        }

        printStudents(bestStudents, 4);
    }
}
