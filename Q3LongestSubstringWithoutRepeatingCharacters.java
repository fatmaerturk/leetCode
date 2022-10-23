public class Q3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(s, i, j))
                    res = Math.max(res, j - i + 1);
        return res;
    }
    public static Boolean areDistinct(String str, int i, int j)
    {
        boolean[] visited = new boolean[26];
        for(int k = i; k <= j; k++)
        {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;
            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
}
