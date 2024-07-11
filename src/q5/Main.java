package q5;
 class Employee {
    private String name;
    private int age;
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
}
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Lohitha");
        employee.setAge(21);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
    }
}