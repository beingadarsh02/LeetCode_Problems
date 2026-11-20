class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] num = new int[nums.length];
        for(int i=0 ; i<=nums.length - 1 ; i++){
            num[i] = nums[i]*nums[i]; 
        }
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0; j<n-1-i ; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
        
    }
}