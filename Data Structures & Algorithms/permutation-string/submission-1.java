class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1Freq = new HashMap<>();
		HashMap<Character, Integer> s2Freq = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++) {
			s1Freq.put(s1.charAt(i), s1Freq.getOrDefault(s1.charAt(i), 0) + 1);
		}
		
		int j = 0;
		for(int i = 0; i < s2.length(); i++) {
			if(i < s1.length()) {
				s2Freq.put(s2.charAt(i), s2Freq.getOrDefault(s2.charAt(i), 0) + 1);
				if(s1Freq.equals(s2Freq))
					return true;
			}else {
				int temp = s2Freq.get(s2.charAt(j));
				if(temp > 1) {
					s2Freq.put(s2.charAt(j), s2Freq.getOrDefault(s2.charAt(j), 0) - 1);
					j++;
				}else {
					s2Freq.remove(s2.charAt(j));
					j++;
				}
				
				
				s2Freq.put(s2.charAt(i), s2Freq.getOrDefault(s2.charAt(i), 0) + 1);
				if (s1Freq.equals(s2Freq)) {
					return true;
				}
			}
			
			
		}
		
		
		return false;
    }
}
