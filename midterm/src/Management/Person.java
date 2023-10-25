package Management;

public abstract class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") ";
    }

    abstract void birthday(); //print: Happy Birthday, + name;
    abstract String performTask();
}
