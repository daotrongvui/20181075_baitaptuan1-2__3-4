package tuan2;

public class Bai1 {

    public static void main(String[] args) {
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        int k, n, dem;
        for (k = 1; k <= 100; k++) {
            dem = 0;
            for (n = 2; n <= k; n++) {
                if (k % n == 0) {
                    dem++;
                }
            }
            if (dem > 1) {
                System.out.println(k);
            }
        }
    }
}
