// Last updated: 8/11/2026, 2:18:33 PM
class Solution {
    public int countSegments(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}