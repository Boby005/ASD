import java.util.Scanner;

public class Fungsi05 {
    static Scanner input05 = new Scanner(System.in);
    static String[][] tokoBunga = new String[4][5];
    static String[][] bungaRusak = new String[4][5];
    static int aglomena = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
    static String[] namaBunga = {"Aglonema", "Keladi \t", "Alocasia", "Mawar \t"};

    public static void main(String[] args) {
        int pilihan = 0;
        tokoBunga[0][0] = "RoyalGarden 1";
        tokoBunga[0][1] = "10";
        tokoBunga[0][2] = "5";
        tokoBunga[0][3] = "15";
        tokoBunga[0][4] = "7";

        tokoBunga[1][0] = "RoyalGarden 2";
        tokoBunga[1][1] = "6";
        tokoBunga[1][2] = "11";
        tokoBunga[1][3] = "9";
        tokoBunga[1][4] = "12";

        tokoBunga[2][0] = "RoyalGarden 3";
        tokoBunga[2][1] = "2";
        tokoBunga[2][2] = "10";
        tokoBunga[2][3] = "10";
        tokoBunga[2][4] = "5";

        tokoBunga[3][0] = "RoyalGarden 4";
        tokoBunga[3][1] = "5";
        tokoBunga[3][2] = "7";
        tokoBunga[3][3] = "12";
        tokoBunga[3][4] = "9";

        while (true) {
            System.out.println("1. Cek Pendapatan Semua Cabang");
            System.out.println("2. Stok Cabang RoyalGarden 4");
            System.out.println("3. Keluar");

            System.out.print("Pilih (1/2/3) :");
            pilihan = 0;
            pilihan = input05.nextInt();
            switch (pilihan) {
                case 1:
                    int[][] income = getIncome();
                    showData(income);
                    break;
                case 2:
                    updateStok();
                    showStok();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }

    public static int[][] getIncome() {
        int[][] income = new int[4][5];

        for (int i = 0; i < income.length; i++) {
            income[i][0] = Integer.valueOf(tokoBunga[i][1]) * aglomena;
            income[i][1] = Integer.valueOf(tokoBunga[i][2]) * keladi;
            income[i][2] = Integer.valueOf(tokoBunga[i][3]) * alocasia;
            income[i][3] = Integer.valueOf(tokoBunga[i][4]) * mawar;
            income[i][3] = 0;
        }

        return income;
    }

    public static void updateStok() {
        bungaRusak[3][0] = tokoBunga[3][0];
        bungaRusak[3][1] = "1";
        bungaRusak[3][2] = "2";
        bungaRusak[3][3] = "0";
        bungaRusak[3][4] = "5";
    }

    public static void showData(int[][] income) {
        System.out.println("\t\t\t Aglonema \t Keladi \t Alocasia \t Mawar \t Total");
        for (int i = 0; i < tokoBunga.length; i++) {
            System.out.println(tokoBunga[i][0] + "\t\t " + income[i][0] + " \t " + income[i][1] + " \t " + income[i][2]
                    + " \t " + income[i][3] + "\t" + (income[i][0] + income[i][1] + income[i][2] + income[i][3]));
        }
        System.out.println("===============================================================");
    }

    public static void showStok() {
        System.out.println("Toko Bunga RoyalGarden 4");
        System.out.println("Jenis \t\t Stok Awal \tRusak/Mati \t Stok Akhir");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.println(namaBunga[i] + "\t\t" + tokoBunga[3][i + 1] + "\t\t" + bungaRusak[3][i + 1] + "\t\t"
                    + (Integer.valueOf(tokoBunga[3][i + 1]) - Integer.valueOf(bungaRusak[3][i + 1])));
        }
        System.out.println("===============================================================");
    }
}
