// Last updated: 8/11/2026, 2:19:42 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int [] freqA=new int[26];
        int [] freqB=new int[26];

        for(char c:s.toCharArray()){
            freqA[c-97]++;
        }
        for(char ch:t.toCharArray()){
            freqB[ch-97]++;
        }
        return Arrays.equals(freqA,freqB);
    }
}