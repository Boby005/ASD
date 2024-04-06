package minggu7;

import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        int jumMhs;

     
        System.out.println("========================");
        System.out.print("Masukan Banyak Mahasiswa : ");
        jumMhs = s.nextInt();
        pencarianmhs data = new pencarianmhs(jumMhs);

        System.out.println("========================");
        System.out.println("Masukan data mahasiswa secara urut dari NIM terkecil :");
        for (int i = 0; i < jumMhs; i++ ){
            System.out.println("========================");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);

            
        }
        System.out.println("========================");
            System.out.print("Data Kesuluruhan Mahasiswa");

        data.tampil();


        System.out.println("______________________");
        System.out.println("______________________");
        System.out.print("Pencarian Data : ");
        System.out.println("Masukan NIM Mahasiswa yang dicari : ");
        System.out.println("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);


        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari,posisi);

        System.out.println("========================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);


    }
    
}
