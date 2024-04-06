package Minggu5;

class Perusahaan05 {
    private int elemen;
    private double keuntungan[];
    private double total;

    Perusahaan05(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF() {
        for (int i = 0; i < elemen; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    double totalDC(int l, int r) {
        if (l == r)
            return keuntungan[l];
        else if (l < r) {
            int mid = l + (r - l) / 2; 
            double lsum = totalDC(l, mid);
            double rsum = totalDC(mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }

    public int getJumlahBulan() {
        return elemen;
    }

    public void setKeuntungan(int index, double value) {
        keuntungan[index] = value;
    }
}