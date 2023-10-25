package Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();
        String input;
        String name;
        String name2;
        int age;
        double salary;
        while (true){
            System.out.print("Enter person type: ");
            input = sc.nextLine();
            if (input.equals("DONE")) {
                break;
            }
            switch (input.charAt(0)) {
                case 'c':
                    System.out.print("Enter customer name: ");
                    name = sc.nextLine();
                    System.out.print("Enter customer age: ");
                    age = sc.nextInt();
                    // TODO add new Customer in persons here
                    persons.add(new Customer(name, age));
                    break;
                case 'e':
                    System.out.print("Enter employee name: ");
                    name = sc.nextLine();
                    System.out.print("Enter employee age: ");
                    age = sc.nextInt();
                    System.out.print("Enter employee salary: ");
                    salary = sc.nextDouble();
                    // TODO add new Employee in persons here
                    persons.add(new Employee(name, age, salary));
                    break;
                // TODO add more cases for other Person subclasses here
                case 'd': //developer
                    System.out.print("Enter developer name: ");
                    name = sc.nextLine();
                    System.out.print("Enter developer age: ");
                    age = sc.nextInt();
                    System.out.print("Enter developer salary: ");
                    salary = sc.nextDouble();
                    // TODO add new Developer in persons here
                    persons.add(new Developer(name, age, salary));
                    break;
                case 'm': //manager
                    System.out.print("Enter manager name: ");
                    name = sc.nextLine();
                    System.out.print("Enter manager age: ");
                    age = sc.nextInt();
                    System.out.print("Enter manager salary: ");
                    salary = sc.nextDouble();
                    // TODO add new Manager in persons here
                    persons.add(new Manager(name, age, salary));
                    break;
            }
            sc.nextLine();
        }
        while (true) {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            int ctr = 0;
            switch (input) {
                case "DONE":
                    return;
                case "Birthday": //done
                    System.out.print("Whose birthday? ");
                    name = sc.nextLine();
                    // TODO find name and call birthday
                    boolean waley = true;
                    for (Person p : persons){
                        if (p.getName().equals(name)){
                            waley = false;
                            p.birthday();
                        }
                    }
                    if (waley) System.out.println("Invalid input");
                    break;
                case "Assign PM": //later naka, i don't like u //done
                    System.out.print("Select developer: ");
                    name = sc.nextLine();
                    System.out.print("Select manager: ");
                    name2 = sc.nextLine();
                    // TODO find developer "name" and manager "name2" and assign PM
                    boolean wehD = true;
                    boolean wehM = true;
                    for (Person p : persons){
                        if (p.getName().equals(name) && p instanceof Developer){
                            wehD = false;
                            for (Person p1 : persons){
                                if (p1.getName().equals(name2) && p1 instanceof Manager){
                                    wehM = false;
                                    ((Developer)p).setProjectManager((Manager)p1);
                                }
                                if (name2.equals("NULL")) {
                                    wehM = false;
                                    ((Developer) p).removePM();
                                }
                            }
                        }
                    }
                    if (wehM || wehD) System.out.println("Invalid input"); //dzah perpek naka oi
                    break;
                // TODO add more action cases here
                case "Perform Task": //6 //done
                    for (Person p : persons){
                        System.out.println(p.performTask());
                    }
                    break;
                case "Give Raise": //9 //done
                    System.out.print("Enter manager: ");
                    name = sc.nextLine();
                    System.out.print("Enter employee: ");
                    name2 = sc.nextLine();
                    System.out.print("Enter increase: ");
                    double increase = sc.nextDouble();
                    sc.nextLine();
                    // TODO find manager "name" and employee "name2" and give raise
                    boolean diliM = true;
                    boolean diliE = true;
                    for (Person p : persons){
                        if (p.getName().equals(name) && p instanceof Manager){ //manager
                            diliM = false;
                            for (Person p1 : persons){
                                if (p1.getName().equals(name2) && p1 instanceof Employee){ //employee
                                    diliE = false;
                                    ((Manager)p).giveRaise((Employee) p1, increase);
                                }
                            }
                        }
                    }
                    if (diliE || diliM ) System.out.println("Invalid input");
                    break;
                case "Customer Speak": //7 //sa dev ray prob ani
                    System.out.print("Select customer: ");
                    name = sc.nextLine();
                    System.out.print("Select employee: ");
                    name2 = sc.nextLine();
                    //TODO find customer "name" and employee "name2" and speak
                    boolean walaP = true;
                    boolean walaE = true;
                    for (Person p : persons){
                        if (p.getName().equals(name) && p instanceof Customer){
                            for (Person p1 : persons){
                                if (p1.getName().equals(name2) && p1 instanceof Employee){
                                    System.out.println(((Customer)p).speak((Employee)p1));
                                    walaE = false;
                                    break;
                                }
                            }
                        walaP = false;
                        }
                    }//babalik ako sa inyu lahat, may nullexcept
                    if (walaP || walaE) System.out.println("Invalid input");
                    break;
                case "Person List": //doions kayo
                    ctr = 0;
                    for (Person p : persons){
                        System.out.println(p.toString());
                        ctr++;
                    }
                    if (ctr == 0){
                        System.out.println("No persons in list");
                    } else {
                        System.out.println("Total Count: " + ctr);
                    }
                    break;
                case "Developer List": // 3 //ikaw lng pala may nullexception, gwapa!
                    ctr = 0;
                    for (Person p : persons){
                        if (p instanceof Developer){
                            System.out.println(((Developer)p).toString());
                            ctr++;
                        }
                    }
                    if (ctr == 0){
                        System.out.println("No developers in list");
                    } else {
                        System.out.println("Total Count: " + ctr);
                    }
                    break;
                case "Manager List": // 2 //done
                    ctr = 0;
                    for (Person p : persons){
                        if (p instanceof Manager){
                            System.out.println(((Manager)p).toString());
                            ctr++;
                        }
                    }
                    if (ctr == 0){
                        System.out.println("No managers in list");
                    } else {
                        System.out.println("Total Count: " + ctr);
                    }
                    break;
                case "Employee List": //1 //done
                    ctr = 0;
                    for (Person p : persons){
                        if (p instanceof Employee){
                            System.out.println(((Employee)p).toString());
                            ctr++;
                        }
                    }
                    if (ctr == 0){
                        System.out.println("No employees in list");
                    } else {
                        System.out.println("Total Count: " + ctr);
                    }
                    break;
                case "Customer List": //8 //done
                    ctr = 0;
                    for (Person p : persons){
                        if (p instanceof Customer){
                            System.out.println(((Customer)p).toString());
                            ctr++;
                        }
                    }
                    if (ctr == 0){
                        System.out.println("No customers in list");
                    } else {
                        System.out.println("Total Count: " + ctr);
                    }
                    break;
                default:
                    System.out.println("Invalid action");
            }
        }
    }

}