// This program calculates square root of an integer value

public class Solution {

    public static int squareRoot(int number) {
        if(number < 2) return number;
        int right = number;
        int left = 0;
        while(left < right) {
            int mid = left + (right - left) / 2 + 1;
            if(Math.pow(mid, 2) > number) right = mid - 1;
            else left = mid;
        }
        return left;
    }
    
    public static void main(String[] args) {

        int number = 25;
        int result = squareRoot(number);
        System.out.println(result);

    }
          
}

