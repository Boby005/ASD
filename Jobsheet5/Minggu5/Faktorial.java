package Minggu5;


public class Faktorial {
    int nilai;

    public int faktorialBFUsingWhile(int n) {
        int hasil = 1;
        int i = 1;
        while (i <= n) {
            hasil *= i;
            i++;
        }
        return hasil;
    }

    public int faktorialBFUsingDoWhile(int n) {
        int hasil = 1;
        int i = 1;
        do {
            hasil *= i;
            i++;
        } while (i <= n);
        return hasil;
    }
}

