package tuan1;

public class Bai6 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        int k = 0, j = 0, n, tong;
        while (j < 5) {
            k++;
            tong = 1;
            for (n = 2; n < k; n++) {
                if (k % n == 0) {
                    tong += n;
                }
            }
            if (k == tong) {
                System.out.println(k);
                j++;
            }
        }
    }
}
