import java.util.Scanner;

public class PersegiPanjangDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan berapa banyak anda ingin menghitung : ");
        length = sc.nextInt();

        PersegiPanjang05[] arrayOfPersegiPanjang05 = new PersegiPanjang05[length];
        int panjang, lebar;

        for (int i = 0; i < arrayOfPersegiPanjang05.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang05[i] = new PersegiPanjang05(panjang, lebar);
            
        }
        PersegiPanjang05 persegiPanjang05 = new PersegiPanjang05();
        persegiPanjang05.cetakInfo(arrayOfPersegiPanjang05);
        
    }
}