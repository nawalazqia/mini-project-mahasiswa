public class Mahasiswa {

    String nama;
    String nim;
    double nilai;

    void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai  : " + nilai);
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status : Lulus");
        } else {
            System.out.println("Status : Tidak Lulus");
        }
    }
}
