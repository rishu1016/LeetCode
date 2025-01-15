class Solution {
    public int minimizeXor(int num1, int num2) {
        int countSet = 0;
        for(int i=0; i<31; i++) {
            if(((num2 >> i) & 1) == 1) {
                countSet++;
            }
        }
        int ans = 0;
        for(int i=31; i>=0; i--) {

            if(((num1 >> i) & 1) == 1) {
                ans = (1 << i) | ans;
                countSet--;
            }

            if(countSet == 0) {
                break;
            }
        }
        if (countSet > 0) {
            for (int i = 0; i < 31; i++) {
                if (((ans >> i) & 1) == 0 && countSet > 0) {
                    ans |= (1 << i); 
                    countSet--; 
                }
            }
        }
    
        return ans;        
    }
}