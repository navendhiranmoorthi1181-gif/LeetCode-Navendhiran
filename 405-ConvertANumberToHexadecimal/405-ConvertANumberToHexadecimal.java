// Last updated: 8/11/2026, 2:18:44 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        while (num != 0) {
            int digit = num & 0xf; // last 4 bits
            sb.append(hexChars[digit]);
            num >>>= 4; // unsigned right shift
        }
        
        return sb.reverse().toString();
    }
}
