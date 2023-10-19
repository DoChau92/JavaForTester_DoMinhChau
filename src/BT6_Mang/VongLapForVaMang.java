package BT6_Mang;

public class VongLapForVaMang {
    public static void main(String[] args) {
        int index = 0;
        int a[] = new int[26];

        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                //i chinh la so chan can add vao
                //index chinh la vi tri trung gian de gan gia tri i vao cho theo thu tu
                System.out.println(i);
                a[index] = i; // Add gia tri so chan vào mang a
                index++;
        }
        }
        //In gia tri trong mang sau khi da add gia tri vao

        for (int i = 0; i <= 50; i++){
            System.out.println(a[i]);
        }
    }

}