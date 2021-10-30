package tuan4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai13 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyễn Văn H1";
        String s2 = "Nguyễn Văn T1";
        String s3 = "Nguyễn Thị Hà";
        String s4 = "Đào Trọng Vui";
        int count = 0;
        List<String> arrA = Arrays.asList(s1, s2, s3, s4);
        for (int h = 0; h < arrA.size(); h++) {
            String[] arr = arrA.get(h).split("");
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i].equals(" ")) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j].equals("H")) {
                            ++count;
                        } else {
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("Số bạn có tên bắt đầu bằng chữ H là : " + count);
    }
}
