class Solution {
    public boolean isBoomerang(int[][] points) {
        if(points[0][0] == points[1][0] && points[0][1] == points[1][1]){
            return false;
        }
        if(points[0][0] == points[2][0] && points[0][1] == points[2][1]){
            return false;
        }
        if(points[1][0] == points[2][0] && points[1][1] == points[2][1]){
            return false;
        }
        return (points[0][0] - points[1][0]) * (points[1][1] - points[2][1]) != (points[1][0] - points[2][0]) * (points[0][1] - points[1][1]);
    }
}


/*
class Solution {
    public boolean isBoomerang(int[][] points) {
        if(points[0][0] == points[1][0] && points[0][1] == points[1][1]){    // To check if the points 0 and 1 are the same:
            return false;    // If yes, then it's not a boomerang
        }
        if(points[0][0] == points[2][0] && points[0][1] == points[2][1]){   // To check if the points 0 and 2 are the same:
            return false;    // If yes, then it's not a boomerang
        }
        if(points[1][0] == points[2][0] && points[1][1] == points[2][1]){   // To check if the points 1 and 2 are the same:
            return false;    // If yes, then it's not a boomerang
        }
        return (points[0][0] - points[1][0]) * (points[1][1] - points[2][1]) != (points[1][0] - points[2][0]) * (points[0][1] - points[1][1]);    // If area is not 0, then the points aren't on the same line
    }
}
*/