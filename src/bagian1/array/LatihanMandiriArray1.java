package bagian1.array;

public class LatihanMandiriArray1 {
    public static void main(String[] args) {
        //atribut
        double[] suhu = {31.5, 29.5, 40.5, 28.5, 30.5, 32.8};
        
        double tertinggi = suhu[0];
        double terendah = suhu[0];
        
        //Menggunakan for-each
        for (double s : suhu) {
            if (s > tertinggi){
                tertinggi = s;
            }
            if (s < terendah){
                terendah = s;
            }
        }
        
        System.out.println("===Analisis Suhu Tertinggi dan Terendah===");
        System.out.println("Suhu Tertinggi = " + tertinggi + "°C");
        System.out.println("Suhu Terendah = " + terendah + "°C");
        
    }
}
