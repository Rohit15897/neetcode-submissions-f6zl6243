class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i <= j){
            if(ch[i] != ch[j])
                return false;
            i++;
            j--;
        }

        return true;
    }
}
