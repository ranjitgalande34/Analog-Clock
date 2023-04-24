 class palindrome
 {
    public static void main(String args[])
    {
        
        int num=121;
        int sum=0;
        int temp=num;
        while(num!=0){
        int r =num%10;
         sum=sum*10+r;
        num=num/10;
        }
        if(temp==sum);
        {
            System.out.println("palindrome");

        }
        else 
        {
            System.out.println("not");
        }
    }   
 }
    
    

