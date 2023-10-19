package BT7_CollectionArrayList;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numberal = new java.util.ArrayList<Integer>();
        int max = 50;
        for (int i = 0; i <= max; i++){
            if (i % 2 == 0){
                numberal.add(i); //Add gia tri vao array list
            }
        }
        //Duyet gia tri trong array list
        for (int j = 0; j < numberal.size(); j++){
            System.out.println(numberal.get(j));
        }
    }
}
