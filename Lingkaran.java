public class Lingkaran extends BangunDatar {
    int r;
    
    public Lingkaran(int r){
        this.r = r;
    }

    public float luas(){
        return (float) (Math.PI * r * r);
    }

    public void draw(){
        System.out.println("Menggambar Lingkaran");
    }
}