package viDu.them;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle(){
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return  this.width * this.height;
    }
    public double getPrimeter() {
        return  (this.width + this.height)*2;
    }
    public String display() {
            return "rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("your rectangle \n " + rectangle.display());
        System.out.println("area:" +rectangle.getArea());
        System.out.println("primeter" +rectangle.getPrimeter());



    }
}
