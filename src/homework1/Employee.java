package homework1;

public class Employee {
    private String name;
    private String company;
    private int salary;

    static {
        System.out.println("Добро пожаловать!");
    }

    {
        System.out.println("Ура! У нас новый сотрудник!");
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Employee(String name, String company, int salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.getName() + " работает в " + this.getCompany());
    }
    public void work(String company){
        this.setCompany(company);
        System.out.println(this.getName() + " перевелся в " + company);
    }
    public void toRaiseTheSalary(int addition){
        this.setSalary(this.getSalary() + addition);
        if (addition >= 0){
            System.out.println(this.getName() + " увеличил зарплату до " + this.getSalary());
        }
        else {
            System.out.println(this.getName() + " снизил зарплату до " + this.getSalary());
        }
    }
}
