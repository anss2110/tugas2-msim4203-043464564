import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String golongan;
        int jamLembur;
        double gajiPokok = 0, uangLembur = 0, totalGaji;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan golongan (A/B/C): ");
        golongan = scanner.nextLine().toUpperCase();

        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            System.exit(0);
        }

        System.out.print("Masukkan jumlah jam lembur: ");
        jamLembur = scanner.nextInt();

        if (jamLembur == 1) {
            uangLembur = gajiPokok * 0.30;
        } else if (jamLembur == 2) {
            uangLembur = gajiPokok * 0.32;
        } else if (jamLembur == 3) {
            uangLembur = gajiPokok * 0.34;
        } else if (jamLembur == 4) {
            uangLembur = gajiPokok * 0.36;
        } else if (jamLembur >= 5) {
            uangLembur = gajiPokok * 0.38;
        } else {
            uangLembur = 0;
        }

        totalGaji = gajiPokok + uangLembur;

        Locale localeID = new Locale("id", "ID");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("=======Perhitungan Total Gaji=======");
        System.out.println("Golongan    : " + golongan);
        System.out.println("Gaji Pokok  : Rp " + currencyFormat.format(gajiPokok));
        System.out.println("Uang Lembur : Rp " + currencyFormat.format(uangLembur));
        System.out.println("------------------------------------+");
        System.out.println("Total Gaji  : Rp " + currencyFormat.format(totalGaji));
        System.out.println("=====================================");

    }
}