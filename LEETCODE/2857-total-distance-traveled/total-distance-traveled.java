class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int d = 0;
        while(mainTank >= 5){
            mainTank -= 5;
            d += 10 * 5;
            if(additionalTank > 0){
                mainTank += 1;
                additionalTank -= 1;
            }
        }
        d += mainTank * 10;
        return d; 
    }
}


/*
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int d = 0;    // Variable to store the distance travelled
        while(mainTank >= 5){    // As long as the mainTank has at least 5 liters of fuel:
            mainTank -= 5;    // Decrement it by 5
            d += 10 * 5;    // Multiply it with the mileage (Since, the truck has a mileage of 10 km per liter)
            if(additionalTank > 0){    // If there is fuel left in the additionalTank:
                mainTank += 1;    // Increment the mainTank by 1
                additionalTank -= 1;    // Decrement the additionalTank by 1
            }
        }
        d += mainTank * 10;    // If the mainTank doesn't have more than 5 liters of fuel, multiply the amount left with 10 (use it for the mainTank)
        return d;    // Return the final distance
    }
}
*/