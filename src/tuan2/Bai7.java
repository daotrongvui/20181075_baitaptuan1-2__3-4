package tuan2;

public class Bai7 {

    public static void main(String[] args) {
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        for (int i = 0; i <= 100; i++) {
            switch (i % 5) {
                case 0:
                    d1++;
                    break;
                case 1:
                    d2++;
                    break;
                case 2:
                    d3++;
                    break;
                case 3:
                    d4++;
                    break;
            }
        }
        System.out.println("20181075_Dao Trong Vui _Malop:709155");
        System.out.println("Co: " + d1 + " so chia het cho 5");
        System.out.println("Co: " + d2 + " so chia 5 du 1");
        System.out.println("Co: " + d3 + " so chia 5 du 2");
        System.out.println("Co: " + d4 + " so chia 5 du 3");
    }
}
