import java.util.Scanner;

public class RentalMain05 {
    static BarangRental05[] daftarBarang = new BarangRental05[100];
    static Transaksi05[] daftarTransaksi = new Transaksi05[100];
    static int jumlahBarang = 0;
    static int jumlahTransaksi = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasiDataBarang();
        menuUtama();
    }

    private static void inisialisasiDataBarang() {
        daftarBarang[jumlahBarang++] = new BarangRental05("S 4444 xx", "Land Rover", "Mobil", 2000, 40000);
        daftarBarang[jumlahBarang++] = new BarangRental05("N 5555 VA", "Porsche 911", "Mobil", 1998, 40000);
        daftarBarang[jumlahBarang++] = new BarangRental05("N 1453 AA", "Toyota Supra", "Mobil", 2002, 40000);
        daftarBarang[jumlahBarang++] = new BarangRental05("B 3333 BB", "Kawasaki Binter", "Motor", 1999, 25000);
        daftarBarang[jumlahBarang++] = new BarangRental05("C 0000 CC", "Yamaha XS 650", "Motor", 1992, 25000);
    }

    private static void menuUtama() {
        int pilihan;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    lihatDataBarang();
                    break;
                case 2:
                    tambahTransaksi();
                    break;
                case 3:
                    lihatTransaksi();
                    break;
                case 4:
                    menuUrutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    private static void lihatDataBarang() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Kendaraan Rental (Boby_05)");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("| %-11s | %-15s | %-5s | %-4s | %-17s | %-10s |\n", "Nomor TNKB", "Nama Kendaraan", "Jenis",
                "Tahun", "Biaya Sewa Perjam", "Status");
        for (int i = 0; i < jumlahBarang; i++) {
            BarangRental05 br = daftarBarang[i];
            String status = br.tersedia ? "Tersedia" : "Tidak Tersedia";
            System.out.printf("| %-11s | %-15s | %-5s | %-4d | %-17d | %-10s |\n", br.noTNKB, br.namaKendaraan,
                    br.jenisKendaraan, br.tahun, br.biayaSewa, status);
        }
    }

    private static void tambahTransaksi() {
        System.out.println("\n=== Tambah Transaksi ===");
        System.out.print("Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan Nomer TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Lama Pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        System.out.print("Apakah Member (Y/T): ");
        boolean isMember = scanner.nextLine().equalsIgnoreCase("Y");

        BarangRental05 barang = cariBarang(noTNKB);
        if (barang == null) {
            System.out.println("Kendaraan tidak ada.");
            return;
        }

        if (!barang.tersedia) {
            System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain.");
            return;
        }

        Transaksi05 transaksi = new Transaksi05(namaPeminjam, lamaPinjam, barang, isMember);
        daftarTransaksi[jumlahTransaksi++] = transaksi;
        barang.tersedia = false;

        System.out.println("Transaksi berhasil ditambahkan.");
        System.out.println("Kode Transaksi: " + transaksi.kodeTransaksi);
        System.out.println("Nama Peminjam: " + transaksi.namaPeminjam);
        System.out.println("Lama Pinjam: " + transaksi.lamaPinjam);
        System.out.println("Total Biaya: " + transaksi.totalBiaya);
    }

    private static BarangRental05 cariBarang(String noTNKB) {
        for (int i = 0; i < jumlahBarang; i++) {
            BarangRental05 br = daftarBarang[i];
            if (br.noTNKB.equalsIgnoreCase(noTNKB)) {
                return br;
            }
        }
        return null;
    }

    private static void lihatTransaksi() {
        double totalPendapatan = 0;
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Transaksi Peminjaman (Boby_05)");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("| %-4s | %-11s | %-15s | %-15s | %-10s | %-17s |\n", "Kode", "No TNKB", "Nama Barang",
                "Nama Peminjam", "Lama Pinjam", "Total Biaya");
        for (int i = 0; i < jumlahTransaksi; i++) {
            Transaksi05 tr = daftarTransaksi[i];
            totalPendapatan += tr.totalBiaya;
            System.out.printf("| %-4d | %-11s | %-15s | %-15s | %-10d | %-17.0f |\n", tr.kodeTransaksi, tr.br.noTNKB,
                    tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam, tr.totalBiaya);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("TOTAL PENDAPATAN RENTAL (Boby_05)");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("Pendapatan hari ini :%.0f\n", totalPendapatan);
    }

    private static void menuUrutkanTransaksi() {
        System.out.println("\nUrutkan Transaksi");
        System.out.println("1. Huruf pertama Nama lengkap A-M, urutkan Nomor TNKB secara terbaru (DESC)");
        System.out.println("2. Huruf pertama Nama lengkap N-Z, urutkan Nama dari yang terbaru (DESC)");
        System.out.print("Pilih(1-2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        switch (pilihan) {
            case 1:
                urutkanTransaksiByTNKB();
                break;
            case 2:
                urutkanTransaksiByNama();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private static void urutkanTransaksiByTNKB() {
        Transaksi05[] transaksiAM = new Transaksi05[jumlahTransaksi];
        int countAM = 0;

        for (int i = 0; i < jumlahTransaksi; i++) {
            if (daftarTransaksi[i].namaPeminjam.matches("^[A-Ma-m].*")) {
                transaksiAM[countAM++] = daftarTransaksi[i];
            }
        }

        for (int i = 0; i < countAM - 1; i++) {
            for (int j = 0; j < countAM - i - 1; j++) {
                if (transaksiAM[j].br.noTNKB.compareTo(transaksiAM[j + 1].br.noTNKB) < 0) {
                    Transaksi05 temp = transaksiAM[j];
                    transaksiAM[j] = transaksiAM[j + 1];
                    transaksiAM[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < countAM; i++) {
            Transaksi05 tr = transaksiAM[i];
            System.out.printf("| %-4d | %-11s | %-15s | %-15s | %-10d | %-17.0f |\n",
                    tr.kodeTransaksi, tr.br.noTNKB, tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam,
                    tr.totalBiaya);
        }
    }

    private static void urutkanTransaksiByNama() {
        Transaksi05[] transaksiNZ = new Transaksi05[jumlahTransaksi];
        int countNZ = 0;

        for (int i = 0; i < jumlahTransaksi; i++) {
            if (daftarTransaksi[i].namaPeminjam.matches("^[N-Zn-z].*")) {
                transaksiNZ[countNZ++] = daftarTransaksi[i];
            }
        }

        for (int i = 0; i < countNZ - 1; i++) {
            for (int j = 0; j < countNZ - i - 1; j++) {
                if (transaksiNZ[j].namaPeminjam.compareTo(transaksiNZ[j + 1].namaPeminjam) < 0) {
                    Transaksi05 temp = transaksiNZ[j];
                    transaksiNZ[j] = transaksiNZ[j + 1];
                    transaksiNZ[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < countNZ; i++) {
            Transaksi05 tr = transaksiNZ[i];
            System.out.printf("| %-4d | %-11s | %-15s | %-15s | %-10d | %-17.0f |\n",
                    tr.kodeTransaksi, tr.br.noTNKB, tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam,
                    tr.totalBiaya);
        }
    }
}