class Solution {
    public static boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int original = n;
        while(n != 0)
        {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n/10;
        }
        if(original % (sum + product) == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = checkDivisibility(n);
        System.out.print(result);
    }
}