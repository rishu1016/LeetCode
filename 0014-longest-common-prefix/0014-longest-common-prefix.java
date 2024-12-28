class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count  = 0;
        Arrays.sort(strs);

        String start = strs[0];
        String end  = strs[strs.length-1];
        int i = 0 ;
        while (i<start.length() && i<end.length()){

            if(start.charAt(i) == end.charAt(i)){

                count++;
                i++;
            }
            else {
                break;
            }
        }

        return start.substring(0,count);
    }
}