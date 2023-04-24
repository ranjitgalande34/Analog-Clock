public class smallest {
    public static void main(String args[]){

int largest=Integer.MIN_VALUE;
int smallest=Integer.MAX_VALUE;
        int array[]={1,2,3,4,5,6};

        for(int i=0;i<array.length;i++){
            if(array[i]<smallest)
                smallest=array[i];
            
            else if(
                    array[i]>largest)
                        largest=array[i];
                    }
                

            System.out.println(smallest);
            System.out.println(largest);

        }
    }



    
    

