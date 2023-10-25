package elementals;

public class PostTransitionMetal extends Element{
    public PostTransitionMetal(int atomicNumbers, String elementSymbol, String elementName, double atomicWeight, double meltingPoint, double boilingPoint) {
        super(atomicNumbers, elementSymbol, elementName, atomicWeight, meltingPoint, boilingPoint);
    }

    @Override
    String state(float temperature) {
        if ((double)temperature<getMeltingPoint()) return "solid";
        else if ((double)temperature>getMeltingPoint() && (double)temperature<getBoilingPoint()) return "liquid";
        else return "gas";
    }
    public static class Tin extends PostTransitionMetal{
        public Tin() {
            super(50, "Sn", "Tin", 118.7, 231.9, 2602);
        }
    }
    public static class Aluminum extends PostTransitionMetal implements Conductive{
        public Aluminum() {
            super(13, "Al", "Aluminum", 27, 660.3, 2470);
        }

        @Override
        public float percent_conductive() {
            return 0.61F;
        }
    }
}
