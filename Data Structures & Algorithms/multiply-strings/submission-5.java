class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n = num1.length();
        int m = num2.length();
        int[] res = new int[n+m];
        for(int i= n-1; i>=0; i--){
            for(int j= m-1; j>=0; j--){
                int n1 = num1.charAt(i)-'0';
                int n2 = num2.charAt(j)-'0';
                int pro = n1 * n2;
                int p1 = i+j;
                int p2 = i+j+1;
                int sum = res[p2]+pro;
                res[p2] = sum%10;
                res[p1] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int d : res){
            if(sb.length() == 0 && d == 0) continue;
            sb.append(d);
        }
        return sb.toString();
    }
}
