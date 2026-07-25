class Solution {
    public int[] replaceElements(int[] arr) {
        final int[] result = new int [arr.length];
        Arrays.fill(result,-1);
        int currentMax=-1;

        for(int i=arr.length-1;i>=0;i--){
            result[i]=currentMax;
            currentMax=Math.max(currentMax,arr[i]);
        }
        return result;
    }
}