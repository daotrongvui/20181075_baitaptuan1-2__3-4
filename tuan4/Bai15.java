package tuan4;

import java.util.Scanner;

public class Bai15 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        String S1 = "Trọng";
        String S2 = "ĐàoVui";
        System.out.println("Chèn xâu 1 vào giữa xâu 2:");
        int tb = S2.length() / 2;
        String a1 = S2.substring(0, tb);
        String a2 = S2.substring(S2.length() - tb);
        System.out.println(a1 + S1 + a2);
    }
}
