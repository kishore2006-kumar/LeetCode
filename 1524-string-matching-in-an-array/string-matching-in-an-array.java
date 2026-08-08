class Solution {
    public List<String> stringMatching(String[] a) {
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(int i=0; i<a.length; i++) {
            String s = a[i];
            for(int j=0; j<a.length; j++) {
                String str = a[j];
                if(j != i && str.indexOf(s) != -1) set.add(s);
            }
        }
        // for(String x : set) {
        //     list.add(set);
        // }
        return new ArrayList<>(set);
    }
}