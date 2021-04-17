package LEC26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "wbcdaaccaa";
		System.out.println(maxfreq(str));

	}

	public static char maxfreq(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		} 
		int max = Integer.MIN_VALUE;
		char ch = '0';
		
		Set<Character> keys = new HashSet<>(map.keySet());
		for(char key : keys) {
			if(map.get(key)>max) {
				max=map.get(key);
				ch=key;
			}
		}
		
		
		return ch;
		
	}
}
