class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int min = nums[0];
        int max = nums[nums.length-1];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int key=min; key<=max; key++) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(int key : nums) {
            map.put(key, map.getOrDefault(key, 0) - 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if(value > 0) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}