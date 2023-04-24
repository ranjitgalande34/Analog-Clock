public class boolen {
    public boolean containsDuplicate(int[] nums) {
        boolean a=true;
        boolean b=false;
          int N=nums.length;
  
          for(int i=0;i<N-1;i++){
              for(int j=1;j<N;i++){
              if(nums[i]==nums[j]){
               return true;
                  }
                  }
  
              
          
          
      }return false;
      }
  }
              
    
}
