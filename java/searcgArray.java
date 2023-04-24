import java.util.*;
public class searcgArray {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array");
        int size=sc.nextInt();
        System.out.println("search value in array");

        int search=sc.nextInt();
        System.out.println("inputs in array");

        int array[]=new int [size];
        

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){


        if(search==array[j]){
            System.out.println("value matched");
            System.out.println("at a index"+" "+ j);
            break;

        }
    }
        
            
        }

    }

    


