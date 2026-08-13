class Solution {

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void moveZeroes(int[] arr) {
        int n = 0;
        int len = arr.length;
        
        while(n < len) {
            while(n < len && arr[n] != 0) {
                n++;
            }
            if(n < len) {
                int i = n;
                while(i < len && arr[i] == 0) i++;
                if(i == len) break;
                swap(arr, n, i);
            }
        }
    }
}