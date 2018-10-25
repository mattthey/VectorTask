import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Vector.*;


public class testVector3d {

    @Test
    void sumVector3d() {
        Vector3d v1 = new Vector3d(1,2,3);
        Vector3d v2 = new Vector3d(3,2,1);
        Vector3d v1andv2 = v1.add(v2);
        assertArrayEquals (new double[] {4,4,4}, v1andv2.coords);
    }

    @Test
    void subVector3d() {
        Vector3d v1 = new Vector3d(1,2,3);
        Vector3d v2 = new Vector3d(3,2,1);
        assertArrayEquals (new double[] {-2, 0, 2}, v1.sub(v2).coords);
    }

    @Test
    void scalarProductVector3d() {
        Vector3d v1 = new Vector3d(1,2,3);
        Vector3d v2 = new Vector3d(3,2,1);
        assertEquals (10, v1.scalarProduct(v2));
    }

    @Test
    void compareCoordinatesVector3dFalse() {
        Vector3d v1 = new Vector3d(1,2,3);
        Vector3d v2 = new Vector3d(3,2,1);
        assertFalse (v1.equals(v2));
    }

    @Test
    void compareCoordinatesVector3dTrue() {
        Vector3d v1 = new Vector3d(1,2,3);
        Vector3d v2 = new Vector3d(1,2,3);
        assertTrue (v1.equals(v2));
    }
}
