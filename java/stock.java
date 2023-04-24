import java.util.*;
public class stock {

    public static void stockk(int array[]){
        int number=0;

        int n=array.length;
        for(int i=1;i<n;i++){
            if(array[number]<array[i]){
                int sum=array[number]-array[i];
int a=0;
                a=sum;
                if(a<sum){
                    a=sum;
                    System.out.println(a);
                    number++;


                }

            }

        }

    }public static void main(String args[]){
        int[]array={7,1,5,3,6,4};
        stockk(array);
    }
}
