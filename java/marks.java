import java.util.*;
public class marks {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1 for more result and 0 for stop");
        int a=sc.nextInt();
        int marks=sc.nextInt();

        if (a==1){
            if(marks>=90){
                System.out.println("Marks are good");
            }else if((marks<=89 && marks>=50)){
                System.out.println("Marks are still good");
            }else if(marks<+59 && marks>=10){
                System.out.println("Marks are very good no problem");
            }

        }else if (a==0){
            System.out.println("Stop");
            
        }else{
            System.out.println("Invalid Input");
        }

        }

    }
    

