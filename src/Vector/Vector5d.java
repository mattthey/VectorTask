package Vector;

public class Vector5d extends BaseVector {

    public Vector5d(double[] cor) {
        super(cor);
    }

    protected Vector5d getVector(double[] newCoords) {
        return new Vector5d(newCoords);
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

    public boolean compareCoordinates(Vector5d anotherVector) {
        return super.compareCoordinates(anotherVector);
    }

    public String toString() {
        return super.toString();
    }
}
