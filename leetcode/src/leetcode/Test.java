package leetcode;

import java.util.HashMap;

public class Test {

	public static int[] twoSum(int[] nums, int target) {
		HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] arr =new int[2];
		for (int i=0;i<nums.length;i++){
			System.out.println("nums["+i+"]"+" = "+nums[i]);
			if(map.containsKey(nums[i])){
				System.out.println(nums[i]);
				int index = map.get(nums[i]);
				arr[0]=index+1;
				System.out.println("index+1 "+(index+1));
				arr[1]=i+1;
				System.out.println("i+1 "+ (i+1));

			}else{
				map.put(target-nums[i], i);
				System.out.println("Key " + (target-nums[i])+"----->" +" value "+ i);
			}

		}

		return arr;
	}

	public static void main(String[] args) {

		int[] nums = {0,4,3,0};
		int[] ans = twoSum(nums,0);
		System.out.println(ans[0]+"  "+ans[1]);

	}
}



