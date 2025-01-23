class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] result = new int[n]; 
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) { 
                int index = st.pop();
                result[index] = i - index;
            }
            st.push(i);
        }

        return result; 
    }
}