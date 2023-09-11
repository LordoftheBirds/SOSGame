import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTrianglesTest {
    @Test
    void TrueValidTriangle345() {
        TestingTriangles tester = new TestingTriangles();
        assertTrue(tester.isValidTriangle(3, 4, 5));
    }

    @Test
    void FalseValidTriangle129() {
        TestingTriangles tester = new TestingTriangles();
        assertFalse(tester.isValidTriangle(1, 2, 9));
    }

    @Test
    void FalseValidTriangle045() {
        TestingTriangles tester = new TestingTriangles();
        assertFalse(tester.isValidTriangle(0, 4, 5));
    }
}