package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat Objek Pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku (ditambah tahun terbit) lalu memasukkannya ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negri 5 Menara", "Ahmad Fuadi", 2009));
        
        // Menampilkan koleksi awal
        perpus.tampilkanKoleksi();
        
        System.out.println();
        // Simulasi Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        
        System.out.println();
        // Coba fitur Mengembalikan Buku
        perpus.kembalikanBuku("Bumi Manusia");
        
        System.out.println();
        // Coba fitur Cari Penulis
        perpus.cariPenulis("Andrea Hirata");
        
        System.out.println();
        // Menampilkan hasil akhir koleksi
        perpus.tampilkanKoleksi();
        System.out.println("Buku Tersedia : " + perpus.jumlahTersedia());
    }
}