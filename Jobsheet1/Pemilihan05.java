import java.util.Scanner;

public class Pemilihan05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("====================================");
        System.out.print("Masukkan Nilai Tugas : ");
        float tugas = input05.nextFloat();
        System.out.print("Masukkan nilai Kuis : ");
        float kuis = input05.nextFloat();
        System.out.print("Masukkan nilai UTS : ");
        float uts = input05.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        float uas = input05.nextFloat();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0  || kuis > 100  ||
            uts < 0   || uts > 100   ||
            uas < 0   || uas  > 100  ) {
                System.out.println("====================================");
                System.out.println("Nilai Tidak Valid");
                System.out.println("====================================");
                return;
        }


        float total = (float) (0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas);
        String pesan = total >= 50 ? "LULUS" : "TIDAK LULUS";
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("Nilai Akhir : " + total);

        if (total >= 80) {
            System.out.println("Nilai huruf : A");
        } else if (total >= 73) {
            System.out.println("Nilai huruf : B+");
        } else if (total >= 65) {
            System.out.println("NIlai huruf : B");
        } else if (total >= 60) {
            System.out.println("NIlai huruf : C+");
        } else if (total >= 50) {
            System.out.println("Nilai huruf : C");
        } else if (total >= 39) {
            System.out.println("Nilai huruf : D");
        } else {
            System.out.println("Nilai huruf : E");
        }


        System.out.println("====================================");
        System.out.println("====================================");

        System.out.println("SELAMAT ANDA " + pesan);
        
    }

    
    }

