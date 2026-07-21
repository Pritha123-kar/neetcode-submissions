class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if every frequency is even
        for (int freq : map.values()) {
            if (freq % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}