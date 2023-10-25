package Shape;

public class Sphere extends Solid{
    private double d;//way gamit
    private double r;

    public Sphere(int x, int y, double d) {
        super(x, y);
        this.r = d/2;
    }

    public Sphere(double d) {
        this.r = d/2;
    }

    @Override
    double volume() {
        return (4.0/3)*Math.PI*r*r*r;
    }

    @Override
    double surfaceArea() {
        return 4.0*Math.PI*r*r;
    }

    @Override
    public String toString() {
        return super.toString() + "which is a Sphere ";
    }

    public static class Hemisphere extends Sphere{
        double d;
        double r;

        public Hemisphere(int x, int y, double d) {
            super(x, y, d);
            this.r = d/2;
        }

        public Hemisphere(double d) {
            super(d);
            this.r = d/2;
        }

        @Override
        double volume() {
            return super.volume()/2.0;
        }

        @Override
        double surfaceArea() {
            return (3.0)*Math.PI*r*r;
        }

        @Override
        public String toString() {
            return super.toString() + "but only half of it ";
        }
    }
}
