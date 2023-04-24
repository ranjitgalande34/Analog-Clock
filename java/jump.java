public class jump {
    public static void main(String[] args) {
        int []nums={2,3,1,1,10,12};
    System.out.println(canJump(nums));
    }
        
 static boolean canJump(int[]nums) {
                for(int i=1;i<nums.length;i++){
                    if(i<nums.length-1){
                        i=i+nums[i];
                       if( i==nums.length-1){
                        return true;
                       }
                }
                
            }
                return false;
        }
    }
    
    

