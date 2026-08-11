// Last updated: 8/11/2026, 2:23:09 PM
class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }
}