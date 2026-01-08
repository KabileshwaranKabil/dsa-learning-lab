package arrays.Search_Insert_Position;

public class Main{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={1,3,5,6};
        int target=5;
        int result=sol.searchInsert(nums,target);
        System.out.println("The index is: "+result);
    }
}
