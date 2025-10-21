import java.util.HashMap;

public class TwoSum {
    // Returns indices of two numbers that add up to target, or null if none.
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        if (res != null) {
            System.out.println(res[0] + ", " + res[1]);
        } else {
            System.out.println("No solution");
        }
    }
}
