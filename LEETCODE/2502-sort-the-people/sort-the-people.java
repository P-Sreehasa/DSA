class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer n[] = new Integer[names.length];
        for(int i = 0; i < names.length; i++){
            n[i] = i;
        }
        Arrays.sort(n, (a, b) -> heights[b] - heights[a]);
        String arr[] = new String[names.length];
        for(int i = 0; i < names.length; i++){
            arr[i] = names[n[i]];
        }
        return arr;
    }
}