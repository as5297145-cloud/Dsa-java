class Solution {
    public String reverseVowels(String s) {
      String v = "aeiouAEIOU";
      char[] arr = s.toCharArray();
      int i =0;
      int j=arr.length-1;
      while(i<=j){
        if(v.indexOf(arr[i])!=-1 && v.indexOf(arr[j])!=-1){
            swap(arr,i,j);
            i++;
            j--;
        }
        else if(v.indexOf(arr[i])==-1 && v.indexOf(arr[j])!=-1){
            i++;
        }
        else if(v.indexOf(arr[i])!=-1 && v.indexOf(arr[j])==-1){
            j--;
        }
        else{
            i++;
            j--;
        }
      } 
      return new String(arr); 
    }
    public void swap(char[] arr,int f,int e){
        char t = arr[f]; 
        arr[f] = arr[e];
        arr[e] = t;
    }
}