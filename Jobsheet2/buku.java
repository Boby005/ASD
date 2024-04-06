
    public class buku {
        String judul, pengarang;
        int halaman, stok, harga;
    
        public buku(String judul, String pengarang, int halaman, int stok, int harga) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.halaman = halaman;
            this.stok = stok;
            this.harga = harga;
        }
    
        public buku(){
    
        }
    
        void tampilInformasi() {
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
        }
    
        int terjual(int jml) {
            if(stok > 0){
                stok -= jml;
            }else{
                System.out.println("Stok tidak mencukupi");
            }
            return jml;
        }
    
        void restock(int jml) {
            stok += jml;
        }
    
        void gantiHarga(int hrg) {
            harga = hrg;
        }
    
        int hitungHargaTotal(int terjual){
            int hargaTotal = harga * terjual;
            System.out.println("Harga Total : " + hargaTotal);
            return hargaTotal;
        }
    
        int hitungDiskon(int hargaTotal){
            int diskon = 0;
            if(hargaTotal > 150000){
                diskon = 12;
                System.out.println("Anda mendapatan diskon sebesar "+ diskon);
            }else if(hargaTotal >= 75000 ){
                diskon = 5;
                System.out.println("Anda mendapatan diskon sebesar "+ diskon);
            }else{
                System.out.println("Anda tidak mendapatan diskon");
            }
            return diskon;
        }
    
        void hitungHargaBayar(int hargaTotal, int diskon){
            int hitungBayar = 0, potongan = 0;
            if(diskon > 0){
                potongan = hargaTotal*diskon/100;
                hitungBayar = hargaTotal - potongan;
            }else{
                hitungBayar = hargaTotal;
            }
            System.out.println("Total yang harus anda bayar "+hitungBayar);
        }
    }

