/*Leetcode 1345. Jump Game IV
Given an array of integers arr, you are initially positioned at the first index of the array.

In one step you can jump from index i to index:

i + 1 where: i + 1 < arr.length.
i - 1 where: i - 1 >= 0.
j where: arr[i] == arr[j] and i != j.
Return the minimum number of steps to reach the last index of the array.

Notice that you can not jump outside of the array at any time.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_1345 {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n==1) return 0;

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int step = 0;

        //Filling map
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);

        while(!q.isEmpty()){
            step++;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int j = q.poll();
                //jump to j+1
                if (j+1 >=0 && map.containsKey(arr[j+1])){
                    if (j+1 == n-1) return step;
                    q.offer(j+1);
                }
                //jump to j-1
                if (j-1 >=0 && map.containsKey(arr[j-1])){
                    q.offer(j-1);
                }
                //jump to k-->arr[j]==arr[k]
                if (map.containsKey(arr[j])) {
                    for (int k : map.get(arr[j])) {
                        if (k!=j){
                            if (k==n-1)
                                return step;
                                q.offer(k);
                        }
                    }
                }
                map.remove(arr[j]);
            }
        }
        return step;
    }
    public static void main(String[] args) {
        int[] a = new int[]{100,-23,-23,404,100,23,23,23,3,404};
        System.out.println(minJumps(a));
    }
}
