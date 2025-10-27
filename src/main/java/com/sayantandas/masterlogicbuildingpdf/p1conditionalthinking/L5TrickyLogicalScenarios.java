package com.sayantandas.masterlogicbuildingpdf.p1conditionalthinking;

public class L5TrickyLogicalScenarios {
    // 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.
    private static String checkCoordinates(int x, int y) {
        if (x==0 && y==0) {
            return "At the origin";
        } else if (x==0) {
            return "On Y axis";
        } else if (y==0) {
            return "On X axis";
        }
        else {
            return "On Coordinates";
        }
    }

    // 2. Take three numbers and check if they can form a Pythagorean triplet.
    private static boolean pythagoreanTriplet(int x, int y, int z) {
        return ((x*x + y*y == z*z) || (x*x + z*z == y*y) || (y*y + z*z == x*x));
    }

    // 3. Take day and month and check if it forms a valid calendar date (ignoring leap years).
    private static boolean validCalendarDate(int day, int month) {
        return switch (month) {
            case 2 -> day> 0 && day <= 28;
            case 1,3,5,7,8,10,12 -> day> 0 && day <= 31;
            case 4,6,9,11 -> day> 0 && day <= 30;
            default -> false;
        };
    }

    // 4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
    private static void smallestAngleBWHourNMinute(int hour, int minute) {
        if (hour>0 && hour<=12 && minute>=0 && minute<60) {
            float hourAngle = (hour%12 * 60 + minute) / (60.0f * 12.0f) * 360;
            float minuteAngle = minute / 60.0f * 360;

            float angle = Math.abs(hourAngle - minuteAngle);

            if (angle > 180) {
                angle = 360 - angle;
            }

            System.out.println("Angle between hour and minute hand at " + hour + ":" + minute + " is -> " + angle);
        }
        else {
            System.out.println("Invalid time");
        }

    }

    // 5. Take three numbers and check if they are in arithmetic progression.
    private static boolean arithmeticProgression(int a, int b, int c) {
        return (c-b) == (b-a);
    }

    // 6. Take three numbers and check if they are in geometric progression.
    private static boolean geometricProgression(int a, int b, int c) {
        return (b*b) == (c*a);
    }

    // 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
    private static boolean threeDigitCheck(int n) {
        if (n>=100 && n<1000) {
            int fNum = n%10;
            n /=10;
            int mNum = n%10;
            n /=10;
            int lNum = n%10;

            return mNum == fNum+lNum;
        }
        return false;
    }

    // 8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.
    private static boolean sumGTProduct(int n) {
        if (n>0 && n<10000) {
            int sum=0, product=1;
            while (n!=0) {
                sum += n%10;
                product *= n%10;
                n /= 10;
            }
            return sum>product;
        }
        return false;
    }

    // 9. Take two dates (day and month) and determine which one comes first in the calendar.
    private static void greaterDate(int day1, int month1, int day2, int month2) {
        if(validCalendarDate(day1, month1) && validCalendarDate(day2, month2)) {
            if (month1 < month2) {
                System.out.println("Month: " + month1 + ", Day: " + day1 + " is earlier.");
            }
            else if (month1 > month2) {
                System.out.println("Month: " + month2 + ", Day: " + day2 + " is earlier.");
            }
            else {
                if (day1 < day2) {
                    System.out.println("Month: " + month1 + ", Day: " + day1 + " is earlier.");
                }
                else if (day1 > day2) {
                    System.out.println("Month: " + month2 + ", Day: " + day2 + " is earlier.");
                }
                else {
                    System.out.println("Both dates are equal.");
                }
            }
        }
        else {
            System.out.println("Invalid date.");
        }
    }

    // 10. Take a year and print the corresponding century (e.g., “19th century”, “20th century”)
    private static void century(int year) {
        if (year > 0) {
            int century = (year-1) / 100 + 1;
            String titleAfterCentury;

            if (century%100 >= 11 && century%100 <= 13) {
                titleAfterCentury = "th";
            }
            else {
                titleAfterCentury = switch (century % 10) {
                    case 1 -> "st";
                    case 2 -> "nd";
                    case 3 -> "rd";
                    default -> "th";
                };
            }

            System.out.println(year + " is in " + century + titleAfterCentury + " century.");
        }
        else {
            System.out.println("Year is not eligible to count century.");
        }
    }
}
