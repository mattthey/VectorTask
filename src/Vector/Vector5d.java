package Vector;

public class Vector5d extends BaseVector {

    public Vector5d(double x, double y, double z, double a, double b) {
        super(x, y, z, a, b);
    }

    protected Vector5d getVector(double[] newCoords) {
        return new Vector5d(newCoords[0], newCoords[1], newCoords[2], newCoords[3], newCoords[4]);
    }

    public Vector5d add(Vector5d anotherVector) {
        return (Vector5d) super.add(anotherVector);
    }

    public Vector5d sub(Vector5d anotherVector) {
        return (Vector5d) super.sub(anotherVector);
    }

    public double scalarProduct(Vector5d anotherVector) {
        return super.scalarProduct(anotherVector);
    }

    public boolean equals(Vector5d anotherVector) {
        return super.equals(anotherVector);
    }

    public String toString() {
        return super.toString();
    }
}
