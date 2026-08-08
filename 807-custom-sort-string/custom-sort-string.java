class Solution {
    public String customSortString(String str, String s) {
        char[] a = s.toCharArray();
        StringBuilder sb=new StringBuilder();

        for(char ch : str.toCharArray()) {
            for(int i=0; i<a.length; i++) {
                if(ch == a[i]) {
                    sb.append(ch);
                    a[i] = '*';
                }
            }
        }
        for(char ch : a) {
            if(ch != '*') sb.append(ch);
        }
        return sb.toString();
    }
}