public class Transaksi05 {
    private static int autoIncrement = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental05 br;

    public Transaksi05(String namaPeminjam, int lamaPinjam, BarangRental05 br, boolean isMember) {
        this.kodeTransaksi = autoIncrement++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = hitungTotalBiaya(lamaPinjam, br.biayaSewa, isMember);
    }

    private double hitungTotalBiaya(int lamaPinjam, int biayaSewa, boolean isMember) {
        double total = lamaPinjam * biayaSewa;

        // Potongan harga untuk member
        if (isMember) {
            total -= 25000;
        }

        // Potongan harga berdasarkan lama pinjam 
        if (lamaPinjam > 78) {
            total *= 0.8;
        } else if (lamaPinjam >= 48) {
            total *= 0.9;
        }

        return total;
    }
}