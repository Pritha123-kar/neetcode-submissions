class Solution {
    public int numIdenticalPairs(int[] nums) {
      int[]freq= new int[101];
      for(int num:nums){
        freq[num]++;
      }
      int count=0;
      for(int i=0;i<freq.length;i++){
        if(freq[i]>1){
            count += freq[i]*(freq[i]-1)/2;
        }
      } 
      return count; 
    }
}