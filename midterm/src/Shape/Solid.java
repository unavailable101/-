package Shape;

public abstract class Solid {
    private int x;
    private int y;

    public Solid(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Solid() {
        this.x = 50;
        this.y = 50;
    }

    @Override
    public String toString() {
        return "A solid at (" + x + ", " + y + ") ";
    }
    abstract double volume();
    abstract double surfaceArea();
}
