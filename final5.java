
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return arrayIndex(input,x,0);
	}
   public static int[] arrayIndex (int [] arr, int ele, int startIndx){
       if(startIndx==arr.length){
           int [] rr= {};
           return rr;
       }

       int[]  returnofIndexes = arrayIndex(arr,ele,startIndx+1);
           if(arr[startIndx]==ele){
               int [] totalIndex= new int[returnofIndexes.length+1];
               totalIndex[0]=startIndx;

       int[]  returnofIndexes = arrayIndex(arr,ele,startIndx+1);
           if(arr[startIndx]==ele){
               int [] totalIndex= new int[returnofIndexes.length+1];
               totalIndex[0]=startIndx;


           for (int i=0; i<returnofIndexes.length; i++) {
               totalIndex[i+1]= returnofIndexes[i];
           }
           return totalIndex;

           }
           else{
               return returnofIndexes;
           }
       }

	
}
