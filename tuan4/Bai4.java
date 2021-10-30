package tuan4;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên đầy đủ: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                for (int j = 0; j < i; j++) {
                    System.out.print(arr[j]);
                }
                break;
            }
        }
        System.out.println("");
    }
}
