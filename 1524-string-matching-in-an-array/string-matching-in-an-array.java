class Solution {
    public List<String> stringMatching(String[] a) {
        List<String> list=new ArrayList<>();
        for(int i=0; i<a.length; i++) {
            String s = a[i];
            for(int j=0; j<a.length; j++) {
                String str = a[j];
                if(j != i && str.indexOf(s) != -1 && !list.contains(s)) list.add(s);
            }
        }
        return list;
    }
}