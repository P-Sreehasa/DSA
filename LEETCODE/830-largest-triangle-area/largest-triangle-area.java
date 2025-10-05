class Solution {
    public double largestTriangleArea(int[][] points) {
        double a = 0;
        int n = points.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int x1 = points[i][0]; 
                    int x2 = points[j][0]; 
                    int x3 = points[k][0]; 
                    int y1 = points[i][1];
                    int y2 = points[j][1];
                    int y3 = points[k][1];
                    double ar = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
                    if(ar > a){
                        a = ar;
                    }
                }
            }
        }
        return a;
    }
}


/*
class Solution {
    public double largestTriangleArea(int[][] points) {
        double a = 0;    // Variable to track area
        int n = points.length;    // Find the total no.of points
        for(int i = 0; i < n; i++){    // For each 1st point of the traingle:
            for(int j = i + 1; j < n; j++){    // For each 2nd point of the triangle:
                for(int k = j + 1; k < n; k++){    // For each 3rd point of the triangle:
                    int x1 = points[i][0];    // Calculate the x-coord of the 1st point
                    int x2 = points[j][0];    // Calculate the x-coord of the 2nd point
                    int x3 = points[k][0];    // Calculate the x-coord of the 3rd point
                    int y1 = points[i][1];    // Calculate the y-coord of the 1st point
                    int y2 = points[j][1];    // Calculate the y-coord of the 2nd point
                    int y3 = points[k][1];    // Calculate the y-coord of the 3rd point
                    double ar = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));    // Calculate the area formed by all the 3 points
                    if(ar > a){    // If the area is greater than the previous one: 
                        a = ar;    // Update the area to the current value
                    }
                }
            }
        }
        return a;    // Return the final area
    }
}
*/