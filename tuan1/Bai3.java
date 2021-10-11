package tuan1;

public class Bai3 {

    public static void main(String[] args) {
        int i = 1000;
        int num = 0;
        //Empty String
        String primeNumbers = "";
        for (i = 1000; i <= 2000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + "\n";
            }
        }
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
        System.out.println("Các số nguyên tố từ 1000 đến 2000 là:");
        System.out.print(primeNumbers);
        System.out.println("20181075_Dao Trong Vui_Malop:709155");
    }
}
