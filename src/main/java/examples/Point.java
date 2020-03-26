package examples;

public class Point {

    private double xCoord, yCoord;

    public Point(double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public double distanceToOrigin() {

        return Math.sqrt(Math.pow(this.xCoord, 2) + Math.pow(this.yCoord, 2));
    }

    public void doubleDistanceToOrigin() {

        this.xCoord *= 2;
        this.yCoord *= 2;
    }
}

