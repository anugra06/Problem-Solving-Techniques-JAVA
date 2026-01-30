package task2;

import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

public class LambdaCheck {

    static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    static PerformOperation isPrime() {
        return a -> {
            if (a < 2) return false;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return a -> {
            int rev = 0, temp = a;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            return rev == a;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            if (choice == 1) {
                System.out.println(isOdd().check(num) ? "ODD" : "EVEN");
            } else if (choice == 2) {
                System.out.println(isPrime().check(num) ? "PRIME" : "COMPOSITE");
            } else {
                System.out.println(isPalindrome().check(num)
                        ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        sc.close();
    }
}