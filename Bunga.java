abstract class Bunga {
    private String namaBunga;
    private String warnaBunga;
    private String aromaBunga;
    private String namaIlmiah;
    // abstract
    public abstract void tumbuh();

    // constructor    
    public Bunga() {
    }
}

interface tipeDaun1{
    public void bersirip();
}
interface tipeDaun2{
    public void memanjang();
}
interface tipeDaun3{
    public void bergerigi();
}

interface jenisAkar1{
    public void akarTunggang();
}
interface jenisAkar2{
    public void akarSerabut();
}

interface jumlahPetals1{
    public void kurangDari10();
}
interface jumlahpetals2{
    public void lebihDari10();
}