import java.util.Scanner;

public class Tugas205 {
    static Scanner input05 = new Scanner(System.in);
    static double jarak=0,kecepatan=0,waktu=0;
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Hallo !");
        System.out.println("===============");
        
        while (true) {
            int pilihMenu = menu();
            
            switch (pilihMenu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
                    break;
            }
        }
    }   

    public static int menu(){
        int pilihan = 0;

        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("4. Exit");
        System.out.print("Pilih Salah Satu (1/2/3/4) :");
        pilihan = input05.nextInt();

        return pilihan;
    }

    public static void hitungKecepatan(){
        System.out.print("Masukkan Jarak (km): ");
        jarak = input05.nextDouble();
    
        System.out.print("Masukkan Waktu (jam): ");
        waktu = input05.nextDouble();
    
        kecepatan = jarak / waktu;
    
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    public static void hitungJarak(){
        System.out.print("Masukkan Kecepatan (km/jam): ");
        kecepatan = input05.nextDouble();
    
        System.out.print("Masukkan Waktu (jam): ");
        waktu = input05.nextDouble();
    
        jarak = kecepatan * waktu;
    
        System.out.println("Jarak: " + jarak + " km");
    }
  
    public static void hitungWaktu(){
        System.out.print("Masukkan Jarak (km): ");
        jarak = input05.nextDouble();

        System.out.print("Masukkan Kecepatan (km/jam): ");
        kecepatan = input05.nextDouble();
    
        waktu = jarak * kecepatan ;
    
        System.out.println("Waktu: " + waktu + " jam");
    }
}