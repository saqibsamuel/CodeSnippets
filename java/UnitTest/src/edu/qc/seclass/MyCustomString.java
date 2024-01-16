package edu.qc.seclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCustomString implements MyCustomStringInterface {

    private String currentString;

    /**
     * Returns the current string. If the string is null, it should return null.
     *
     * @return Current string
     */
    @Override
    public String getString() {
        // check if current string is null
        if(this.currentString == null){
            return null;
        }
        return this.currentString;
    }

    /**
     * Sets the value of the current string.
     *
     * @param string The value to be set
     */
    @Override
    public void setString(String string) {
        this.currentString = string;
    }

    /**
     * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous sequence of digits.
     * <p>
     * If the current string is empty, the method should return 0.
     * <p>
     * Examples:
     * - countNumbers would return 2 for string "My numbers are 11 and 96".
     *
     * @return Number of numbers in the current string
     * @throws NullPointerException If the current string is null
     */
    @Override
    public int countNumbers() throws NullPointerException{

        int numberCount = 0;

        // Exception Handling

        if(this.getString() == null){
            throw new NullPointerException();
        }

        Pattern pattern = Pattern.compile(("\\d+"));
        Matcher m = pattern.matcher(this.getString());

        while(m.find()){
            numberCount++;
        }
        // Return numberCount in a string either 0 or more
        return numberCount;
    }

    /**
     * Returns a string that consists of all and only the characters in positions n, 2n, 3n, and
     * so on in the current string, starting either from the beginning or from the end of the
     * string. The characters in the resulting string should be in the same order and with the
     * same case as in the current string.
     * <p>
     * If the current string is empty or has less than n characters, the method should return an
     * empty string.
     * <p>
     * Examples:
     * - For n=2 and a string of one character, the method would return an empty string.
     * - For n=2 and startFromEnd=false, the method would return the 2nd, 4th, 6th, and so on
     * characters in the string.
     * - For n=3 and startFromEnd=true, the method would return the 3rd from the last character
     * in the string, 6th from the last character in the string, and so on (in the order in
     * which they appear in the string).
     * <p>
     * Values n and startFromEnd are passed as parameters. The starting character, whether it is
     * the first one or the last one in the string, is considered to be in Position 1.
     *
     * @param n            Determines the positions of the characters to be returned
     * @param startFromEnd Determines whether to start counting from the end or from the
     *                     beginning when identifying the characters in position n, 2n, 3n, and so
     *                     on. Please note that the characters are always returned in the order in
     *                     which they appear in the string.
     * @return String made of characters at positions n, 2n, and so on in the current string
     * @throws IllegalArgumentException If "n" less than or equal to zero
     * @throws NullPointerException     If the current string is null and "n" is greater than zero
     */
    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) throws IllegalArgumentException , NullPointerException{

        StringBuilder stringBuilder = new StringBuilder();

        int stringIndex = 0;
        int newStringIndex = 0;
        int internalCount = 1;

        if (n <= 0 || n > this.getString().length()) {
            throw new IllegalArgumentException();
        }

        if(this.getString() == null && n > 0 ){
            throw new NullPointerException();
        }

        if(this.getString().length() == 1){
            return null;
        }

        if(startFromEnd){

            //reverse string
            for (int i = this.getString().length() - 1; i >= 0; i--) {

                if(stringIndex <= this.getString().length()){
                    stringBuilder.append(this.getString().charAt(i));
                }
            }

            String reversedString = stringBuilder.toString();
            stringBuilder.delete(0,stringBuilder.length());

            while (stringIndex < reversedString.length()) {

                stringIndex =  internalCount * n;
                if(stringIndex <= reversedString.length()){
                    newStringIndex = reversedString.length() - stringIndex;
                    stringBuilder.append(reversedString.charAt(newStringIndex+1));
                    internalCount++;
                }
            }

        }else{

            while (stringIndex < this.getString().length()) {

                stringIndex =  internalCount * n;
                if(stringIndex <= this.getString().length()){
                    stringBuilder.append(this.getString().charAt(stringIndex-1));
                    internalCount++;
                }
            }
        }

        return stringBuilder.toString();

    }

    /**
     * Replace the individual digits in the current string, between startPosition and endPosition
     * (included), with the corresponding English names of those digits, with the first letter
     * capitalized. The first character in the string is considered to be in Position 1.
     * Unlike for the previous method, digits are converted individually, even if contiguous.
     * <p>
     * Examples:
     * - String 460 would be converted to FourSixZero
     * - String 416 would be converted to FourOneSix
     *
     * @param startPosition Position of the first character to consider
     * @param endPosition   Position of the last character to consider
     * @throws IllegalArgumentException    If "startPosition" > "endPosition"
     * @throws MyIndexOutOfBoundsException If "startPosition" <= "endPosition", but either
     *                                     "startPosition" or "endPosition" are out of
     *                                     bounds (i.e., either less than 1 or greater than the
     *                                     length of the string)
     * @throws NullPointerException        If "startPosition" <= "endPosition", "startPosition" and
     *                                     "endPosition" are greater than 0, and the current
     *                                     string is null
     */
    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) throws IllegalArgumentException, MyIndexOutOfBoundsException, NullPointerException{

        // Handle Exceptions

        if(startPosition > endPosition){
            throw new IllegalArgumentException();
        }
        if(startPosition < 1 || endPosition > this.getString().length()){
            throw new MyIndexOutOfBoundsException();
        }
        if(startPosition > 0 && endPosition > 0 && this.getString() == null){
            throw new NullPointerException();
        }

        String newString = this.getString().substring(startPosition -1, endPosition);
        newString = newString.replaceAll("0", "Zero");
        newString = newString.replaceAll("1", "One");
        newString = newString.replaceAll("2", "Two");
        newString = newString.replaceAll("3", "Three");
        newString = newString.replaceAll("4", "Four");
        newString = newString.replaceAll("5", "Five");
        newString = newString.replaceAll("6", "Six");
        newString = newString.replaceAll("7", "Seven");
        newString = newString.replaceAll("8", "Eight");
        newString = newString.replaceAll("9", "Nine");

        this.setString(this.getString().substring(0, startPosition-1) + newString
                + this.getString().substring(endPosition, this.getString().length()));

    }
}
