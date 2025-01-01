class Solution {
    public int maxScore(String s) {
        int onesCountRight = 0, zeroesCountLeft = 0, maxScore = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                onesCountRight++;
            }
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroesCountLeft++;
            } else {
                onesCountRight--;
            }
            
            maxScore = Math.max(maxScore, zeroesCountLeft + onesCountRight);
        }
        
        return maxScore;
    }
}
