public class Solution {
  public boolean canBeValid(String s, String locked) {
    int n = s.length();
    if (n % 2 == 1) {
      return false;
    }
    int remain = 0;
    for (int i = 0; i < n; i++) {
      
      if (locked.charAt(i) == '1' && s.charAt(i) == ')') {
     
        if (remain == 0) {
          return false;
        } else {
          remain--;
        }
      } else {
        remain++;
      }
    }

    remain = 0;
    for (int i = n - 1; i >= 0; i--) {
      
      if (locked.charAt(i) == '1' && s.charAt(i) == '(') {
        
        if (remain == 0) {
          return false;
        } else {
          remain--;
        }
      } else {
        remain++;
      }
    }

    return true;
  }
}