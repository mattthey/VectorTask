import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Vector.*;


public class testVector5d {

    @Test
    void sumVector5d() {
        Vector5d v1 = new Vector5d(1, 2, 3, 4, 5);
        Vector5d v2 = new Vector5d(5, 4, 3, 2, 1);
        Vector5d v1andv2 = v1.add(v2);
        assertArrayEquals (new double[] {6,6,6,6,6}, v1andv2.coords);
    }

    @Test
    void subVector5d() {
        Vector5d v1 = new Vector5d(1, 2, 3, 4, 5);
        Vector5d v2 = new Vector5d(5, 4, 3, 2, 1);
        assertArrayEquals (new double[] {-4, -2, 0, 2, 4}, v1.sub(v2).coords);
    }

    @Test
    void scalarProductVector5d() {
        Vector5d v1 = new Vector5d(1, 2, 3, 4, 5);
        Vector5d v2 = new Vector5d(5, 4, 3, 2, 1);
        assertEquals (35, v1.scalarProduct(v2));
    }

    @Test
    void compareCoordinatesVector5dFalse() {
        Vector5d v1 = new Vector5d(1, 2, 3, 4, 5);
        Vector5d v2 = new Vector5d(5, 4, 3, 2, 1);
        assertFalse (v1.equals(v2));
    }

    @Test
    void compareCoordinatesVector5dTrue() {
        Vector5d v1 = new Vector5d(1, 2, 3, 4, 5);
        Vector5d v2 = new Vector5d(1, 2, 3, 4, 5);
        assertTrue (v1.equals(v2));
    }
}
