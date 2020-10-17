package exercises;

public class Main {
    static int computeTheSum(int a, int b) {
        int output = 0;
        if (b == 0 || a == b) {
            b = a;
            output = a;
            for (int i = 0; i < 2; i++) {
                output *= a;
            }
        } else {
            output = a + b;
        }
        return output;
    }

    static int absoluteDifference(int n) {
        int output = 0;

        if (n > 51) {
            return (n - 51) * 3;
        }
         output = 51 - n;

        return output;
    }

    static boolean checkTwoIntegrers(int a, int b) {
        if (a == 30 || b == 30) {
            return true;
        } else return a + b == 30;
    }

    static boolean checkRange(int a) {
        if (a > 10 && a < 100) {
            return true;
        } else return a >= 100 && a < 200;
    }

    static boolean checkIfNumberIsAMultipleOf3Or7(int a) {
        return a % 3 == 0 || a % 7 == 0;
    }

    static boolean checkLessThanZeroOrMoreThanHundert(int a, int b) {
        return a < 0 && b > 100 || b < 0 && a > 100;
    }

    static boolean checkRange100200(int a, int b) {
        return (a >= 100 && a <= 200) && (b >= 100 && b <= 200);
    }

    static boolean checkThreeIntegerRange2050(int a, int b, int c) {
        return (a >= 20 && a <= 50) || (b >= 20 && b <= 50) || (c >= 20 && c <= 50);
    }

    static int whichOfGivenNumbersIsCloserTo100(int a, int b) {
        int x = 100;
        int diffA, diffB = 0;
        if (a < 100 && b < 100) {
            diffA = x - a;
            diffB = x - b;
            if (diffA > diffB) {
                return b;
            } else if (diffA < diffB) {
                return a;
            }
        }
        return 0;
    }

    static boolean checkRange4050Or5060Inclusive(int a, int b) {
        return ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) || ((a >= 50 && a <= 60) && (b >= 50 && b <= 60));
    }

    static int findLargerValueInRange(int a, int b) {
        if (a >= 20 && a <= 30 && b >= 20 && b <= 30) {
            if (a > b) return a;
            else if (b > a) return b;
            else return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findLargerValueInRange(21, 27));
    }
}
