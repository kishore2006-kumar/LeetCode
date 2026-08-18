class Solution {

    public static boolean contains(int[] arr, int x) {
        for(int val : arr) {
            if(val == x) return true;
        }
        return false;
    }

    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int min = nums[0];
        int max = nums[nums.length-1];

        for(int val=min; val<=max; val++) {
            if(!contains(nums, val)) {
                list.add(val);
            }
        }
        
        Collections.sort(list);
        return list;
    }
}