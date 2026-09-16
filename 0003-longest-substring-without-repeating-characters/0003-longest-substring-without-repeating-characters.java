class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();

        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        int i = 0;
        int max = 0;

        for (int j = 0; j < arr.length; j++) {

            i = Math.max(i, lastSeen[arr[j]] + 1);

            lastSeen[arr[j]] = j;

            int length = j - i + 1;
            max = Math.max(max, length);
        }

        return max;
    }
}