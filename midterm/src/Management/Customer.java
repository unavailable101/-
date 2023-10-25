package Management;
//extend person
public class Customer extends Person {
    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    void birthday() {
        setAge(getAge()+1);
        System.out.println("Happy birthday, " + getName() + "!");
    }

    @Override
    String performTask() {
        return getName() + " is browsing through "; //ambot, ako gi set lng to string kay diko ka call sa toString
    }

    String speak(Employee e){
        if (e instanceof Developer && getAge() > ((Developer)e).getAge() && ((Developer)e).getProjectManager() != null){
            return "Can I see your manager " + ((Developer) e).getProjectManager().getName() + "?";
        }
        return "Oh, hello, " + e.getName() + ". Can you assist me?";
    }

}
