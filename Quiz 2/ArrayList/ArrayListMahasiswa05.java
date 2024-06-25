package ArrayList;

import java.util.ArrayList;
public class ArrayListMahasiswa05 {
    private ArrayList<Mahasiswa05> listMahasiswa;

    public ArrayListMahasiswa05() {
        listMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa05 mhs) {
        listMahasiswa.add(mhs);
    }

    public void hapusMahasiswa(String nim) {
        listMahasiswa.removeIf(mhs -> mhs.getNim().equals(nim));
    }

    public Mahasiswa05 cariMahasiswa(String nim) {
        for (Mahasiswa05 mhs : listMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        for (Mahasiswa05 mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }
}