class Solution {
    public int maxChunksToSorted(int[] arr) {
       
        int max = arr[0];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(i==max){
                count++;
            }
        }
        return count;

    }
}