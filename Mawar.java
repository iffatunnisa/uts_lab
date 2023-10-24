public abstract class Mawar extends Bunga implements tipeDaun1, jenisAkar1, jumlahPetals1 {
    // Constructor
    public Mawar(String namaBunga, String warnaBunga, String aromaBunga, String namaIlmiah) {
        super();
        setNamaBunga(namaBunga);
        setWarnaBunga(warnaBunga);
        setAromaBunga(aromaBunga);
        setNamaIlmiah(namaIlmiah);
    }

    // Implementasi metode abstract dari kelas Bunga
    public void tumbuh() {
        System.out.println("Mawar tumbuh dengan batang yang tinggi dan bermekaran indah.");
    }

    // Implementasi metode dari interface tipeDaun1
    public void bersirip() {
        System.out.println("Daun Mawar memiliki daun bersirip.");
    }

    // Implementasi metode dari interface jenisAkar1
    public void akarSerabut() {
        System.out.println("Mawar memiliki jenis akar serabut.");
    }

    // Implementasi metode dari interface jumlahPetals1
    public void kurangDari10() {
        System.out.println("Mawar memiliki 5 hingga 7 kelopak bunga.");
    }

    // Contoh polymorphism
    @Override
    public void cetak() {
        System.out.println("Detail Mawar:");
        super.cetak(); // Memanggil metode cetak dari superclass Bunga
    }

    public static void main(String[] args) {
        Mawar mawar = new Mawar("Mawar Merah", "Merah", "Wangi", "Rosa");
        mawar.tumbuh();
        mawar.bersirip();
        mawar.akarSerabut();
        mawar.kurangDari10();

        // Polymorphism
        mawar.cetak();
    }
}
