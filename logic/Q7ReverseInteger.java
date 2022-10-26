package logic;

public class Q7ReverseInteger {
    public static int reverse(long x) {
        long reverseNumber = 0;
        while (x != 0) {
            long remainder = x % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            x = x / 10;
        }
        if (reverseNumber < -(Math.pow(2, 31)) || reverseNumber > (Math.pow(2, 31) - 1))
            return 0;
        return (int) reverseNumber;
    }
}
