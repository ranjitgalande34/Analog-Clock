import javax.swing.plaf.synth.SynthStyleFactory;

public class pyra {
    public static void main(String args[]){
        int number=1;
        int n=5;

        for (int i=1;i<=5;i++){
            
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
            System.out.println();
        }
    }
}
    

