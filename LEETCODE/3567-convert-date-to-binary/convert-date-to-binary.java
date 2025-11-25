class Solution {
    public String convertDateToBinary(String date) {
        String dt[] = date.split("-");
        int y = Integer.parseInt(dt[0]);
        int m = Integer.parseInt(dt[1]);
        int d = Integer.parseInt(dt[2]);
        String year = Integer.toBinaryString(y);  
        String month = Integer.toBinaryString(m);
        String day = Integer.toBinaryString(d);  
        return year + "-" + month + "-" + day;        
    }
}



/*
class Solution {
    public String convertDateToBinary(String date) {
        String dt[] = date.split("-");    // Array to store the splitted date
        int y = Integer.parseInt(dt[0]);    // Store the first part as year
        int m = Integer.parseInt(dt[1]);    // Store the second part as month
        int d = Integer.parseInt(dt[2]);    // Store the third part as day
        String year = Integer.toBinaryString(y);    // Convert the integer year into binary
        String month = Integer.toBinaryString(m);    // Convert the integer month into binary
        String day = Integer.toBinaryString(d);    // Convert the integer day into binary
        return year + "-" + month + "-" + day;    // Return the final date         
    }
}
*/