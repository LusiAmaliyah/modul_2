package tugasno_3;
public class nomer_3 {
    public static void main(String[] args){
        int [][] H = {
            {10,10},
            {20,20},
            {30,30}
        };
        int [][] A = {
            {10,10,20},
            {20,30,30}
        };
         if (H[0].length == A.length){
            int [][] R = new int[H.length] [A[0].length];
            for (int I=0; I<H.length; I++){
                for (int S=0; S<A[0].length; S++ ){
                    for (int F=0; F<H[0].length; F++){
                        R[I][S] += H[I][F] * A[F][S];
                    }
                }
            }
            for (int[] r : R) {
            for (int I : r) {
                System.out.print(I+" ");
            }
             System.out.println();
        }
        }
         else{
             System.out.println("Ukuran kolom A tidak sama");
         }
         }
}
