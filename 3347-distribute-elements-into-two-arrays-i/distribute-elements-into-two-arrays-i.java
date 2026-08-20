class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int a = 0;
        int b = 0;
        for(int i=2; i<n; i++) {
            if(arr1[a] > arr2[b]) {
                a++;
                arr1[a] = nums[i];
            }
            else {
                b++;
                arr2[b] = nums[i];
            }
        }
        System.out.print(Arrays.toString(arr1) + " " + Arrays.toString(arr1));
        for(int i=0; i<=b; i++) {
            a++;
            arr1[a] = arr2[i];
        }

        return arr1;
    }
}