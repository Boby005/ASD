package LinkedList;

public class Mahasiswa05 {
    String nim, nama, tglLahir;

    public Mahasiswa05() {

    }

    public Mahasiswa05(String nim, String nama, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", tglLahir='" + tglLahir + '\'' +
                '}';
    }
}