class Solution {

    void backtrack(int k, char[] a, List<List<Character>> list, List<Character> temp, boolean[] used) {
        int n = a.length;

        if(list.size() == k) return;

        if(temp.size() == n) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<n; i++) {
            if(used[i]) continue;

            used[i] = true;
            temp.add(a[i]);
            backtrack(k, a, list, temp, used);

            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }

    // static List<List<Integer>> permute(char[] ch, int num, int k, List<List<Integer>> list) {
        
    // }

    public String getPermutation(int n, int k) {
        char[] ch=new char[n];
        for(int i=1; i<=n; i++) {
            ch[i-1] += i + '0';
        }

        List<List<Character>> list=new ArrayList<>();
        boolean[] used=new boolean[n];
        backtrack(k, ch, list, new ArrayList<>(), used);

        int ind = 0;
        for(char c : list.get(list.size() - 1)) {
            ch[ind++] = c;
        }

        return new String(ch);
    }
}