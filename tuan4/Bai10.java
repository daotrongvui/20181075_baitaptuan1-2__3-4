package tuan4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Đào Trọng Vui";
        System.out.println("Xâu ký tự 1: " + s1);
        String s2 = "Đào Trọng Vui - SVBK";
        System.out.println("Xâu ký tự 2: " + s2);
        List<String> arr = Arrays.asList(s1, s2);
        Map<Integer, String> stringMap = new HashMap<>();
        int max = s1.length();
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).length()) {
                max = arr.get(i).length();
                stringMap.put(1, arr.get(i));
            }
        }
        System.out.println("Xâu có độ dài nhất là: " + stringMap.get(1));
    }
}
