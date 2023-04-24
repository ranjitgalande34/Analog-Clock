import java.util.*;
public class even {

    public static void even(int n){

        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("not even");
        }
    }public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        even(n);


        }


    }
    
    

