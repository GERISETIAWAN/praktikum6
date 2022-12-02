public class Utama {
    public static void main(String[] args) {
        // buat object dari class BangunDatar
        BangunDatar lingkaran = new Lingkaran(3);
        BangunDatar segitiga = new Segitiga(4, 6);
        BangunDatar persegi = new Persegi (12);

        //memanggil method gambar
        lingkaran.draw();
        segitiga.draw();
        persegi.draw();

        //mencetak luas bangunan
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Luas Persegi: " + persegi.luas());
    }
}