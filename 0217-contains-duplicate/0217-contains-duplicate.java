class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>Set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(Set.contains(nums[i]))
            {
                return true;
            }
            Set.add(nums[i]);
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
        boolean res =containsDuplicate(nums);
        System.out.print(res);
    }
}