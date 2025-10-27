package com.sayantandas.masterlogicbuildingpdf.p1conditionalthinking;

public class L3MathAndNumberLogic {
    public static void main(String[] args) {
        //1. Take a 3-digit number and check if all digits are distinct.
        distinctDigits(1);
        distinctDigits(13);

    }

    // 1. Take a 3-digit number and check if all digits are distinct.
    private static void distinctDigits(int n) {
        if (n<0) {
            System.out.println("Number can't be negative");
            return;
        }

        String number = String.valueOf(n);
        if(number.length() == 3) {
            int fDigit = number.charAt(2) - '0';
            int sDigit = number.charAt(1) - '0';
            int tDigit = number.charAt(0) - '0';

            if ((fDigit != sDigit) && (sDigit != tDigit) && (fDigit != tDigit)) {
                System.out.println("All digits are distinct.");
            }
            else {
                System.out.println("All digits are not distinct");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

    // 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
    private static void midDigitStatus(int n) {
        if (n<0) {
            System.out.println("Number can't be negative");
            return;
        }

        String number = String.valueOf(n);
        if(number.length() == 3) {
            int fDigit = number.charAt(2) - '0';
            int sDigit = number.charAt(1) - '0';
            int tDigit = number.charAt(0) - '0';

            if (sDigit == Math.max(fDigit,Math.max(sDigit,tDigit))) {
                System.out.println("Largest.");
            }
            else if (sDigit == Math.min(fDigit,Math.min(sDigit,tDigit))) {
                System.out.println("Smallest.");
            } else {
                System.out.println("Neither.");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

    // 3. Take a 4-digit number and check if the first and last digits are equal.3. Take a 4-digit number and check if the first and last digits are equal.
    private static void eqInFstAndLst(int n) {
        if (n<0) {
            System.out.println("Number can't be negative");
            return;
        }

        String number = String.valueOf(n);
        if(number.length() == 4) {
            int fDigit = number.charAt(3) - '0';
            int lDigit = number.charAt(0) - '0';

            if (fDigit == lDigit) {
                System.out.println("First and Last digits are equal.");
            }
            else {
                System.out.println("First and Last digits are not equal.");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

    // 4. Check whether a given integer is single-digit, double-digit, or multi-digit.
    private static String stateDigit(int n) {
        if(n/100 == 0) {
            if (n/10 == 0) {
                return "Single Digit";
            }
            else {
                return "Double Digit";
            }
        }
        else {
            return "Multi digit";
        }
    }

    // 5. Check if a number is a multiple of 7 or ends with 7.
    private static String mulOrEndsW7(int n) {
        boolean mul7 = n%7 == 0;
        boolean endsW7 = n%10 == 7;

        if (mul7 && endsW7) {
            return n + " is multiple of 7 & ends with 7";
        }
        else if(mul7) {
            return n + " is multiple of 7";
        }
        else if (endsW7) {
            return n + " is ends with 7";
        }
        else {
            return n + " is neither multiple of 7 nor ends with 7";
        }
    }

    // 6. Take coordinates (x, y) and determine which quadrant the point lies in.
    private static String stateCoordinates(int x, int y) {
        if (x == 0 && y == 0) {
            return "Origin";
        } else if (x == 0) {
            return "Y-Axis";
        } else if (y == 0) {
            return "X-Axis";
        } else if (x>0 && y>0) {
            return "1st Coordinate";
        } else if (x<0 && y>0) {
            return "2nd Coordinate";
        } else if (x<0 && y<0) {
            return "3rd Coordinate";
        }else {
            return "4th Coordinate";
        }
    }

    // 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
    private static void canbedivided(int actualAmount) {
        int amount = actualAmount;
        int twoThousand = amount/2000;
        amount %= 2000;
        int fiveHundred = amount/500;
        amount %= 500;
        int hundred = amount/100;
        amount %= 100;

        if (amount == 0) {
            System.out.println(actualAmount + " can be evenly divided into 2000, 500, and 100 currency notes.");
        }
        else {
            System.out.println(actualAmount + " can not be evenly divided into 2000, 500, and 100 currency notes.");
        }
    }

    // 8. Check if a number lies within the range [100, 999].
    private static void fitsInRange(int number) {
        if (number>=100 && number<=999) {
            System.out.println(number + " lies within the range [100, 999].");
        }
        else {
            System.out.println(number + " does not lie within the range [100, 999].");
        }
    }

    // 9. Take two angles of a triangle and compute the third angle.
    private static void thirdAngle(int angle1, int angle2) {
        if(angle1 + angle2 >= 180) {
            System.out.println("Triangle can not be possible.");
        }
        else {
            System.out.println("Third angle of the triangle is " + (180 - (angle1 + angle2)));
        }
    }

    // 10. Check whether a number is a perfect square (without using the square root function).
    private static void perfectSquare(int number) {
        if (number == 0 || number == 1) {
            System.out.println(number + " is a perfect square.");
        }

        int num = 2;
        while (num*num < number) {
            num++;
        }

        if (num*num == number) {
            System.out.println(number + " is a perfect square.");
        }
        else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}