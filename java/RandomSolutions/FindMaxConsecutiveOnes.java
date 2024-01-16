// This program return the maximum number of consecutive 1's in the array.
public class Solution {

    public static void main(String[] args) {
        
        int[] arr = {1,0,1,1,1,0,1};

        int currentCount = 0;
        int max = 0;

        for(int loop=0; loop < arr.length; loop++){

            if(arr[loop] == 1){
                currentCount++;
                max = Math.max(max,currentCount);
            }else{
                currentCount = 0;
            }
        }
        System.out.println("")
    }
}