package Vector;

public class Vector3d extends BaseVector {

    public Vector3d(double x, double y, double z) {
        super(x, y, z);
    }

    protected Vector3d getVector(double[] newCoords) {
        return new Vector3d(newCoords[0], newCoords[1], newCoords[2]);
    }

    public Vector3d add(Vector3d anotherVector) {
        return (Vector3d) super.add(anotherVector);
    }

    public Vector3d sub(Vector3d anotherVector) {
        return (Vector3d) super.sub(anotherVector);
    }

    public double scalarProduct(Vector3d anotherVector) {
        return super.scalarProduct(anotherVector);
    }

    public boolean equals(Vector3d anotherVector) {
        return super.equals(anotherVector);
    }

    public String toString() {
        return super.toString();
    }
}
