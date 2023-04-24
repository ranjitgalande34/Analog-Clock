import java.util.*;
public class average {

    public static void average3(int a,int b,int c){

        int ave=(a+b+c)/3;
        System.out.println(ave);
        return;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            average3(a,b,c);
        }
    }
    

