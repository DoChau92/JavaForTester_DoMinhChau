package BT1_Bien;

public class SinhVien {
        static String address ="Can Tho";//bien static
        int age = 30;//bien instance

        public static void main(String[] args) {
            SinhVien sv = new SinhVien();//khoi tao doi tuong class sv
            String name ="Java";

            System.out.println("Ten:" + name);
            System.out.println("Dia Chi:" + address);
            System.out.println("Tuoi:" + sv.age);
            System.out.println(ThongTin.name);
        }
    }

