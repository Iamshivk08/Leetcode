import java.util.*;

class Solution {

    public static int addDigits(int num) {

        while (num >= 10) {

            int res = 0;

            while (num != 0) {

                res = res + (num % 10);

                num = num / 10;
            }

            num = res;
        }

        return num;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = addDigits(num);

        System.out.print(result);
    }
}