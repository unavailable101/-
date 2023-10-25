package elementals;

public class Actinide extends Element{
    public Actinide(int atomicNumbers, String elementSymbol, String elementName, double atomicWeight, double meltingPoint, double boilingPoint) {
        super(atomicNumbers, elementSymbol, elementName, atomicWeight, meltingPoint, boilingPoint);
    }

    @Override
    String state(float temperature) {
        if ((double) temperature<getMeltingPoint()) return "solid";
        else if ((double) temperature>getMeltingPoint() && (double) temperature<getBoilingPoint()) return "liquid";
        else return "gas";
    }

    public static class Uranium extends Actinide implements Radioactive{
        public Uranium() {
            super(92, "U", "Uranium", 238, 1132.2, 4131);
        }

        @Override
        public int half_life() {
            return 25166;
        }
    }
}
