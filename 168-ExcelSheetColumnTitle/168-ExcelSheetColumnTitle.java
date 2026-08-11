// Last updated: 8/11/2026, 2:21:03 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        
        return res.toString();        
    }
}