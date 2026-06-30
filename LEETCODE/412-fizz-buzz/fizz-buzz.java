class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                r.add("FizzBuzz");
            } else if(i % 3 == 0){
                r.add("Fizz");
            } else if(i % 5 == 0){
                r.add("Buzz");
            } else{
                r.add(Integer.toString(i));
            }
        }
        return r;
    }
}


/*
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();    // Create an ArrayList to store the result
        for(int i = 1; i <= n; i++){    // For each index in the range of 1 to n:
            if(i % 3 == 0 && i % 5 == 0){    // If the number is divisible by both 3 and 5:
                r.add("FizzBuzz");    // Add "FizzBuzz" to the list
            } else if(i % 3 == 0){    // If the number is divisible only by 3:
                r.add("Fizz");    // Add "Fizz" to the list
            } else if(i % 5 == 0){    // If the number is divisible only by 5:
                r.add("Buzz");    // Add "Buzz" to the list
            } else{    // If the number is neither divisible by 3, nor by 5:
                r.add(Integer.toString(i));    // Convert the number to a string and add it to the list
            }
        }
        return r;    // Return the final ArrayList
    }
}
*/