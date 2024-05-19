package homework1;

public class Cat {
    private String name;
    private int age;


    public Cat() {
        System.out.println("Поступил безымянный кот");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Поступил(a) кот/кошка по имени " + name + " ему/ей " + age + " лет");
    }

    public Cat(int age, String name) {
        this.name = name;
        this.age = age;
        System.out.println("Поступил(a) кот/кошка по имени " + name + " ему/ей " + age + " лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void voice(){
        System.out.println("Мяу-мяу");
    }

    public void snore(){
        System.out.println("Муррррр");
    }
}
