class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1 = 0, p2 = 0;
        int i = 0, j= 0;
        while(i < word1.length && j < word2.length){
            if(word1[i].charAt(p1) != word2[j].charAt(p2)){
                return false;
            }
            p1++;
            if(p1 == word1[i].length()){
                i++;
                p1 = 0;
            }
            p2++;
            if(p2 == word2[j].length()){
                j++;
                p2 = 0;
            }
        }
        return i == word1.length && j == word2.length;
    }
}


/*
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1 = 0, p2 = 0;    // Indices for the strings in the 2 arrays
        int i = 0, j= 0;    // Indices for the arrays
        while(i < word1.length && j < word2.length){    // While i and j are in the range of the indices:
            if(word1[i].charAt(p1) != word2[j].charAt(p2)){    // Compare the current characters of both the arrays:
                return false;    // If they're different, strings aren't equal
            }
            p1++;    // Move to the next character of word1
            if(p1 == word1[i].length()){    // If the first string ends:
                i++;    // Move to the next
                p1 = 0;    // Reset the first string 
            }
            p2++;    // Move to the next character of word2
            if(p2 == word2[j].length()){    // If the second string ends:
                j++;    // Move to the next
                p2 = 0;    // Reset the second string  
            }
        }
        return i == word1.length && j == word2.length;    // Return the result by comparing both the arrays
    }
}
*/