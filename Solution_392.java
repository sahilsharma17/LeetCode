public class Solution_392 {
    public static boolean isSubsequence(String s, String t) {
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (j < t.length()) {
                if (s.charAt(i) != t.charAt(j)) {
                    j++;
                    b = false;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        String a = "abc", b = "adbhc";
        System.out.println(isSubsequence(a, b));
    }
}
