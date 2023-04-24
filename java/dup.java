public class dup {
    class Solution {
        public int removeElement(int[] nums, int val) {
    
            int k=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[++k]=nums[i];
                }
            }return k+1;
    
}public static void main(String[] args) {
   int []array= {3,2,2,3};
   int value=3;
   System.out.println(removeElement(array,value));
}
    }
}
