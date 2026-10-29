class Solution {
    public int maximumWealth(int[][] accounts) {
        int  greater = 0;
        for(int i=0; i<accounts.length; i++){
           int sum = 0;
            int len = accounts[i].length;
            for(int j=0; j<len; j++){
                sum= sum + accounts[i][j];
                if( sum > greater){
                    greater = sum;
                }

            }
        }
        return greater;
    }
}