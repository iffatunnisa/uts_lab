class Mawar extends Bunga implements tipeDaun1, jumlahKelopak1, akar2{
    public Mawar() {
        setNamaBunga("Mawar");
        setWarnaBunga("Merah");
        setAromaBunga("Harum");
        setNamaIlmiah("Rosa");
    }

    @Override
    public void tumbuh() {
        System.out.println("Bunga mawar dapat tumbuh di daerah manapun");
    }
