package Shape;

public class Cuboid extends Solid{
    private double h;
    private double b;
    private double l;

    public Cuboid(int x, int y, double h, double b, double l) {//constructor
        super(x, y);
        this.h = h;
        this.b = b;
        this.l = l;
    }

    public Cuboid(double h, double b, double l) {//constructor
        this.h = h;
        this.b = b;
        this.l = l;
    }

    @Override
    double volume() { //overide
        return l*b*h;
    }

    @Override
    double surfaceArea() {
        return 2*((l*b)+(b*h)+(l*h));
    }

    @Override
    public String toString() {
        return super.toString() + "which is a Cuboid ";
    }

    public static class Cube extends Cuboid{ //inner class
        private double a;

        public Cube(int x, int y, double a) {
            super(x, y, a, a, a);
        }

        public Cube(double a) {
            super(a, a, a);
        }

        @Override
        public String toString() {
            return super.toString() + "which is also a Cube";
        }
    }
}
