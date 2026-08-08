class Solution {
    public int totalNumbers(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int a = arr[i]*100 + arr[j]*10 + arr[k];
                    int b = arr[i]*100 + arr[k]*10 + arr[j];
                    int c = arr[j]*100 + arr[i]*10 + arr[k];
                    int d = arr[j]*100 + arr[k]*10 + arr[i];
                    int e = arr[k]*100 + arr[i]*10 + arr[j];
                    int f = arr[k]*100 + arr[j]*10 + arr[i];
                    if(a%2 == 0 && a>99) set.add(a);
                    if(b%2 == 0 && b>99) set.add(b);
                    if(c%2 == 0 && c>99) set.add(c);
                    if(d%2 == 0 && d>99) set.add(d);
                    if(e%2 == 0 && e>99) set.add(e);
                    if(f%2 == 0 && f>99) set.add(f);
                }
            }
        }
        return set.size();
    }
}