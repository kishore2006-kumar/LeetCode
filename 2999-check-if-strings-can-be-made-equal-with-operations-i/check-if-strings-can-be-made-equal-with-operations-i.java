class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        int n = ch1.length;
        for (int i = 0; i < n; i++) {
            if (ch1[i] == ch2[i]) {
                continue;
            }
            if (i + 2 < n && ch2[i + 2] == ch1[i]) {

                char temp = ch2[i];
                ch2[i] = ch2[i + 2];
                ch2[i + 2] = temp;
            }
        }
        return Arrays.equals(ch1, ch2);
    }
}