package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static int[] CalculateTwoSum(int [] nums, int target)
	{
		HashMap<Integer, Integer> diffMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++)
		{
			diffMap.put(target - nums[i], i);
		}
		
		for(int j = 0; j < nums.length; j++)
		{
			if(diffMap.containsKey(nums[j]))
			{
				if(diffMap.get(nums[j]) != j )
				{
					return new int[] {j,diffMap.get(nums[j])};	
				}
				
			}
		}
		
		return null;
	}



}
