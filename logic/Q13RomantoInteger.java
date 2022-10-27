package logic;

public class Q13RomantoInteger {
    public static int romanToInt(String s) {
        int output = 0;
        Character[] symbolArr = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        Integer[] valuesArr = { 1, 5, 10, 50, 100, 500, 1000 };
        char[] inputList = s.toCharArray();
        char[][] exceptionalSymbolArr = { { 'I', 'V' }, { 'I', 'X' }, { 'X', 'L' }, { 'X', 'C' }, { 'C', 'D' },
                { 'C', 'M' } };
        boolean breakTime = false;
        Integer[] exceptionalValuesArr = { 4, 9, 40, 90, 400, 900 };
        for (int i = 0; i < inputList.length; i++) {
            for (int j = 0; j < symbolArr.length; j++) {
                breakTime = false;
                if (inputList[i] == symbolArr[j]) {
                    output += valuesArr[j];
                    try {
                        for (int k = 0; k < exceptionalSymbolArr.length; k++) {
                            if (inputList[i] == exceptionalSymbolArr[k][0]
                                    && inputList[i + 1] == exceptionalSymbolArr[k][1]) {
                                output -= valuesArr[j];
                                output += exceptionalValuesArr[k];
                                i++;
                                breakTime = true;
                            }
                        }
                    }
                    catch(Exception e) {
                        System.out.print(e.getMessage());
                    }
                    if (breakTime)
                        break;
                }
            }
        }
        return output;
    }
}
