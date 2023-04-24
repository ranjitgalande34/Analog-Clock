public class binary {

   public static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
      //  int mid=start+(end-start)/2;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }return arr[end];
    }
    
    public static void main(String[] args) {

        int[]arr={1,2,3,5};
        System.out.println(arr.length);
        
       
        
    }
    
}
