import java.util.*;
public class addmaxmin {

    

    public static int findSum(int[] B,int M){
        int min=B[0];
    int max=B[0];
        for(int i=1;i<B.length;i++){
            if(B[i]<min){
                min=B[i];
                
            }if(B[i]>max){
                max=B[i];
            }
                
            }int sum=min+max;
            return sum;
        
    
            
            
        }
        public static void main(String args[]){
            
            Scanner sc=new Scanner(System.in);
           int  N=sc.nextInt();
            int []A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            
            int summ=findSum(A[];int N);
            
            
        }
    }
    

    

