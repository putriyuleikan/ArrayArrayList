package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        daftarAngka.add(10);
        daftarAngka.add(67);
        daftarAngka.add(19);
        daftarAngka.add(99);
        daftarAngka.add(45);
        
        int terbesar = daftarAngka.get(0);
        
        for (int angka : daftarAngka){
            if (angka > terbesar){
                terbesar = angka;
            }
        }
        
        System.out.println("==Mencari Angka Terbesar==");
        System.out.println("Semua Angka : " + daftarAngka);
        System.out.println("Nilai Terbesar : " + terbesar);
    }
}
