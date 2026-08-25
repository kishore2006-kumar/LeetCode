class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] a=new int[s.length()];
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) list.add(i);
        }
        Collections.sort(list);
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != c) {
                int min = Integer.MAX_VALUE;
                for(int x : list) {
                    min = Math.min(min, Math.abs(x-i));
                }
                a[i] = min;
            }
        }
        return a;
    }
}