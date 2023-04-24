public class dupp {
    class Solution {
        public static int removeElement(int[] nums, int val) {
    
            int k=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    int [++k]=nums[i];
                }
            }return k;
            
        }public static void main(String[] args) {
            
            int []array={3,2,2,3};
            int value=3;
            
            System.out.println(removeElement(array,value));
        }
    }
    
}
