package tuan3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai7 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài dãy số:");
        int n = scanner.nextInt();
        System.out.print("Nhập số: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b[i] = nhap;
        }
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            c.add(b[i]);
        }
        c = c.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < c.size(); i++) {
            for (int j = i + 1; j < c.size(); j++) {
                if (c.get(j) == c.get(i)) {
                    c.set(j, 0);
                    c.set(i, 0);
                }
            }
        }
        System.out.println(c.stream().filter(s -> s != 0).collect(Collectors.toList()).get(0));
    }
}
