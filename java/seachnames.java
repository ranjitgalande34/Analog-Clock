import java.util.*;
public class seachnames {
    

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a size of array");

        int size=sc.nextInt();
        
        System.out.println("enter a input of array");
        //input


        String array[]=new String[size];
        for (int i=0;i<size;i++){
            array[i]=sc.next();

        }//output
        
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }



    }
    
}

    
