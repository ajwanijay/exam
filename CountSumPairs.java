package exam;

import java.util.HashMap;
import java.util.Map;

public class CountSumPairs {
	
	public static int twoSum(int[] nums, int target) {
		Map<Integer, Integer> remainders = new HashMap<>();
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (remainders.containsKey(nums[i])) {
				count++;
			} else {
				remainders.put(target - nums[i], i);
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int[] nums = {2,7,11,15};
		int[] nums2 = {1,5,2,4,3,6};
		
		int target = 9;
		int target2 = 7;
		System.out.println(twoSum(nums, target));
		System.out.println(twoSum(nums2, target2));

	}

}
