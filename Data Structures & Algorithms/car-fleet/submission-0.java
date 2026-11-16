
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        // Store car indices
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort cars by position in descending order
        Arrays.sort(indices, (a, b) ->
            Integer.compare(position[b], position[a])
        );

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            int index = indices[i];

            // Calculate time to reach destination
            double time = (double)(target - position[index])
                          / speed[index];

            // A new fleet is formed if this car
            // takes more time than the fleet ahead
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
