import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import leetcode.*;
import util.ListNode;

import org.junit.Ignore;
import org.junit.Test;

public class LeetCodeTests {

	@Ignore
	@Test
	public void TwoSumTest() {
		
		assertArrayEquals(new int[]{1,2},  TwoSum.CalculateTwoSum(new int[] {3,2,4}, 6));
		
		assertArrayEquals(new int[]{2,4},  TwoSum.CalculateTwoSum(new int[] {-1,-2,-3,-4,-5}, -8));
		
	}
	
	
	@Ignore
	@Test
	public void AddTwoNumbersTest()
	{
		
		ListNode ln;
		
		// Input: l1 = [2,4,3], l2 = [5,6,4]
		// Output: [7,0,8]
		// Explanation: 342 + 465 = 807.
		
		ListNode n1 = new ListNode(2);
		n1.next = new ListNode(4);
		n1.next.next = new ListNode(3);
		
		ListNode n2 = new ListNode(5);
		n2.next = new ListNode(6);
		n2.next.next = new ListNode(4);
		
		
		AddTwoNumbersSolution ads = new AddTwoNumbersSolution();
		
		ln = ads.addTwoNumbers(n1, n2);
		
		assertEquals(7, ln.val);
		assertEquals(0, ln.next.val);
		assertEquals(8, ln.next.next.val);

		
		// [9,9,9,9,9,9,9]
		// [9,9,9,9]
		
		n1 = new ListNode(9);
		n1.next = new ListNode(9);
		n1.next.next = new ListNode(9);
		
		n2 = new ListNode(9);
		n2.next = new ListNode(9);
		
		ads = new AddTwoNumbersSolution();
		
		ln = ads.addTwoNumbers(n1, n2);
		
		assertEquals(8, ln.val);
		assertEquals(9, ln.next.val);
		assertEquals(0, ln.next.next.val);
		assertEquals(1, ln.next.next.next.val);
		
		
		
		// [9,9,9,9,9,9,9]
		// [9,9,9,9]
		
		n1 = new ListNode(5);
		n2 = new ListNode(5);
		
		ads = new AddTwoNumbersSolution();
		
		ln = ads.addTwoNumbers(n1, n2);
		
		assertEquals(0, ln.val);
		assertEquals(1, ln.next.val);
	}
	
	
	@Test
	public void LengthofLongestSubstringTest()
	{
		
		assertEquals(3, LengthOfLongestSubstringSolution.lengthOfLongestSubstring("abcabcbb"));
		
		assertEquals(1, LengthOfLongestSubstringSolution.lengthOfLongestSubstring("bbbb"));
		
		assertEquals(3, LengthOfLongestSubstringSolution.lengthOfLongestSubstring("pwwkew"));
		
		assertEquals(0, LengthOfLongestSubstringSolution.lengthOfLongestSubstring(""));
		
		assertEquals(1, LengthOfLongestSubstringSolution.lengthOfLongestSubstring(" "));
		
		assertEquals(2, LengthOfLongestSubstringSolution.lengthOfLongestSubstring("au"));

		assertEquals(2, LengthOfLongestSubstringSolution.lengthOfLongestSubstring("aab"));
		
		assertEquals(3, LengthOfLongestSubstringSolution.lengthOfLongestSubstring("bwf"));
		
	}
	

}
