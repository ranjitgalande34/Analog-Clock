import java.util.*;
public class sumOdd {
    public static void sum(int n){
        int temp=0;

        for(int i=1;i<=n;i++){
            if(i%2==1){
                temp=temp+i;
                System.out.print(temp+" ");
            }
        }System.out.println(temp);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        sum(n);




        }
    }
    

