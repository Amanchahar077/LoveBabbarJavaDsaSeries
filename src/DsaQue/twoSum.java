package DsaQue;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqNum = target - nums[i];
            if (hm.containsKey(reqNum)) {
                int[] res = {hm.get(reqNum), i};
                return res;
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}


