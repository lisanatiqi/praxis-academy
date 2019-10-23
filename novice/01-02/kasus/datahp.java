public class datahp {
    int modelTahun;
    String modelNama;

    public datahp(int tahun, String nama) {
        modelTahun = tahun;
        modelNama = nama;
    }

    public static void main(String[] args) {
        datahp dH = new datahp (2018,"samsung j6+");
        System.out.println(dH.modelNama + " " + dH.modelTahun);
    }
}