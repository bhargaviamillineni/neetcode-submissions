class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            n = sumdigit(n);
        }
        return n == 1;
    }
    public int sumdigit(int num){
        int sum =0;
        while(num != 0){
            int digit = num%10;
            sum += digit*digit;
            num = num/10;
        }
        return sum;
    }
}
