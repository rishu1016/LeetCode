class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] difference = new int[s.length() + 1];
        for (int[] shift : shifts) {
            if (shift[2] == 1) {
                difference[shift[0]]++;
                difference[shift[1] + 1]--;
            } else {
                difference[shift[0]]--;
                difference[shift[1] + 1]++;
            }
        }
        
        for (int i = 1; i <= s.length(); i++) {
            difference[i] += difference[i - 1];
        }
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = difference[i] % 26;
            if (count < 0) count += 26;
            char current = (char)((s.charAt(i) - 'a' + count) % 26 + 'a');
            res.append(current);
        }
        return res.toString();
    }
}