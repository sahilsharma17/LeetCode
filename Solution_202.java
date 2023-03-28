public class Solution_202 {
    public static boolean isHappy(int n){
        int i = 20;
        while(i>0){
            int num = 0;
            while (n>0){
                num += Math.pow(n%10, 2 );
                n /= 10;
            }
            if(num == 1) return true;
            n = num; 
            i--;
            
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
