class Solution {
    public int[] constructRectangle(int area) {
        int s = (int)Math.sqrt(area);
        for(int i = s; i > 0; i--){
            if(area % i == 0){
                int j = area / i;
                int r[] = new int[2];
                r[0] = Math.max(i, j);
                r[1] = Math.min(i, j);
                return r;
            }
        }
        int r[] = new int[2];
        r[0] = area;
        r[1] = 1;
        return r;
    }
}