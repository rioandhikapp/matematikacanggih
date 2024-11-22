/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author rioan
 */
public class mtkcanggih extends mtk {

    public void pertanyaan() {
        System.out.println("1. Pertambahan");
        System.out.println("2. Perkalian");
        System.out.println("3. Modulus atau Sisa Hasil Bagi");
    }

    public int modulus(int angka1, int angka2) {
        return angka1 % angka2;
    }

    public void getHasil(int pilihan, int angka1, int angka2) {
        switch (pilihan) {
            case 1:
                System.out.println("hasil tambah " + angka1 + "+" + angka2 + " = " + pertambahan(angka1, angka2));
                break;
            case 2:
                System.out.println("hasil kali : " + perkalian(angka1, angka2));
                break;
            case 3:
                if(angka2 == 0){
                    System.out.println("angka pembagi tidak boleh 0 !!!");
                }else{
                    System.out.println("hasil modulus : " + modulus(angka1, angka2));
                }
                break;
            default:
                System.out.println("pilihan tidak valid!!!");
                break;
        }
    }
}
