package logic;

import java.util.Arrays;

public class Q8StringtoInteger {
    public static int myAtoi(String s) {
        char[] ch=s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]==' ') {
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.deleteCharAt(0);
                s = sb.toString();
                System.out.println(s);
                ch=s.toCharArray();
                System.out.println("="+Arrays.toString(ch));
//                if(ch[0]=='0'){
//                    System.out.println("asdasd");
//                    StringBuilder sb2 = new StringBuilder();
//                    sb.append(s);
//                    sb.deleteCharAt(0);
//                    s = sb.toString();
//                    System.out.println(s+"dfs");
//                    ch=s.toCharArray();
//                }

            }

        }
        return -42;
    }
}
