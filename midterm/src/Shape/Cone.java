package Shape;

public class Cone extends Solid{
    private double bd; // walay gamit --_--
    private double h;
    private double r;

    public Cone(int x, int y, double bd, double h) {
        super(x, y);
        this.r = bd/2;
        this.h = h;
    }

    public Cone(double bd, double h) {
        this.r = bd/2;
        this.h = h;
    }

    @Override
    double volume() {
        return (1.0/3)*Math.PI*r*r*h;
    }

    @Override
    double surfaceArea() {
        return Math.PI*r*(Math.sqrt((r*r) + (h*h)) + r);
    }

    @Override
    public String toString() {
        return super.toString() + "which is a Cone";
    }
}
