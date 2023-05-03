/* Leetcode 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */

import java.util.HashMap;
import java.util.Map;

public class Solution_169 {
    public static int majorityElement(int[] nums) {
        int max = 0;
        int majorityElem = 0;
        Map<Integer, Integer> maps = new HashMap<>();

        for (int num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > max){
                max = value;
                majorityElem = key;
            }
        }

        return majorityElem;
    }
    public static void main(String[] args) {
        int[] num = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }
}
