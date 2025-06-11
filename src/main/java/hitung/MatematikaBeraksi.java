
package hitung;


public class MatematikaBeraksi {
     public static void main(String[] args) {
        // membuat objek
        Matematika haifa = new Matematika(3, 1);

        System.out.println("Hasil Penjumlahan : " + haifa.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + haifa.setPengurangan());
        System.out.println("Hasil Perkalian   : " + haifa.setPerkalian());
        System.out.println("Hasil Pembagian   : " + haifa.setPembagian());
    }
}
