class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(words[i].contains(String.valueOf(x))){
                lst.add(i);
            }
        }
        return lst;
    }
}


/*
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();    // List to store the indices of the words that contain the character x
        for(int i = 0; i < words.length; i++){    // For each word in the array:
            if(words[i].contains(String.valueOf(x))){    // If the current word contains the character 'x':
                lst.add(i);    // Add the current index to the list
            }
        }
        return lst;    // Return the final list
    }
}
*/