/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author rioan
 */
import java.util.Scanner;
public class mtkcanggihberaksi {
    public static void main(String[] args) {
        mtkcanggih mtk = new mtkcanggih();
        Scanner input = new Scanner(System.in);
        
        mtk.pertanyaan();
        System.out.print("Masukan Pilihan Anda: ");
        int pilihan = input.nextInt();
        System.out.print("Masukan angka 1: ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka 2: ");
        int angka2 = input.nextInt();
        
        mtk.getHasil(pilihan, angka1, angka2);
        
    }
}
