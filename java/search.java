public class search {
    public static void main(String[] args) {

        int[]nums={1,3};
        int target=2;
        int i;
        


        for( i=0;i<nums.length;i++){
           if(target==nums[i]){
                target=i;
                if(target!=nums[i]){
                    target=-1;
                }
                System.out.println(i);
                 break;
                 
   }
       }if(target==-1){
            target=-1;
            System.out.println(target);
        }
    }
}
