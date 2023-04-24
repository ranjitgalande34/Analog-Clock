import java.util.*;
public class howmany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;        
    int num=123343;
    while(num>0){
        int rem=num%10;
        if(rem==N){
            count++;}
       num= num / 10;
        

    }System.out.println(count);

    

    }
    
}

