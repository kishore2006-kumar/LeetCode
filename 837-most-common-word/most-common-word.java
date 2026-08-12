import java.util.regex.Pattern;

class Solution {
    public String mostCommonWord(String para, String[] ban) {
        para = para.replaceAll("[!?',;.]", " ");

        String[] s = para.toLowerCase().trim().split("\\s+");
        System.out.print(Arrays.toString(s));

        StringBuilder sb=new StringBuilder();
        for(String str : ban) {
            sb.append(str);
            sb.append(" ");
        }

        HashSet<String> set=new HashSet<>();
        for(String str : s) {
            if(sb.indexOf(str) == -1) set.add(str);
        }

        System.out.print(set);

        List<String> list=new ArrayList<>(set);

        int[] freq=new int[set.size()];
        for(int j=0; j<list.size(); j++) {
            String str = list.get(j);
            for(int i=0; i<s.length; i++) {
                if(s[i].equals(str)) freq[j]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > max) {
                max = freq[i];
                index = i;
            }
        }

        return index == -1 ? new String() : list.get(index);

        // HashMap<String, Integer> map=new HashMap<>();
        // int max = 0;
        // for(String str : s) {
        //     int count = map.getOrDefault(str, 0) + 1;
        //     map.put(str, count);

        //     if(count > max) {
        //         max = count;
        //         para = str;
        //     }
        // }
        // return para;
    }
}