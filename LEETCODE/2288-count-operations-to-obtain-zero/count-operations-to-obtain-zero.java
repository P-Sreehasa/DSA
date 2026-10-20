class Solution {
    public int countOperations(int num1, int num2) {
        int count1 = 0;
        int count2 = 0;
        while(num1 > 0 && num2 > 0){
            if(num1 >= num2){
                num1 -= num2;
                count1++;
            } else{
                num2 -= num1;
                count2++;
            }
        }
        return count1 + count2;
    }
}