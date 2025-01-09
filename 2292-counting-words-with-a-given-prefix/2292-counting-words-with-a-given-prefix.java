class Solution {
    public int prefixCount(String[] words, String pref) {
        int r=0;
        for(int i=0;i<words.length;i++)
        {

            if(startsWith(words[i],pref))
            r++;
        }
        return r;
    }
    private boolean startsWith(String w,String pr)
    {
        if(w.length()<pr.length())
        {
            return false;
        }
        for(int i=0;i<pr.length();i++)
        {
            if(w.charAt(i)!=pr.charAt(i))
            return false;
        }
        return true;
    }
}