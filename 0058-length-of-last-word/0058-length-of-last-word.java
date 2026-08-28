class Solution {
    public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        int lastLength = 0;
        for(int i = 0; i < words.length; i++)
        {
            lastLength = words[i].length();
        }
        return lastLength;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = lengthOfLastWord(s);
        System.out.print(res);
    }
}