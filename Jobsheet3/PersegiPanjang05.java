public class PersegiPanjang05 {
    public int panjang;
    public int lebar;

    public PersegiPanjang05(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public PersegiPanjang05()
    {

    }
    public void cetakInfo(PersegiPanjang05[] arrayOfPersegiPanjang05)
    {
        for (int i = 0; i < arrayOfPersegiPanjang05.length ; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang05[i].panjang, arrayOfPersegiPanjang05[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang05[i].panjang, arrayOfPersegiPanjang05[i].lebar);
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang05[i].panjang + ", lebar: " + arrayOfPersegiPanjang05[i]. lebar+", luas: "+ luas+ ", keliling: "+keliling );
        }
    }

    public int hitungLuas(int p, int l)
    {
        int luas = 0;
        luas = p * l;
        return luas;
    }
    public int hitungKeliling(int p, int l)
    {
        int keliling = 0;
        keliling = 2*(p+l);
        return keliling;
    }
}