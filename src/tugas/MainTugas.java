// Nama : Putri Ayu Lestari
// NPM : 2410010225
package tugas;

public class MainTugas {
           public static void main(String[] args) {

        // Array mata kuliah
        String[] matkul = {
            "Pemrograman Berbasis Objek",
            "Data Mining",
            "Kecerdasan Buatan"
        };

        System.out.println("=== Nilai Mata Kuliah ===");
        for (String matakuliah : matkul) {
            System.out.println(" * " + matakuliah);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(
                new Mahasiswa("Putri", "2410010225", 95));
        kelas.tambahMahasiswa(
                new Mahasiswa("Katsuki", "2410010001", 100));
        kelas.tambahMahasiswa(
                new Mahasiswa("Eijiro", "2410010025", 50));
        kelas.tambahMahasiswa(
                new Mahasiswa("Mina", "241001010", 45));
        kelas.tambahMahasiswa(
                new Mahasiswa("Denki", "2410010999", 35));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Lulus : "
                + kelas.jumlahLulus());

        System.out.println();

        System.out.println("Tambah Mahasiswa Baru");

        kelas.tambahMahasiswa(
                new Mahasiswa("Shoto", "241001002", 85));
        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Jumlah Data Terbaru : "
                + kelas.jumlahMahasiswa());
    }
    
}
