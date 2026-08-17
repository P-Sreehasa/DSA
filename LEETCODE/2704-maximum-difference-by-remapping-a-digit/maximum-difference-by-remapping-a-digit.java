class Solution {
    public int minMaxDifference(int num) {
        String n = String.valueOf(num);
        char r1 = ' ';
        for(char c : n.toCharArray()){
            if(c != '9'){
                r1 = c;
                break;
            }
        }
        String maxx = n;
        if(r1 != ' '){
            maxx = n.replace(r1, '9');
        }
        char r2 = n.charAt(0);
        String minn = n.replace(r2, '0');
        return Integer.parseInt(maxx) - Integer.parseInt(minn);
    }
}
