// Last updated: 8/11/2026, 2:18:37 PM
import java.math.BigInteger; 
   class Solution {
    public String addStrings(String num1, String num2) {
     

        BigInteger x = new BigInteger(num1);
        BigInteger y = new BigInteger(num2);
      BigInteger z = x.add(y);
      return String.valueOf(z) ;  
    }
}
    