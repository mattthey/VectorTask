import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Vector.*;


public class testVectorNd {

    @Test
    void sumVectorNd() {
        VectorNd v1 = new VectorNd(1, 2, 3, 5);
        VectorNd v2 = new VectorNd(5, 4, 3, 1);
        VectorNd v1andv2 = v1.add(v2);
        assertArrayEquals (new double[] {6,6,6,6}, v1andv2.coords);
    }

    @Test
    void sumVectorNdError() {
        VectorNd v1 = new VectorNd(1, 2, 3, 5, 1);
        VectorNd v2 = new VectorNd(5, 4, 3, 1);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> v1.add(v2));
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void subVectorNd() {
        VectorNd v1 = new VectorNd(1, 2, 3, 4, 5);
        VectorNd v2 = new VectorNd(5, 4, 3, 2, 1);
        assertArrayEquals (new double[] {-4, -2, 0, 2, 4}, v1.sub(v2).coords);
    }

    @Test
    void subVectorNdError() {
        VectorNd v1 = new VectorNd();
        VectorNd v2 = new VectorNd(5, 4, 3, 1);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> v1.sub(v2));
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void scalarProductVectorNd() {
        VectorNd v1 = new VectorNd(1, 2, 3, 4, 5);
        VectorNd v2 = new VectorNd(5, 4, 3, 2, 1);
        assertEquals (35, v1.scalarProduct(v2));
    }

    @Test
    void scalarProductVectorNdVectorNdError() {
        VectorNd v1 = new VectorNd(1);
        VectorNd v2 = new VectorNd(5, 4, 3, 1);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            v1.scalarProduct(v2);
        });
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }

    @Test
    void compareCoordinatesVectorNdFalse() {
        VectorNd v1 = new VectorNd(1, 2, 3, 4, 5);
        VectorNd v2 = new VectorNd(5, 4, 3, 2, 1);
        assertFalse (v1.equals(v2));
    }

    @Test
    void compareCoordinatesVectorNdVectorNdError() {
        VectorNd v1 = new VectorNd();
        VectorNd v2 = new VectorNd(5, 4, 3, 1);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            v1.equals(v2);
        });
        assertEquals("the dimensions of the vectors don't match", exception.getMessage());
    }


    @Test
    void compareCoordinatesVectorNdTrue() {
        VectorNd v1 = new VectorNd(1, 2, 3, 4, 5);
        VectorNd v2 = new VectorNd(1, 2, 3, 4, 5);
        assertTrue (v1.equals(v2));
    }
}
