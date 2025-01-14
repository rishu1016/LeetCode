class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;                    
        int[] hash = new int[n+1];           

        int[] ans = new int[n];               
        int counter = 0;                     
        for(int i = 0; i < n; i++) {
            hash[A[i]]++;       
            if(hash[A[i]] == 2) {
                counter++;
            }
            hash[B[i]]++;

            if(hash[B[i]] == 2) {
                counter++;
            }
            ans[i] = counter;
        }
        return ans;
    }
}