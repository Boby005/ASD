

public class Transaksi {
    String noRekening, tanggalTransaksi, type;
    double saldo;
    double saldoAwal;
    double saldoAkhir;

    public Transaksi(String a, double b, double c, double d, String e, String f) {
        this.noRekening = a;
        this.saldo = b;
        this.saldoAwal = c;
        this.saldoAkhir = d;
        this.tanggalTransaksi = e;
        this.type = f;
    }
}

