public class Tugas105 {
        public double ipk, countIpk;
        public String nama, nim, jenisKelamin;
        public Tugas105(String nama, String nim, String jenisKelamin, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.jenisKelamin = jenisKelamin;
            this.ipk = ipk;
        }
        public Tugas105()
        {
        }
        public void cetakInfo(Tugas105[] mahasiswa)
        {
            int i =1;
            for (Tugas105 mhs : mahasiswa) {
                countIpk += mhs.ipk;
                System.out.println("Data Mahasiswa ke-" + i);
                System.out.println("Nama: " + mhs.nama);
                System.out.println("Nim: " + mhs.nim);
                System.out.println("Jenis kelamin: " + mhs.jenisKelamin);
                System.out.println("IPK: " + mhs.ipk);
                System.out.println();
                i++;
            }
            System.out.println("Rata-rata IPK : "+ getAvgIpk(countIpk, mahasiswa.length));
        }
        public double getAvgIpk(double ipk, int mhs)
        {
            double avg;
            avg = ipk/Double.valueOf(mhs);
            return avg;
        }
    
    }

