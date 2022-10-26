package testcase;
import static org.junit.Assert.*;
import logic.Q6ZigzagConversion;
import org.junit.Test;

public class Q6TestLogic {
    String input1 = "PAYPALISHIRING"; int numRows1 = 3; String output1 = "PAHNAPLSIIGYIR";
    String input2 = "PAYPALISHIRING"; int numRows2 = 4; String output2 = "PINALSIGYAHRPI";
    String input3 = "A"; int numRows3 = 1; String output3 = "A";
    @Test
    public void findMedianSortedArrays() {
        assertEquals(output1, Q6ZigzagConversion.convert(input1, numRows1));
        assertEquals(output2, Q6ZigzagConversion.convert(input2, numRows2));
        assertEquals(output3, Q6ZigzagConversion.convert(input3, numRows3));
    }
}
