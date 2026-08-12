import java.util.regex.Pattern;

class Solution {
    public String mostCommonWord(String para, String[] ban) {
        para = para.replaceAll("[!?',;.]", " ");
        for(String str : ban) {
            para = para.replaceAll("(?i)\\b" + Pattern.quote(str) + "\\b", " ");
        }

        String[] s = para.toLowerCase().trim().split("\\s+");
        System.out.print(Arrays.toString(s));

        HashMap<String, Integer> map=new HashMap<>();
        int max = 0;
        for(String str : s) {
            int count = map.getOrDefault(str, 0) + 1;
            map.put(str, count);

            if(count > max) {
                max = count;
                para = str;
            }
        }
        return para;
    }
}