package Vector;

public abstract class BaseVector {

    public final double[] coords;
    protected final int dimension;

    protected BaseVector(double[] cord) {
        coords  = cord;
        dimension = cord.length;
    }

    protected abstract BaseVector getVector(double[] newCoords);

    protected BaseVector add(BaseVector anotherVector) {
        double[] resultCoords = new double[dimension];
        for (int i = 0; i < dimension; i++)
            resultCoords[i] = this.coords[i] + anotherVector.coords[i];
        return this.getVector(resultCoords);
    }

    protected BaseVector sub(BaseVector anotherVector) {
        double[] resultCoords = new double[dimension];
        for (int i = 0; i < dimension; i++)
            resultCoords[i] = this.coords[i] - anotherVector.coords[i];
        return this.getVector(resultCoords);
    }

    protected double scalarProduct(BaseVector anotherVector) {
        double result = 0;
        for (int i = 0; i < dimension; i++)
            result += this.coords[i] * anotherVector.coords[i];
        return result;
    }

    protected boolean compareCoordinates(BaseVector anotherVector) {
        for (int i = 0; i < dimension; i++)
            if (this.coords[i] != anotherVector.coords[i])
                return false;
        return true;
    }

    @Override
    public String toString() {
        String vectroString = "vector dimension = " + dimension + " { ";
        for (int i = 0; i < coords.length; i++)
            vectroString += coords[i] + " ";
        vectroString += "}";
        return vectroString;
    }
}
