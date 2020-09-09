import org.junit.Assert;
import org.junit.Test;

public class ArraySpiralTest {

    ArraySpiral spiral = new ArraySpiral();

    @Test
    public void should_test_spiral() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};

        Assert.assertArrayEquals(expected, spiral.createSpiral(3, 3));
    }

    @Test
    public void should_test_spiral_1() {
        int[][] expected = new int[][]{
                {1,2,3,4,5,6,7},
                {22,23,24,25,26,27,8},
                {21,36,37,38,39,28,9},
                {20,35,42,41,40,29,10},
                {19,34,33,32,31,30,11},
                {18,17,16,15,14,13,12}};

        Assert.assertArrayEquals(expected, spiral.createSpiral(7, 6));
    }
}
