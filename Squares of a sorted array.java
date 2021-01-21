//Squares of a sorted array - Leetcode 
//Solved in Java
//We must note that the square of any number is positive. Hence we are running a while loop which would compare the 
//elements of the array from both frontside and backside each time and the square of the bigger number gets added to the array.
//We are adding the elements to the array from the last index to the first i.e., (nums.length-1) to 0.
class Solution {
   public int[] sortedSquares(int[] nums) {
       int arr[] = new int[nums.length];
       int a = 0;
       int b = nums.length - 1;
       int c = nums.length - 1;
       while(a<=b){
           if(nums[a]*nums[a] > nums[b]*nums[b]){
               arr[c] = nums[a]*nums[a];
               a++;
           }
           else{
               arr[c] = nums[b]*nums[b];
               b--;
           }
           c--;
       }
       return arr;

    }
}

