package tuan4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai11 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyen Pham An";
        String s2 = "Nguyen Thi Nhung";
        String s3 = "Dao Trong Vui";
        int count = 0;
        List<String> arr = Arrays.asList(s1, s2, s3);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("An")) {
                ++count;
            }
        }
        System.out.println("Số bạn có tên An: " + count);
    }
}
