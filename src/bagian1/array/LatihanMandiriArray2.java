package bagian1.array;

public class LatihanMandiriArray2 {
    public static void main(String[] args) {
        String[] hari ={"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Nama Hari Yang Lebih Dari 5 Huruf");
        for (String h : hari){
            if (h.length() > 5){
                System.out.println("Hari = " + h);
            }
        }
    }
}
