package tuan4;

import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu ký tự S1: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.print("Nhập xâu ký tự S2: ");
        String n1 = scanner.nextLine();
        String[] xauB = n1.split("");
        boolean KT = true;
        int count = 0;
        if (xauA.length > xauB.length) {
            System.out.println("Xâu A không xuất hiện trong xâu B!");
        } else {
            for (int i = 0; i < xauB.length; i++) {
                if (xauB[i].equals(xauA[0]) && xauB.length >= xauA.length) {
                    for (int j = 0; j < xauA.length; j++) {
                        if (!xauA[j].equals(xauB[i])) {
                            KT = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (KT) {
                        ++count;
                    }
                }

            }
        }
        System.out.println("Số lần xuất hiện xâu A trong xâu B là: " + count);
    }
}
