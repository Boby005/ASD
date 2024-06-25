package LinkedList;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        LinkedList05 list = new LinkedList05();

        list.tambahMahasiswa(new Mahasiswa05("2341760162", "Boby", "09-09-2009"));
        list.tambahMahasiswa(new Mahasiswa05("2341760163", "Arif", "02-02-2008"));
        list.tambahMahasiswa(new Mahasiswa05("2341760164", "Randa", "03-09-2009"));
        list.tambahMahasiswa(new Mahasiswa05("2341760165", "David", "03-03-2008"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    list.tambahMahasiswa(new Mahasiswa05(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("NIM yang akan dihapus: ");
                    nim = scanner.nextLine();
                    list.hapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("NIM yang dicari: ");
                    nim = scanner.nextLine();
                    Mahasiswa05 mhs = list.cariMahasiswa(nim);
                    if (mhs != null) {
                        System.out.println("Mahasiswa ditemukan: " + mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                    list.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}

