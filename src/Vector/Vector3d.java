package Vector;

public class Vector3d extends BaseVector {

    public Vector3d(double[] cor) {
        super(cor);
    }

    protected Vector3d getVector(double[] newCoords) {
        return new Vector3d(newCoords);
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

    public boolean compareCoordinates(Vector3d anotherVector) {
        return super.compareCoordinates(anotherVector);
    }

    public String toString() {
        return super.toString();
    }
}
