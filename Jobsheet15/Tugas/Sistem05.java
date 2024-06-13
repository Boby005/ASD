package Tugas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sistem05 {
    List<Mahasiswa05> daftarMahasiswa = new ArrayList<>();
    List<MataKuliah05> daftarMataKuliah = new ArrayList<>();
    List<Nilai05> daftarNilai = new ArrayList<>();
    Queue<Mahasiswa05> antrianHapus = new LinkedList<>();

    void tambahMahasiswa(String nim, String nama, String telf) {
        Mahasiswa05 mahasiswa = new Mahasiswa05(nim, nama, telf);
        daftarMahasiswa.add(mahasiswa);
    }

    void tambahMataKuliah(String kode, String nama, int sks) {
        MataKuliah05 matakuliah = new MataKuliah05(kode, nama, sks);
        daftarMataKuliah.add(matakuliah);
    }

    void inputNilai(String nim, String kodeMk, double nilai) {
        Mahasiswa05 mahasiswa = daftarMahasiswa.stream().filter(m -> m.nim.equals(nim)).findFirst().orElse(null);
        MataKuliah05 matakuliah = daftarMataKuliah.stream().filter(mk -> mk.kode.equals(kodeMk)).findFirst()
                .orElse(null);

        if (mahasiswa != null && matakuliah != null) {
            Nilai05 nilaiObj = new Nilai05(mahasiswa, matakuliah, nilai);
            daftarNilai.add(nilaiObj);
        } else {
            if (mahasiswa == null) {
                System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            } else {
                System.out.println("Mata kuliah dengan kode " + kodeMk + " tidak ditemukan.");
            }
        }
    }

    void tampilNilai() {
        System.out.println("=======================================");
        System.out.println("         DAFTAR NILAI MAHASISWA        ");
        System.out.println("=======================================");
        for (Nilai05 nilai : daftarNilai) {
            System.out.println("NIM         : " + nilai.mahasiswa.nim);
            System.out.println("Nama        : " + nilai.mahasiswa.nama);
            System.out.println("Mata Kuliah : " + nilai.matakuliah.nama);
            System.out.println("SKS         : " + nilai.matakuliah.sks);
            System.out.println("Nilai       : " + nilai.nilai);
            System.out.println("---------------------------------------");
        }
    }

    void cariNilaiMahasiswa(String nim) {
        System.out.println("=======================================");
        System.out.println("       NILAI MAHASISWA NIM: " + nim);
        System.out.println("=======================================");
        for (Nilai05 nilai : daftarNilai) {
            if (nilai.mahasiswa.nim.equals(nim)) {
                System.out.println("Nama        : " + nilai.mahasiswa.nama);
                System.out.println("Mata Kuliah : " + nilai.matakuliah.nama);
                System.out.println("SKS         : " + nilai.matakuliah.sks);
                System.out.println("Nilai       : " + nilai.nilai);
                System.out.println("---------------------------------------");
            }
        }
    }

    void urutDataNilai() {
        daftarNilai.sort(Comparator.comparing(n -> n.mahasiswa.nama));
        tampilNilai();
    }

    void antrianHapusMahasiswa(String nim) {
        try {
            Mahasiswa05 mahasiswa = daftarMahasiswa.stream()
            .filter(m -> m.nim.equals(nim)).findFirst().orElse(null);
            if (mahasiswa != null) {
                antrianHapus.add(mahasiswa);
                System.out.println("Mahasiswa dengan NIM " + nim + " ditambahkan ke dalam antrian penghapusan.");
            } else {
                System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            }
        } catch (NullPointerException e) {
            System.out.println("Terjadi kesalahan saat mencari mahasiswa. Silakan periksa input NIM.");
        }
    }

    void hapusMahasiswa() {
        Mahasiswa05 mahasiswa = antrianHapus.poll();
        if (mahasiswa != null) {
            daftarMahasiswa.remove(mahasiswa);
            daftarNilai.removeIf(nilai -> nilai.mahasiswa.equals(mahasiswa));
            System.out.println("Mahasiswa dengan NIM " + mahasiswa.nim + " telah dihapus.");
        } else {
            System.out.println("Tidak ada mahasiswa dalam antrian penghapusan.");
        }
    }
}