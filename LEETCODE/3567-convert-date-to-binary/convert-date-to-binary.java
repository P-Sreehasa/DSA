class Solution {
    public String convertDateToBinary(String date) {
        String dt[] = date.split("-");
        String year = Integer.toBinaryString(Integer.parseInt(dt[0]));
        String month = Integer.toBinaryString(Integer.parseInt(dt[1]));
        String day = Integer.toBinaryString(Integer.parseInt(dt[2]));
        return year + "-" + month + "-" + day;
    }
}


/*
class Solution {
    public String convertDateToBinary(String date) {
        String dt[] = date.split("-");    // Split the date as year, month and day
        String year = Integer.toBinaryString(Integer.parseInt(dt[0]));    // Store the year as its binary form
        String month = Integer.toBinaryString(Integer.parseInt(dt[1]));    // Store the month as its binary form
        String day = Integer.toBinaryString(Integer.parseInt(dt[2]));    // Store the day as its binary form
        return year + "-" + month + "-" + day;    // Return the final binary date
    }
}
*/