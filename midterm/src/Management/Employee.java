package Management;

public class Employee extends Person{
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void birthday() {
        setAge(getAge()+1);
        System.out.println("Happy birthday, " + getName() + "!");
    }

    @Override
    String performTask() {
        return getName() + " is working";
    }
    //Whenever an Employee is printed,
    // it would also have its salary listed after,
    // i.e., "name (age) - salary", and there is no particular
    // formatting for the salary's decimal places.


    @Override
    public String toString() {
        return getName() + " (" + getAge() + ") - " + salary;
    }
}
