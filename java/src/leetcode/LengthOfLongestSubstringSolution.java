package leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LengthOfLongestSubstringSolution {

    public static int lengthOfLongestSubstring(String s) {
    	
    	int maxNumber = 0;
    	Set<Character> charSet = new HashSet<Character>();
    	
    	for(int i = 0; i < s.length(); i++)
    	{
    		charSet.add(s.charAt(i));
    		for(int j = i + 1; j < s.length(); j++)
    		{
    			if(charSet.contains(s.charAt(j)))
        		{
    				int size = j - i;

    				if(size > maxNumber)
    				{
    					maxNumber = size; 
    				}
    				charSet.clear();
    				break;
        		}
    			else
    			{
    				charSet.add(s.charAt(j));
    			}
    		}
    		
        	// No match
        	if(charSet.size() > maxNumber)
        	{
        		maxNumber = charSet.size();
        	}
        	charSet.clear();
    		
    	}
    	
    	// No match
    	if(charSet.size() > maxNumber)
    	{
    		return charSet.size();
    	}
		return maxNumber;
    }
	
}
