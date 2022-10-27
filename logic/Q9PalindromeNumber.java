package logic;

import java.util.ArrayList;

public class Q9PalindromeNumber {
    public static boolean isPalindrome(int x) {

        int middleDigitIndex;
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        ArrayList<Integer> numberToArray = new ArrayList<Integer>();
        ArrayList<Integer> reverseArray = new ArrayList<Integer>();
        while (x != 0) {
            numberToArray.add(x % 10);
            x /= 10;
        }
        for(int i=numberToArray.size()-1;i>=0;i--) {
            reverseArray.add(numberToArray.get(i));
        }
        middleDigitIndex = (reverseArray.size() - 1) / 2;
        if (reverseArray.size() % 2 == 1) {
            for (int i = 0; i < middleDigitIndex; i++) {
                   if (reverseArray.get(middleDigitIndex-i-1) != reverseArray.get(middleDigitIndex + i+1)) {
                    return false;
                }
            }
            return true;
        } else {
              for (int i = 0; i <= middleDigitIndex; i++) {
                if (reverseArray.get(middleDigitIndex-i) != reverseArray.get(middleDigitIndex + i+1))	{
                    System.out.println(reverseArray.get(middleDigitIndex-i) +"+"+ reverseArray.get(middleDigitIndex + i+1));
                    return false;
                }
            }
            return true;
        }
    }
}
