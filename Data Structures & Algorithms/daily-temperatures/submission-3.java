class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> helperStack = new Stack<>();

        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            // Remove temperatures that are smaller
            // or equal to the current temperature
            while (!helperStack.isEmpty() &&
                   temperatures[i] >= temperatures[helperStack.peek()]) {

                helperStack.pop();
            }

            // Find the next warmer day's distance
            if (!helperStack.isEmpty()) {
                result[i] = helperStack.peek() - i;
            }

            // Push current index into stack
            helperStack.push(i);
        }

        return result;
    }
}
