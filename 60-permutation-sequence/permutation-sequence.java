class Solution {
    
    int count = 0;
    String ans = "";

    void backtrack(int k, char[] a, StringBuilder temp, boolean[] used) {
        int n = a.length;

        if (temp.length() == n) {
            count++;
            if (count == k) {
                ans = temp.toString();
            }
            return;
        }

        for(int i=0; i<n; i++) {
            if(used[i]) continue;

            used[i] = true;
            temp.append(a[i]);

            backtrack(k, a, temp, used);
            if(count == k) return;

            used[i] = false;
            temp.deleteCharAt(temp.length()-1);
        }
    }

    public String getPermutation(int n, int k) {
        char[] ch=new char[n];
        for(int i=1; i<=n; i++) {
            ch[i-1] += (char)(i + '0');
        }

        boolean[] used=new boolean[n];
        backtrack(k, ch, new StringBuilder(), used);

        return ans;
    }
}