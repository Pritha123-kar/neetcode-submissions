class Solution {
    public  static int search(int[] nums, int target) {
        int low=0, high=nums.length-1, mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                high =mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] nums={-1,0,2,4,6,8};
        int target=4;
        System.out.println(search(nums,target));
    }
}
