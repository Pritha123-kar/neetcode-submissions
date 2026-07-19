class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        int pairs = 0;

        // Calculate pairs using nC2 = n(n-1)/2
        for (int i = 1; i <= 100; i++) {
            if (freq[i] > 1) {
                pairs += freq[i] * (freq[i] - 1) / 2;
            }
        }

        return pairs;
    }
}