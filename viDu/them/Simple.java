package viDu.them;



//class A {
//  public int data =40;
//
//    public void msg() {
//        System.out.println("hello");
//    }
//}
//public class Simple {
//    public static void main(String[] args) {
//        A obj = new A();
//        System.out.println(obj.data);
//        obj.msg();
//    }
//}

class Counter {
     int count = 0;
    /*se lay bo nho (memory) khi bien instance duoc tao*/

    /*Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong*/
    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
    }
}