package tuan4;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        String[] abc = {"a", "b", "c"};
        System.out.print("Nhập xâu: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        if (arr.length < 3) {
            System.out.println("Số lần xuất hiện 0");
        } else {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("a") && arr.length - i >= 3) {
                    for (int j = 0; j < 3; j++) {
                        if (!arr[i + 1].equals(abc[j + 1])) {
                            break;
                        } else {
                            ++count;
                        }
                    }

                }
            }
            System.out.println("Số dãy con là: " + count);
        }
    }
}
