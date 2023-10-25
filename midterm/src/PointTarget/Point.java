package PointTarget;

import java.util.Comparator;

public class Point implements Comparable<Point>{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point o) {
        return this.y < o.y ? 1 : this.y == o.y ? (Integer.compare(this.x, o.x)) : -1;
    }
    public static class comparePoints implements Comparator<Point>{
        Point target;

        public comparePoints(Point target) {
            this.target = target;
        }

        @Override
        public int compare(Point o1, Point o2) {
            //return o1.color.compareTo(o2.color);
            double res1 = Math.sqrt( Math.pow((o1.x - target.x),2) + Math.pow((o1.y - target.y),2) );
            double res2 = Math.sqrt( Math.pow((o2.x - target.x),2) + Math.pow((o2.y - target.y),2) );
            return Double.compare(res1, res2);
        }
    }
}
