class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int arr[] = new int[128]; 
        for(char a : jewels.toCharArray()){
            arr[a] = 1;
        }
        int c = 0;
        for(char a : stones.toCharArray()){
            if(arr[a] == 1){
                c++;
            }
        }
        return c;
    }
}