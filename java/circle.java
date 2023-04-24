import java.util.*;
public class circle {

    public static void circumferrence(double r){
        double C=2*3.14*r;
        System.out.println(C);
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        double r=sc.nextInt();

        circumferrence(r);

}    
}
