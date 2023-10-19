package BT3_ToanTu;

public class ToanTu {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 5;
        float f = a;
        double d = 10.05;
        int e = (int) d;

        System.out.println(a + b + c);//35
        System.out.println(a + b - c);//25
        System.out.println(a * b / c);//40
        System.out.println(c % b);//5
        System.out.println(a < c && b < c);//false
        System.out.println(a > c && b > c);//true
        System.out.println(a > c || b < c);//true
        System.out.println(a < c || b < c);//false
        System.out.println(a == b);//false
        System.out.println((a / 2) == b );//true
        System.out.println("Gia tri Float: " + f);
        System.out.println("Gia tri int: " + e);
    }
}
