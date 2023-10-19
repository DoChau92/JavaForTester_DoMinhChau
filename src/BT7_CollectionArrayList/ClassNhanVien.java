package BT7_CollectionArrayList;

import java.util.ArrayList;

public class ClassNhanVien {
    public static void main(String[] args) {
        ArrayList<String> NhanVien = new ArrayList<>();
        NhanVien.add("Name: Do Minh Chau");
        NhanVien.add("Age: 31");
        NhanVien.add("Country: Ha Noi");

        for (String a : NhanVien){
            System.out.println(a);
        }
    }
}
