package Vector;

interface IVector {
    public IVector add(IVector anotherVector);
    public IVector sub(IVector anotherVector);
    public IVector compareCoordinates(IVector anotherVector);
    public IVector scalarProduct(IVector anotherVector);
    public IVector toString(IVector anotherVector);
}
