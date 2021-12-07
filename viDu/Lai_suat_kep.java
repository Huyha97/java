package viDu;

import java.util.Scanner;

public class Lai_suat_kep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap vao so tien goc: ");
        double P = scanner.nextDouble();
        System.out.print(" nhap vao lai suat hang nam: ");
        double R = scanner.nextDouble();
        System.out.print(" nhap vao thoi han gui: ");
        double t = scanner.nextDouble();
        System.out.print(" nhap vao n: ");
        double n = scanner.nextDouble();
        double amount = Math.pow(1 + (R / n), n * t);
        double laiKep = amount - P;
        System.out.println("lai kep sau" + t + "nam la:" + laiKep);
        System.out.println("so tien co duoc sau" + t + "nam la:" + amount);
    }
    }
