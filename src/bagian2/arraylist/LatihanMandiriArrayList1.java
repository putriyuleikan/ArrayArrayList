package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> daftarBelanja = new ArrayList<>();
    
        //Tambah Data
        daftarBelanja.add("Susu");
        daftarBelanja.add("Teh");
        daftarBelanja.add("Mie");
        daftarBelanja.add("Ayam");
        
        System.out.println("==List Belanjaan Awal==");
        System.out.println("Nama barang : " + daftarBelanja);
        
        //HapusData
        daftarBelanja.remove(1);//Hapus Teh
        
        System.out.println("==Daftar Belanja Akhir==");
        System.out.println("Sisa Belanjaan : " + daftarBelanja);
        System.out.println("Jumlah Belanjaan : " + daftarBelanja.size() + " item");
    }
}
