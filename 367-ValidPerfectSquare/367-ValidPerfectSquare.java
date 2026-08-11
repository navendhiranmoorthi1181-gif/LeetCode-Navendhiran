// Last updated: 8/11/2026, 2:18:57 PM
class Solution {
    public boolean isPerfectSquare(int num) {
      int s=(int) Math.sqrt(num);
      return s*s==num;  
    }
}