import java.util.Scanner;

public class Perulangan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long nim;
        int angka;

        System.out.print("Masukkan NIM Anda: ");
        System.out.println("====================================");
        nim = input.nextLong();
        
        angka = (int) (nim % 100);

        if (angka < 10) {
            angka += 10;
        }

        for (int i = 1; i <= angka; i++) {
            if(i != 6 && i != 10){

                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }

        System.out.println(); 
    }
}