class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int cnt1 = 0;
        
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                cnt1++;
                i++; 
            } else {
                i++;
                j--;
            }
        }

        i = 0;
        j = s.length() - 1;
        int cnt2 = 0;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                cnt2++;
                j--; 
            } else {
                i++;
                j--;
            }
        }
        return cnt1 <= 1 || cnt2 <= 1;
    }
}
