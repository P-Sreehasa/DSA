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


/*
class Solution {
    public String winningPlayer(int x, int y) {
        boolean a = true;    // Tracks whose turn it is
        while(x >= 1 && y >= 4){    // As long as each player makes a move:
            x -= 1;    // Decrement 1 coin from value - 75
            y -= 4;    // Decrement 4 coins from value - 10
            a = !a;    // Give chance to the other player
        }
        return a ? "Bob" : "Alice";    // If a is true then Bob wins, otherwise Alice
    }
}
*/