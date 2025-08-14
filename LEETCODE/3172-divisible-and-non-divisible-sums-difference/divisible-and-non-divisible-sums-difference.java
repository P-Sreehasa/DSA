class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;  
        int not_div = 0;  
        for(int i = 1; i <= n; i++){  
            if(i % m == 0){  
                div += i;   
            }else{  
                not_div += i;   
            }
        }
        return (not_div - div); 
    }
}


/*
    public int differenceOfSums(int n, int m) {
        int div = 0;   // To keep count of numbers divisible by m
        int not_div = 0;   // To keep count of numbers NOT divisible by m
        for(int i = 1; i <= n; i++){   // Since the range is: [1, n]
            if(i % m == 0){   // If i is divisible by m
                div += i;   // Add current index to div
            }else{   // If i isn't divisible by m 
                not_div += i;   // Add that index to not_div
            }
        }
        return (not_div - div); // Return the difference of both
    }
*/