public class subarray {


    public static void main(String[] args) {
        
        int []arr={-2,-1};
        int N=arr.length;
        int sum=0;
        int p=Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                
               for(int k=i;k<=i+j;k++){
                    System.out.print(arr[k]);
                   sum=sum+arr[k];
                }
                System.out.print(" "+"sum is"+" "+sum);
                if(p<sum){
                    p=sum;
                    System.out.println(p);
                }
                
            
            System.out.println();
            sum=0;}
        }
            System.out.println(p);
            }}
        
    
    
    

