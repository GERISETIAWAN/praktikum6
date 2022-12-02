public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public float luas() {
        return (float) (sisi * sisi);
    }

    public void draw(){
        System.out.println("Menggambar Persegi");
    }
}