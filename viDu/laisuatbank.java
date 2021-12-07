package viDu;

import java.util.Scanner;

public class laisuatbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tien goc muon gui: ");
        float P = scanner.nextFloat();
        System.out.print("Nhap vao lai suat hang nam: ");
        float R = scanner.nextFloat();
        System.out.print("Nhap vao thoi gian ban muon gui: ");
        float T = scanner.nextFloat();
        float laiSuat = (P*R*T)/100;
        System.out.println("lai suat la: " + laiSuat);
    }
}
