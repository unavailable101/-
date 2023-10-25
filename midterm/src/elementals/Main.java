package elementals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        List<Alloy> alloys = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter element/alloy: ");
            input = sc.nextLine();
            switch (input) {
                case "Copper":
                    elements.add(new TransitionMetal.Copper());
                    break;
                // TODO add more cases here
                case "Titanium":
                    elements.add(new TransitionMetal.Titanium());
                    break;
                case "Gold":
                    elements.add(new TransitionMetal.Gold());
                    break;
                case "Zinc":
                    elements.add(new TransitionMetal.Zinc());
                    break;
                case "Iron":
                    elements.add(new TransitionMetal.Iron());
                    break;
                case "Technetium":
                    elements.add(new TransitionMetal.Technetium());
                    break;
                case "Tin":
                    elements.add(new PostTransitionMetal.Tin());
                    break;
                case "Aluminum":
                    elements.add(new PostTransitionMetal.Aluminum());
                    break;
                case "Uranium":
                    elements.add(new Actinide.Uranium());
                    break;
                case "Steel":
                    alloys.add(new Alloy.Steel());
                    break;
                case "Bronze":
                    alloys.add(new Alloy.Bronze());
                    break;
                case "Brass":
                    alloys.add(new Alloy.Brass());
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input){
                case "Radiate":
                    // TODO Radiate here
                    int wala = 0;
                    for (Element e: elements){
                        if (e instanceof Radioactive){
                            System.out.println(e.toString() + " emitting radiation");
                            System.out.println(e.toString() + "'s half-life: " + ((Radioactive) e).half_life());
                            wala ++;
                        }
                    }
                    if (wala == 0) {
                        System.out.println("No radioactive materials present");
                    }
                    break;
                case "Magnetize":
                    // TODO Magnetize here
                    wala = 0;
                    for (Element e: elements){
                        if (e instanceof Magnetic){
                            wala ++;
                            System.out.println(e.toString() + " is " + ((Magnetic) e).magnetic_type() + " with strength of " + ((Magnetic) e).magnetic_strength());
                        }
                    }
                    for (Alloy a: alloys){
                        if (a instanceof Magnetic){
                            System.out.println(a.getName() + " is " + ((Magnetic) a).magnetic_type() + " with strength of " + ((Magnetic) a).magnetic_strength());
                        }
                    }
                    if (wala == 0) {
                        System.out.println("No magnetic materials present");
                    }
                    break;
                case "Conduct":
                    // TODO Conduct here
                    wala = 0;
                    for (Element e: elements){
                        if (e instanceof Conductive){
                            wala++;
                            System.out.println(e.toString() + " conductivity is " + String.format("%.1f", ((Conductive) e).percent_conductive()*100) + "%");
                        }
                    }
                    for (Alloy a: alloys){
                        if (a instanceof Conductive){
                            System.out.println(a.getName() + " conductivity is " + String.format("%.1f", ((Conductive) a).percent_conductive()*100) + "%");
                        }
                    }
                    if (wala == 0) {
                        System.out.println("No conductive materials present");
                    }
                    break;
                case "Alloy Components":
                    // TODO Alloy Components here
                    for (Alloy a : alloys) {
                        System.out.print(a.getName() + " consists of ");
                        for (int i=0; i< a.getElems().length; i++){
                            System.out.print(a.getElems()[i]);
                            if (i+1<a.getElems().length) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get State":
                    System.out.print("Enter temperature: ");
                    float temp = sc.nextFloat();
                    sc.nextLine(); // This is to clear the newline
                    // TODO print state of elements
                    for (Element e: elements){
                        System.out.println(e.toString() + " is " + e.state(temp));
                    }
                    break;
                case "Sort by Weight":
                    Collections.sort(elements);
                    for (Element e : elements) {
                        System.out.println(e + " = " + e.getAtomicWeight());
                    }
                    if (elements.isEmpty()) {
                        System.out.println("No elements present");
                    }
                    break;
            }
        } while (!input.equals("DONE"));
    }
}