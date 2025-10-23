class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                x = x - 1;
            } else if(operations[i].equals("++X") || operations[i].equals("X++")){
                x = x + 1;
            } 
        }
        return x;
    }
}


/*
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;    // Variable to store the initial value of x
        for(int i = 0; i < operations.length; i++){    // For each value in the operations array:
            if(operations[i].equals("--X") || operations[i].equals("X--")){    // If the operation is Pre-decrement or Post-decrement:
                x = x - 1;    // Decrement the value of x by 1
            } else if(operations[i].equals("++X") || operations[i].equals("X++")){    // If the operation is Pre-increment or Post-increment:
                x = x + 1;    // Increment the value of x by 1
            } 
        }
        return x;    // Return the final value of x
    }
}
*/