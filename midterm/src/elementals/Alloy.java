package elementals;

public class Alloy{
//    Steel<Element> = {"Iron", "Copper"}; //implements Magnetic (Ferromagnetic, 1950)
//    Bronze<Element> = {"Tin", "Copper"};
//    Brass<Element> = {"Copper", "Zinc"}; // implements Conductive (0.28F)
    //need getters and i don't know how

    String name;
    String[] elems;

    public Alloy(String name, String[] elems) {
        this.name = name;
        this.elems = elems;
    }

    public String getName() {
        return name;
    }

    public String[] getElems() {
        return elems;
    }

    public static class Steel extends Alloy implements Magnetic{
        public Steel() {
            super("Steel", new String[]{"Iron", "Copper"});
        }

        @Override
        public int magnetic_strength() {
            return 1950;
        }

        @Override
        public String magnetic_type() {
            return "ferromagnetic";
        }
    }
    public static class Bronze extends Alloy{
        public Bronze() {
            super("Bronze", new String[]{"Tin", "Copper"});
        }
    }
    public static class Brass extends Alloy implements Conductive{
        public Brass() {
            super("Brass", new String[]{"Copper", "Zinc"});
        }

        @Override
        public float percent_conductive() {
            return 0.28F;
        }
    }
}
