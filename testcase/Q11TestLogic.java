package testcase;
import logic.Q11ContainerWithMostWater;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q11TestLogic {
    int[] height1 = {1,8,6,2,5,4,8,3,7}; int output1=49;
    int[] height2 = {1,1}; int output2=1;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q11ContainerWithMostWater.maxArea(height1));
        assertEquals(output2, Q11ContainerWithMostWater.maxArea(height2));
    }
}

