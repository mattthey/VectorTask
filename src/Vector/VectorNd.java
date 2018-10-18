package Vector;

public class VectorNd extends BaseVector {

    public VectorNd(double[] cor) {
        super(cor);
    }

    protected VectorNd getVector(double[] newCoords) {
        return new VectorNd(newCoords);
    }

    public VectorNd add(VectorNd anotherVector) {
        if (this.dimension == anotherVector.dimension)
            return (VectorNd) super.add(anotherVector);
        throw new IllegalArgumentException("the dimensions of the vectors don't match");
    }

    public VectorNd sub(VectorNd anotherVector) {
        if (this.dimension == anotherVector.dimension)
            return (VectorNd) super.sub(anotherVector);
        throw new IllegalArgumentException("the dimensions of the vectors don't match");
    }

    public double scalarProduct(VectorNd anotherVector) {
        if (this.dimension == anotherVector.dimension)
            return super.scalarProduct(anotherVector);
        throw new IllegalArgumentException("the dimensions of the vectors don't match");
    }

    public boolean compareCoordinates(VectorNd anotherVector) {
        if (this.dimension == anotherVector.dimension)
            return super.compareCoordinates(anotherVector);
        throw new IllegalArgumentException("the dimensions of the vectors don't match");
    }
}