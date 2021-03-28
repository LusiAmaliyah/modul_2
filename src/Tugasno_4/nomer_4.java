package Tugasno_4;
import java.util.Scanner;
public class nomer_4 {
    public static void main (String[] args) {
        int i, j, m, n;
        int matrix[][] = new int [10][10];
        int transpose [][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matrix: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matrix: ");
        n = scan.nextInt();
        System.out.println("masukkan elemen matrix : ");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
         System.out.println("Hasil matrix: ");
        for (i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
         for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                transpose[j][i] = matrix[i][j];
            }
         }
          System.out.println("Hasil transpose matrix: ");
        for(i = 0; i<n; i++){
            for(j = 0; j<m; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
