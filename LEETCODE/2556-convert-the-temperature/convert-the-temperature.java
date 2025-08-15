class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        double ans[] = {k, f};
        return ans;
    }
}


/*
class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;    // Using: Kelvin = Celsius + 273.15
        double f = celsius * 1.80 + 32.00;    // Using: Fahrenheit = Celsius * 1.80 + 32.00
        double ans[] = {k, f};    
        return ans;    // Question says to return the answer as an array, ans = [kelvin, fahrenheit]
    }
}
*/