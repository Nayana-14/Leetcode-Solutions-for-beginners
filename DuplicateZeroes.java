//Duplicate zeroes - Leetcode
class Solution {
    public void duplicateZeros(int[] a) {
        if (a == null || a.length == 0) return;
        for (int i = 0; i<a.length; i++){
            if (a[i] == 0){
                for(int j = a.length-1; j>i; j--){
                    a[j] = a[j-1];                    
                }
                i++;
            }
        }
    }
}
