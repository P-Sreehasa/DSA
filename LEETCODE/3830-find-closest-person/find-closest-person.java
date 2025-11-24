class Solution {
    public int findClosest(int x, int y, int z) {
        int xz = Math.abs(z - x);
        int yz = Math.abs(z - y);
        if(xz < yz){
            return 1;
        } else if(xz > yz){
            return 2;
        }
        return 0;
    }
}


/*
class Solution {
    public int findClosest(int x, int y, int z) {
        int xz = Math.abs(z - x);    // Calculate the distance from person1 to person3
        int yz = Math.abs(z - y);    // Calculate the distance from person2 to person3
        if(xz < yz){    // If person1 arrives first:
            return 1;    // Return 1
        } else if(xz > yz){    // If person2 arrives first:
            return 2;    // Return 2
        }
        return 0;    // If both person1 and person2 arrive at the same time, return 0
    }
}
*/