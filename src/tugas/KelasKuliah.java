package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tampilkanSemua() {
        System.out.println("=== Data Mahasiswa ===");

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.info());
        }
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            total += mahasiswa.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
    
}