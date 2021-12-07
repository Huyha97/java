package viDu;

import java.util.Scanner;

public class phan_nguyen_phan_du {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap vao so thu nhat: ");
        int number1 = scanner.nextInt();
        System.out.print(" nhap vao so thu hai: ");
        int number2 = scanner.nextInt();
        int phanNguyen = number1/number2;
        int phanDu = number1%number2;
        System.out.println(" phan nguyen la: "+ phanNguyen);
        System.out.println(" phan du la: "+ phanDu);
    }
}

