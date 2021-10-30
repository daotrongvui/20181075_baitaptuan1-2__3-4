package tuan4;

import java.util.Scanner;

public class Bai16 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        String xau1 = "Trọng";
        String xau2 = "ĐàoTrọngVui";
        boolean KT = true;
        for (int i = 0; i < xau1.length(); i++) {
            if (!xau2.contains(xau1.split("")[i])) {
                KT = false;
            }
        }
        if (KT) {
            System.out.println("Xâu 1 là con của xâu 2!");
        } else {
            System.out.println("Xâu 1 không là con của xâu 1");
        }
    }
}
