import java.util.*;
public class primee {

    public static void prime(int n){

        if(n%2==0 || n%3==0 || n%5==0 || n%7==0){
            System.out.println("Number is not prime");
        }else{
            System.out.println("prime");
        }
    } public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        prime(n);

    }


    
}
