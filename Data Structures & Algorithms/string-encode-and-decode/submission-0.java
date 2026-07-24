

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length of the string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            res.add(str.substring(j + 1, j + 1 + len));

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return res;
    }
}