public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas(){
        return (float) (alas * tinggi);
    }

    public void draw(){
        System.out.println("Menggambar Segitiga");
    }
 }