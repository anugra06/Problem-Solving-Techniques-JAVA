import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        sc.nextLine();

        while (T-- > 0) {
            String s = sc.nextLine();
            int n = s.length();

            // split indices
            int mid = n / 2;

            String left, right;

            if (n % 2 == 0) {
                left = s.substring(0, mid);
                right = s.substring(mid);
            } else {
                left = s.substring(0, mid);
                right = s.substring(mid + 1); // skip middle
            }

            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            // count left half
            for (char c : left.toCharArray()) {
                freq1[c - 'a']++;
            }

            // count right half
            for (char c : right.toCharArray()) {
                freq2[c - 'a']++;
            }

            // compare frequencies
            if (Arrays.equals(freq1, freq2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
