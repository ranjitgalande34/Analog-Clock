public class subarrayy {
    public static void main(String[] args) {
        int k;
        int ans=0;
        int sum=0;
        int []array={-2,-1};
       
        for(int i=0;i<array.length;i++){
            for(int j=1;j<=array.length;j++){
                for( k=i;k<j;k++){
                    System.out.print(array[k]);
                   
                    sum=sum+array[k];
                }
                    if(ans<sum){
                        ans=sum;
    }  System.out.println();
    

    }

sum=0;

}System.out.println(sum);
}
}


