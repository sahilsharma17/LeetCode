public class Solution_1539 {
    public static int findKthPositive(int[] arr, int k) {
        int j=1, i=0;
        int l = 8;
        int a = 0;
        int[] b = new int[8];
        while (i++<arr[l]) {
            try{
            if (j!=arr[i]) {
                b[a] = j;
                a++;j++;
            } else {
                j++;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
        }
        return b[k-1];
    }
    public static void main(String[] args) {
        int[] a = new int[]{2,3,4,6,7,9};
        System.out.println(findKthPositive(a, 3));
    }
}
