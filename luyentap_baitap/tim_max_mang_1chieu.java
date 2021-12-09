package luyentap_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class tim_max_mang_1chieu {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" enter size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println(" size does not exceed 20");
        }while(size>20);
        array = new int[size];
        int i =0;
        while (i < array.length) {
            System.out.println(" nhap vao phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mang sau khi nhap la: ");
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int index =1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j+1;
        }
            }
        System.out.println("max la" + max+ "vi tri thu " + index);
    }
}
