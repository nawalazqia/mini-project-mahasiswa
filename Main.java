import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int jumlah = 3;
        Mahasiswa[] daftar = new Mahasiswa[jumlah];
 
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Input Data Mahasiswa ke-" + (i + 1));
 
            Mahasiswa mhs = new Mahasiswa();
 
            System.out.print("Nama  : ");
            mhs.nama = input.nextLine();
 
            System.out.print("NIM   : ");
            mhs.nim = input.nextLine();
 
            System.out.print("Nilai : ");
            String teksNilai = input.nextLine();
            mhs.nilai = Double.parseDouble(teksNilai);
 
            daftar[i] = mhs;
            System.out.println();
        }
 
        System.out.println("DATA MAHASISWA");
        int jumlahLulus = 0;
 
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            daftar[i].tampilkanData();
            daftar[i].cekKelulusan();
            System.out.println();
 
            if (daftar[i].nilai >= 60) {
                jumlahLulus++;
            }
        }
 
        System.out.println("Jumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + (jumlah - jumlahLulus));
 
        input.close();
    }
}
