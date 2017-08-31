package leecode;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        for(int i=0;i<s.length();i++){
        	if(set.contains(s.charAt(i))){
        		set.remove(s.charAt(i));
        		count++;
        	}else{
        		set.add(s.charAt(i));
        	}
        }
        if(!set.isEmpty()) return count*2+1;
        else return count*2;
    }
}
