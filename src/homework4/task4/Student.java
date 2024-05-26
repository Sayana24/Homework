package homework4.task4;

import java.util.ArrayList;

public class Student {
    private String name;
    private int group;
    private int course;
    ArrayList<Integer> values;

    public Student(String name, int group, int course, ArrayList<Integer> values) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
    }

    public double average(Student student){
        double sum = 0;

        for(int i = 0; i < student.getValues().size(); i++) {
            sum += student.getValues().get(i);
        }
        return sum/student.getValues().size();
    }
}
