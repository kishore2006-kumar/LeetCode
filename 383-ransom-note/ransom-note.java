class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb=new StringBuilder(magazine);
        for(char ch : ransomNote.toCharArray()) {
            String s = sb.toString();
            if(s.indexOf(ch) != -1) {
                sb.deleteCharAt(s.indexOf(ch));
            }
            else {
                return false;
            }
        }
        return true;
    }
}