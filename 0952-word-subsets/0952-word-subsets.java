import java.util.*;

public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] maxfreq = new int[26];

        for (String str : words2) {
            int[] freq = new int[26];
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxfreq[i] = Math.max(maxfreq[i], freq[i]);
            }
        }

        for (String str : words1) {
            int[] freq = new int[26];
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean issubset = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxfreq[i]) {
                    issubset = false;
                    break;
                }
            }

            if (issubset) {
                ans.add(str);
            }
        }

        return ans;
    }
}