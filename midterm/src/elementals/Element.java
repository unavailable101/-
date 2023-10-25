package elementals;

// Also put Actinide and Uranium as inner class here
public abstract class Element implements Comparable<Element>{
    private int atomicNumbers;
    private String elementSymbol;
    private String elementName;
    private double atomicWeight;
    private double meltingPoint;
    private double boilingPoint;

    public Element(int atomicNumbers, String elementSymbol, String elementName, double atomicWeight, double meltingPoint, double boilingPoint) {
        this.atomicNumbers = atomicNumbers;
        this.elementSymbol = elementSymbol;
        this.elementName = elementName;
        this.atomicWeight = atomicWeight;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    @Override
    public int compareTo(Element o) {
        return this.getAtomicWeight() < o.getAtomicWeight() ? -1 : getAtomicWeight() == o.getAtomicWeight() ? 0 : 1;
    }

    public int getAtomicNumbers() {
        return atomicNumbers;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    public String getElementName() {
        return elementName;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public double getMeltingPoint() {
        return meltingPoint;
    }

    public double getBoilingPoint() {
        return boilingPoint;
    }

    //balikon tika kay wa ko kaybaw if void bha ako gamiton
    abstract String state(float temperature); //i string lng tika oi
    //return solid, liquid, gas


    @Override
    public String toString() {
        return atomicNumbers + " " + elementName + " ("+elementSymbol+")";
    }
}
