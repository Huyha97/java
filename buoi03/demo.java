package buoi03;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so dong cot: ");
        int num = scanner.nextInt();

        double[][] arr = new double[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("nhap vao phan tu thu [%d][%d]", i, j);
                arr[i][j] = scanner.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    if (i ==j) {
                        sum += arr[i][j];
                    }
            }
        }
        System.out.println("tong:" + sum);
    }
}
