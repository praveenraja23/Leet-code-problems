class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            int t = num.charAt(i) - '0';
            arr[i] += t;
            arr[t]--;
        }
        for (int i : arr)
            if (i != 0)
                return false;
        return true;
    }
}