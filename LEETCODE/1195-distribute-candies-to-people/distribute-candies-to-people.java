class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int r[] = new int[num_people];
        int c = 1;
        int i = 0;
        while(candies > 0){
            int can = Math.min(c, candies);
            r[i] += can;
            candies -= can;
            i = (i + 1) % num_people;
            c++;
        }
        return r;
    }
}