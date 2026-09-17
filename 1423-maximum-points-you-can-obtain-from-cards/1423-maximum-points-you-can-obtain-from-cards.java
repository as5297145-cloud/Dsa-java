class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int c = cardPoints.length-k;
       int s = 0;
       int e = c;
       int sum = 0;
       int csum = 0;
       for(int i = 0;i<cardPoints.length;i++){
        sum+=cardPoints[i];
       }
       for(int j =0;j<c;j++){
        csum+=cardPoints[j];
       }
       int min = csum;
       while(e<cardPoints.length){
        csum=csum+cardPoints[e]-cardPoints[s];
        e++;
        s++;
        min = Math.min(csum,min);
       }
    return sum-min;
    }
}