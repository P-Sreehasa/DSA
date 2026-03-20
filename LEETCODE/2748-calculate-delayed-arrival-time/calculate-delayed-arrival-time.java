class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime + delayedTime) % 24;
    }
}


/*
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime + delayedTime) % 24;    // As it's in 24-hours format, return the remainder as the final arrival time
    }
}
*/