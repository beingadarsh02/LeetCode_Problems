class Solution {
    public void moveZeroes(int[] num) {
      int len = num.length;
      int i = 0;
      int j = 0;
      while(i < len){
        if( num[i] != 0){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            j++;
        }
        i++;
            

            
        }
      
      
      
    }
}