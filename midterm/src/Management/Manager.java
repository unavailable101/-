package Management;

public class Manager extends Employee{
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void giveRaise(Employee e, double increase){
        //If the Employee in the argument is the Manager itself,
        // then only the first one shall apply. //idk if ok nani

        // The said method must check the increase
        // for validation such that it would not
        // process negative values and shall
        // instead print "Invalid increase". //ok nani

        if (increase < 0) System.out.println("Invalid increase");
        else {
            if (getName().equals(e.getName())) {
                e.setSalary(e.getSalary() + increase);
            } else {
                e.setSalary(e.getSalary() + increase);
                setSalary(getSalary() + (increase / 2.0)); //manager
            }
        }
    }

    @Override
    public String toString() {
        return "Mgr. " + super.toString();
    }
}
