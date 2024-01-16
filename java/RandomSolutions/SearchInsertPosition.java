// This program finds correct position in array to insert number

public class Solution {
    
    public static int searchInsert(int[] numbers, int insertNumber) {
            
        int start = 0;
        int end = numbers.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if( numbers[mid] == insertNumber){
                return mid;
            }

            if(numbers[mid] < insertNumber){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
            
        }
        return start;
        
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int insertNumber = 3;
        System.out.println(searchInsert(arr, insertNumber));
    }
}