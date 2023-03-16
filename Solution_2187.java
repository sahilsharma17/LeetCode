public class Solution_2187 {
    public static long minimumTime(int[] time, int totalTrips) {
        long low = Long.MAX_VALUE, high = 0;
        for (int ti : time) {
            low = Math.min(low, ti);
        }
        high = low*totalTrips;

        while (low<high) {
            long mid = low + (high-low)/2;
            if (checkTime(mid, time, totalTrips)) {
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private static boolean checkTime(long t, int[] time, int totalTrips) {
        long trips = 0;
        for (int ti : time) {
            trips += t/ti;;
        }
        if (trips >= totalTrips) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        System.out.println(minimumTime(a, 5));
    }
}
