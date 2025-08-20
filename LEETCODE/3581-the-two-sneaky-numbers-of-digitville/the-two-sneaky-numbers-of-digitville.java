class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(!s.add(nums[i])){
                l.add(nums[i]);
                if(l.size() == 2){
                    break;
                }
            }
        }
        int res[] = new int[2];
        res[0] = l.get(0);
        res[1] = l.get(1);
        return res;
    }
}


/*
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();    // HashSet for storing unique values
        List<Integer> l = new ArrayList<>();    // List for storing the duplicate values
        int n = nums.length;    // Length of the nums array
        for(int i = 0; i < n; i++){    // Looping through the array
            if(!s.add(nums[i])){    // nums[i] is being added into Set s, but as there's negation, it means that we are looking for the duplicate values. So, if there are any repeatitive elements:
                l.add(nums[i]);    // Add them to the list
                if(l.size() == 2){    // Since the mentioned value is 2
                    break;    // Break the loop after the list's value reaches 2
                }
            }
        }
        int res[] = new int[2];    // For storing the 2 duplicate elements of the list
        res[0] = l.get(0);    // First duplicate value
        res[1] = l.get(1);    // Second duplicate value
        return res;    // Return the array containing both the duplicates
    }
}
*/