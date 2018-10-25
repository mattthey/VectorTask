package Vector;

public abstract class BaseVector {

    public final double[] coords;
    protected final int dimension;
//    protected int hashcode;

    protected BaseVector(double... cord) {
        coords  = cord.clone();
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

//    public boolean compareCoordinates(BaseVector anotherVector) {
//        for (int i = 0; i < dimension; i++)
//            if (this.coords[i] != anotherVector.coords[i])
//                return false;
//        return true;
//    }

    @Override
    public boolean equals(Object another) {
        if (!this.getClass().getSimpleName().equals(another.getClass().getSimpleName()))
            return false;
        BaseVector anotherVector = this.getClass().cast(another);
        for (int i = 0; i < dimension; i++)
            if (this.coords[i] != anotherVector.coords[i])
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = dimension ^ (dimension >>> 32);
        for (int i = 0; i < dimension; i++)
            hash = 31 * hash + Double.hashCode(coords[i]);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder vectroString = new StringBuilder("vector dimension = " + dimension + " { ");
        for (int i = 0; i < coords.length; i++)
            vectroString.append(coords[i] + " ");
        vectroString.append("}");
        return vectroString.toString();
    }
}
