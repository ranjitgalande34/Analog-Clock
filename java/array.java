import java.util.*;
public class array {

    public static void main(String[] args) {
        int sum=0;
        
        int[]nums={1,2,3,4,5};
        
                int n=nums.length;
                int maxSum=Integer.MIN_VALUE;
                if(n<=1){
                    System.out.println(nums[0]);
                }
        
                for(int i=0;i<n-1;i++){
                    int currSum=0;
        
                    for(int j=i;j<=n-1;j++){
        
                        currSum=currSum+nums[j];
                        System.out.print(nums[j]);
                        if(currSum>maxSum){
                            maxSum=currSum;
                          //  System.out.println(maxSum);
                        }
        
                        }System.out.println();
        
        
                        }System.out.println(maxSum);
                    }
     
    
}
    



