public class Solution_28 {

    public static int strStr(String haystack, String needle){
    if (haystack.equals(needle)) return 0;
    char[] h = haystack.toCharArray();
    char[] n = needle.toCharArray();
    for (int i=0; i<=h.length-n.length; i++){
        int l=0, r=n.length-1;
        while (l<=r){
            if (h[i+l] == n[l] && h[i+r] == n[r]){
                l++; r--;
            }else break; 
        }
        if (l>r) return i;
    }
    return -1;
}

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "but"));
    }
}

