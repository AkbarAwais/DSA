
class Solution {

    public static void main(String[] args) {
        System.out.println(anagram("aaabbb"));
    }

    public static int anagram(String s) {
        // Write your code here
        if (s.length() % 2 == 1) {
            return -1;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length() / 2; i++) {
            freq[s.charAt(i) - 97]++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            freq[s.charAt(i) - 97]--;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count += freq[i];
            }
        }
        return count;
    }
}
