// Last updated: 8/11/2026, 2:15:02 PM
class Solution {
    public int minimumMoves(String s) {
        int i=0,step=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i+=3;
                step++;
            }
            else {
                i++;
            }
        }
            return step;
    }
}