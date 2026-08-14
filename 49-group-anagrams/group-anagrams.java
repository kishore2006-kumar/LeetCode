class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<String> list=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();

        for(String s : str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);

            map.computeIfAbsent(ss, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}