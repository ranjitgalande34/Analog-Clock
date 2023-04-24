import java.util.*;
public class minimum {

    


    public static void main(String[] args) {
        

        int []arr={5,4,3,2,1};
        System.out.println(nums(arr));
        
        
    }
        

        public static int nums(int[]arr){

            int N=arr.length;
            int A =arr[0];
            for(int i=0;i<N;i++){
                if(A>arr[i]){
                    A=arr[i];

                }

            }return A;

        }
    }
    

