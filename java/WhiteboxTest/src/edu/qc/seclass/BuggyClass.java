package edu.qc.seclass;
public class BuggyClass {

    /**
     * 100% no fault coverage: number > 2
     * <50% with a fault statement coverage is possible if number = 2
     */

    public double buggyMethod1(int number) {
        int temp = 1;
        if (number > 1) {
            temp = temp / (number - 2);
            number--;
            number = number * 10;
            temp = temp - number;
        }
        return temp + number;
    }

    /**
     * 100% statement coverage with no fault: number1 and number2 must be a positive integer
     * >50% branch coverage with a fault: either number1 or number2 is zero
     */

    public double buggyMethod2(int number1, int number2) {
        int counter = 0;
        if (number1 != 0) {
            counter++;
        }
        if (number2 != 0) {
            counter++;
        }
        return counter + 1/number1 + 1/number2;
    }

    // 100% branch coverage with no fault: number (1,-1)
    // 100% statement coverage and <100% branch coverage with a fault: x = 2

    public double buggyMethod3(int number) {
        int temp = 1;
        if (number >=0) {
            number--;
        }
        return temp / (number - 2);
    }

    public void buggyMethod4() {
        /**
         * This test suit is not possible because 100% branch coverage leads to 100%
         * statement coverage. To pass 100% branch coverage, test/suite has to execute all the paths.
         * This implies that the test/suite also have 100% statement coverage
         * Therefore test/suite written for this buggyMethod4 shall have 100% statement coverage
         */

    }

    public void buggyMethod5(int i) {
        /**
         * This is not possible to have a method which has 100% statement coverage without having/revealing the fault.
         * As per code, 100% statement coverage is only possible when code x = i/0 is executed
         * However, execution of x = 1/0 shall raise divide-by-zero exception
         * It is clear from the sample code that it does not implement the try-catch block, therefore it is not possible
         * to prevent this divide-by-zero exeption from being thrown
         * Call the given method shall reveal the fault.
         */
    }
}