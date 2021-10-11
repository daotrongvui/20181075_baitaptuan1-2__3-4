package tuan1;

public class Bai5 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        int i;
        for (i = 1000; i < 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }
}
