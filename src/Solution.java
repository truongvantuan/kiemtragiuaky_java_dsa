class Solution {

    public static int sumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int n1 = n;
        int n2 = n;
        do {
            n1 = sumOfSquare(n1);
            n2 = sumOfSquare(n2);
            n2 = sumOfSquare(n2);
        } while (n1 != n2);
        return n1 == 1;
    }

    public static void main(String[] args) {
        int n = 19;
        if (isHappy(n))
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a Happy number");
    }

}
