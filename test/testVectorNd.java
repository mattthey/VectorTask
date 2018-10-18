import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Vector.*;


public class testVectorNd {

    @Test
    void sumVectorNd() {
        var v1 = new VectorNd(new double[] {1, 2, 3, 5});
        var v2 = new VectorNd(new double[] {5, 4, 3, 1});
        var v1andv2 = v1.add(v2);
        assertArrayEquals (new double[] {6,6,6,6}, v1andv2.coords);
    }

    @Test
    void sumVectorNdError() {
        var v1 = new VectorNd(new double[] {1, 2, 3, 5, 1});
        var v2 = new VectorNd(new double[] {5, 4, 3, 1});
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            v1.add(v2);
        });
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void subVectorNd() {
        var v1 = new VectorNd(new double[] {1, 2, 3, 4, 5});
        var v2 = new VectorNd(new double[] {5, 4, 3, 2, 1});
        assertArrayEquals (new double[] {-4, -2, 0, 2, 4}, v1.sub(v2).coords);
    }

    @Test
    void subVectorNdError() {
        var v1 = new VectorNd(new double[] {});
        var v2 = new VectorNd(new double[] {5, 4, 3, 1});
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            v1.sub(v2);
        });
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void scalarProductVectorNd() {
        var v1 = new VectorNd(new double[] {1, 2, 3, 4, 5});
        var v2 = new VectorNd(new double[] {5, 4, 3, 2, 1});
        assertEquals (35, v1.scalarProduct(v2));
    }

    @Test
    void scalarProductVectorNdVectorNdError() {
        var v1 = new VectorNd(new double[] {1});
        var v2 = new VectorNd(new double[] {5, 4, 3, 1});
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            v1.scalarProduct(v2);
        });
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void compareCoordinatesVectorNdFalse() {
        var v1 = new VectorNd(new double[] {1, 2, 3, 4, 5});
        var v2 = new VectorNd(new double[] {5, 4, 3, 2, 1});
        assertFalse (v1.compareCoordinates(v2));
    }

    @Test
    void compareCoordinatesVectorNdVectorNdError() {
        var v1 = new VectorNd(new double[] {});
        var v2 = new VectorNd(new double[] {5, 4, 3, 1});
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            v1.compareCoordinates(v2);
        });
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void compareCoordinatesVectorNdTrue() {
        var v1 = new VectorNd(new double[] {1, 2, 3, 4, 5});
        var v2 = new VectorNd(new double[] {1, 2, 3, 4, 5});
        assertTrue (v1.compareCoordinates(v2));
    }
}
