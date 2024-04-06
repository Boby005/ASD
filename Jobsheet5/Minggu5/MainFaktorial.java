package Minggu5;

import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("Masukan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("================================");
        System.out.println("Hasil Faktorial dengan Bruce Force menggunakan while loop:");
        long startTime = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBFUsingWhile(fk[i].nilai));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Waktu eksekusi: " + duration + " nanosecond");

        System.out.println("================================");
        System.out.println("Hasil Faktorial dengan Bruce Force menggunakan do-while loop:");
        startTime = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBFUsingDoWhile(fk[i].nilai));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Waktu eksekusi: " + duration + " nanosecond");
        System.out.println("================================");

        sc.close();
    }
    
}
