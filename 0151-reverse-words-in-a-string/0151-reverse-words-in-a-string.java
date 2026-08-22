class Solution {
    public static String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        String rev = "";
        for(int i = words.length - 1; i >= 0; i--)
        {
            rev = rev + words[i];
            if(i != 0)
            {
                rev = rev + " ";
            }
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = reverseWords(str);
        System.out.print(res);
    }
}