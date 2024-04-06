import java.util.Scanner;

public class Array05 {
    static String[][] dataMat = new String[8][5];
    static Scanner input05 = new Scanner(System.in);
    static double ips = 0, countNilai = 0, countSks = 0;
    public static void main(String[] args) {
        dataMat[0][0] = "Pancasila \t\t\t";
        dataMat[1][0] = "Konsep Teknologi Informasi\t";
        dataMat[2][0] = "Critical Thingking dan Problem Solving";
        dataMat[3][0] = "Matematika Dasar\t\t";
        dataMat[4][0] = "Bahasa Inggris \t\t\t";
        dataMat[5][0] = "Dasar Pemrograman \t\t";
        dataMat[6][0] = "Praktikum Dasar Pemrograman\t";
        dataMat[7][0] = "Keselamatan dan Kesehatan Kerja\t";

        inputData();
        getPredicate();
        getIPS();
        showData();
    }

    public static void inputData(){

        System.out.println("========================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("========================================");

        for(int i=0; i < dataMat.length; i++){
            System.out.print("Masukkan Nilai Angka untuk Mk "+dataMat[i][0]+ " : ");
            dataMat[i][1] = input05.next();
            System.out.print("Masukkan SKS untuk Mk "+dataMat[i][0]+ " : ");
            dataMat[i][2] = input05.next();
            System.out.println();
        }
    }

    public static void getPredicate(){
        for(int i=0; i<dataMat.length; i++){
            if(Double.valueOf(dataMat[i][1]) > 80){
                dataMat[i][3] = "A";
                dataMat[i][4] = "4.00";
            }else if(Double.valueOf(dataMat[i][1]) > 73){
                dataMat[i][3] = "B+";
                dataMat[i][4] = "3.50";
            }else if(Double.valueOf(dataMat[i][1]) > 65){
                dataMat[i][3] = "B";
                dataMat[i][4] = "3.00";
            }else if(Double.valueOf(dataMat[i][1]) > 60){
                dataMat[i][3] = "C+";
                dataMat[i][4] = "2.50";
            }else if(Double.valueOf(dataMat[i][1]) > 50){
                dataMat[i][3] = "C";
                dataMat[i][4] = "2.00";
            }else if(Double.valueOf(dataMat[i][1]) > 39){
                dataMat[i][3] = "D";
                dataMat[i][4] = "1.50";
            }else {
                dataMat[i][3] = "E";
                dataMat[i][4] = "1.00";
            }
        }
    }

    public static void getIPS(){
        
        for(int i=0; i<dataMat.length; i++){
            countNilai += (Double.valueOf(dataMat[i][4]) * Double.valueOf(dataMat[i][2]));
            countSks += Double.valueOf(dataMat[i][2]);
        }
        ips = countNilai/countSks;
    }

    public static void showData(){
        
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.println("MK \t\t\t\t\t Nilai Angka \t Nilai Huruf \t Bobot Nilai \t\t SKS");
        for(int i=0; i<dataMat.length; i++){
            System.out.println(dataMat[i][0] +"\t\t"+ dataMat[i][1] +"\t\t"+ dataMat[i][3] +"\t\t"+ dataMat[i][4] +"\t\t"+ dataMat[i][2]);
        }

        System.out.println("==============================");
        System.out.println("IP : " + ips);
    }

    
}