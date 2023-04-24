import java.util.*;
public class login {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        loginPage(a,b,112,222);

        

        
    } static void loginPage(int a,int b,int n,int m){
    Scanner sc=new Scanner(System.in);

    if(a==n && b==m){
        System.out.println("welcome to wonderland");
    }else{

        System.out.println("invalid credentials");
    }
}
}
