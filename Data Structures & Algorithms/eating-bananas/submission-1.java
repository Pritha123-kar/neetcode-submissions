class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        //find the maximum pile size
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            long thours=0;

            //calculate total hours needed
            for(int pile:piles){
                thours += (pile+(long)mid-1)/mid;
            }

            if(thours<=h){
                ans=mid;
                high=mid-1;//try a small speed
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
