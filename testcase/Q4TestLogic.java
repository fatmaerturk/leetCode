package testcase;
import static org.junit.Assert.*;
import logic.*;
import org.junit.Test;
public class Q4TestLogic {
    @Test
    public void findMedianSortedArrays(){
        org.junit.Assert.assertEquals(2.0,Q4MedianofTwoSortedArrays.findMedianSortedArrays(new int[]{1,3,2}, new int[]{2}), Math.abs(2.0));
    }
}

