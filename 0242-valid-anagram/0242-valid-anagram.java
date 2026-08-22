import java.util.*;
class Solution {
    public static boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean res = isAnagram(s,t);
        System.out.print(res);
    }
}