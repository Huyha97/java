import java.sql.SQLOutput;
import java.util.Scanner;

public class tim_max_mang_2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int m = scanner.nextInt();
        System.out.print("Nhap so cot: ");
        int n = scanner.nextInt();

        double[][] array = new double[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Phan tu thu [%d][%d]: ",i,j);
                array[i][j] = scanner.nextDouble();
            }
        }
        int max = (int) array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]){
                    max = (int) array[i][j];
                }
            }
        }
        System.out.println("max la " + max);
    }
}
