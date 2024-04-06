public class BukuMain05{
    public static void main(String[] args) {
       buku bk1 = new buku();
       bk1.judul = "Today Ends Tomorow Comes";        
       bk1.pengarang = "Denanda Pratiwi";
       bk1.halaman = 198;
       bk1.stok = 13;
       bk1.harga = 71000;

       bk1.tampilInformasi();
       bk1.terjual(5);
       bk1.gantiHarga(60000);

       bk1.tampilInformasi();
       
       buku bk2 = new buku("Self Reward", "Mahera Ayesi", 160, 29, 59000);
       bk2.terjual(11);
       bk2.tampilInformasi();
       
       buku bukuBoby = new buku("Buku Boby", "Boby", 3, 50, 10000);
       bukuBoby.tampilInformasi();
       int terjual = bukuBoby.terjual(8);
       int hargaTotal = bukuBoby.hitungHargaTotal(terjual);
       int diskon = bukuBoby.hitungDiskon(hargaTotal);
       bukuBoby.hitungHargaBayar(hargaTotal, diskon);
   }
    
}