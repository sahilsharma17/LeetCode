/* 2187. Minimum Time to Complete Trips
 * You are given an array time where time[i] denotes the time taken by the ith bus to complete one trip.
 * Each bus can make multiple trips successively; that is, the next trip can start immediately after
 * completing the current trip. Also, each bus operates independently; that is,
 * the trips of one bus do not influence the trips of any other bus.
 * You are also given an integer totalTrips, which denotes the number of trips all buses should make in total.
 * Return the minimum time required for all buses to complete at least totalTrips trips.
 */

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
