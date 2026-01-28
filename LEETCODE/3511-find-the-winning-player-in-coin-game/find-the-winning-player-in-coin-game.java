class Solution {
    public String winningPlayer(int x, int y) {
        boolean a = true;
        while(x >= 1 && y >= 4){
            x -= 1;
            y -= 4;
            a = !a;
        }
        return a ? "Bob" : "Alice";
    }
}