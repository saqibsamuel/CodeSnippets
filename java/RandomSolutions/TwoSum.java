// This program returns two positions of elements which sum is equal to desired total
public class Solution {
    
    public static int[] TwoSum(int[] numbers, int total) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int total_sum = numbers[i] + numbers[j];

                if(total_sum == total){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            
            }
        }
        throw new IllegalArgumentException("No solution for two sum");
    }

    public static void main(String[] args) {
        int[] array = {1,4,6,8,10,11,13,16,19,20};
        int total = 28;
        int result[] = TwoSum(array, total);
        for(int k : result){
            System.out.print(k + " ");
        }
    }
}