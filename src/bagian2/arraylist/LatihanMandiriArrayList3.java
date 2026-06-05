package bagian2.arraylist;

import java.util.ArrayList;
public class LatihanMandiriArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        
    
        //Data Nama
        daftarNama.add("Anies");
        daftarNama.add("Putri");
        daftarNama.add("Ayu");
        daftarNama.add("Lestari");
        daftarNama.add("Katsuki");
        daftarNama.add("Awa");
        
        System.out.println(" Nama Yang Diawali Huruf 'A'");
        
        for (String nama : daftarNama){
        
            if (nama.startsWith("A")){
                System.out.println("* " + nama);
            }
        }
    }
}
