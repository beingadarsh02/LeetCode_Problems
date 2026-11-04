class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1, sum = 0;
        
        int len = digits.length;
        
        for(int i = len -1 ; i >= 0; i--){
            if(( digits[i] + carry) <= 9){
                digits[i] = digits[i] + carry;
                carry = 0;
                return digits;

            } else{
                digits[i] = 0;
                carry = 1;
            }
        }
        int[] arr = new int[len + 1];
        if(carry == 1){
            
            arr[0] = 1;
        }
        return arr;
    }
}