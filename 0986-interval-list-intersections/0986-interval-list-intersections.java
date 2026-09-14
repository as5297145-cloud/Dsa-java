class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int a = 0;
        int b = 0;
        while(a<firstList.length && b<secondList.length){
            int startA = firstList[a][0];
            int endA = firstList[a][1];
            int startB = secondList[b][0];
            int endB = secondList[b][1];
            if(startA<=endB && startB<=endA){
                if(startA>=startB && endA>=endB){
                result.add(new int[]{startA,endB});
                b++;
            }
                else if(startA>=startB && endA<=endB){
                result.add(new int[]{startA,endA});
                a++;
            }
                else if(startA<=startB && endA>=endB){
                result.add(new int[]{startB,endB});
                b++;
            }
                else{
                result.add(new int[]{startB,endA});
                a++;
            }
            }
            else{
                if(endA>=endB){
                    b++;
                }
                else{
                    a++;
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}