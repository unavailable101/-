package Management;

public class Developer extends Employee {
    Manager projectManager; //sayo lang ang problema! ang ganda mo talaguh

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
        this.projectManager = null;
    }

    public Manager getProjectManager() {
        return projectManager;
    }

    protected void setProjectManager(Manager projectManager) {
        //The setter must only set the project manager
        // when there is none, otherwise output name
        // " already has a manager".// idk if sakto bha akong gi buhat

        if (this.projectManager == null) { //will look into it if sayop
            this.projectManager = projectManager;
        } else {
            System.out.println(getName() + " already has a manager");
        }
    }

    public void removePM() {
        // it unassigns the developer's project manager. (?) i really don't know
        this.projectManager = null;
    }
    //wa pa ni nako gi buhat
    //When a Developer has his birthday, the projectManager,
    // if any, must also give him a raise amounting to 5%
    // of the Developer's current salary. This must use the getter
    // method of the salary; if there is no project manager,
    // the Developer would not get a raise.


    @Override
    void birthday() {
        if (projectManager != null ) {
            //Developer e = new Developer(getName(), getAge(), getSalary());
            projectManager.giveRaise(this, getSalary() * 0.05);
        }
        super.birthday();
    }

    @Override
    String performTask() {
        return getName() + " is coding";
    }

    @Override
    public String toString() {
        if (this.projectManager != null ) return super.toString() + " [" + projectManager.getName() + "]";
        return super.toString();
    }
}
