package elementals;

public class TransitionMetal extends Element{
    public TransitionMetal(int atomicNumbers, String elementSymbol, String elementName, double atomicWeight, double meltingPoint, double boilingPoint) {
        super(atomicNumbers, elementSymbol, elementName, atomicWeight, meltingPoint, boilingPoint);
    }

    @Override
    String state(float temperature) {
        if ((double)temperature<=getMeltingPoint()) return "solid";
        else if ((double)temperature>getMeltingPoint() && (double)temperature<getBoilingPoint()) return "liquid";
        else return "gas";
    }

    public static class Titanium extends TransitionMetal{
        public Titanium() {
            super(22, "Ti", "Titanium", 47.9, 1668, 3287);
        }
    }
    public static class Gold extends TransitionMetal implements Conductive{
        public Gold() {
            super(79, "Au", "Gold", 197, 1064, 2970);
        }

        @Override
        public float percent_conductive() {
            return 0.7F;
        }
    }
    public static class Zinc extends TransitionMetal implements Conductive{
        public Zinc() {
            super(30, "Zn", "Zinc", 65.4, 419.5, 907.0F);
        }

        @Override
        public float percent_conductive() {
            return (0.27F);
        }
    }
    public static class Iron extends TransitionMetal implements Magnetic{
        public Iron() {
            super(26, "Fe", "Iron", 55.8, 1538, 2862);
        }

        @Override
        public int magnetic_strength() {
            return 1710;
        }

        @Override
        public String magnetic_type() {
            return "ferromagnetic";
        }
    }
    public static class Copper extends TransitionMetal implements Conductive{
        public Copper() {
            super(29, "Cu", "Copper", 63.5, 1085, 2562);
        }

        @Override
        public float percent_conductive() {
            return 1.0F;
        }
    }
    public static class Technetium extends TransitionMetal implements Conductive, Magnetic, Radioactive{
        public Technetium() {
            super(43, "Tc", "Technetium", 98, 2157, 4265);
        }

        @Override
        public float percent_conductive() {
            return 0.65F;
        }

        @Override
        public int magnetic_strength() {
            return 270;
        }

        @Override
        public String magnetic_type() {
            return "paramagnetic";
        }

        @Override
        public int half_life() {
            return 61;
        }
    }
}
