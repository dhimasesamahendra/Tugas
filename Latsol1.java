/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSoal;

/**
 *
 * @author user
 */
public class Latsol1 {
    public static void main(String[] args){
    int SukuPertama = 3,selisih = 5, JumlahSuku = 10, TotalDeret = 0, SukuSaatIni = SukuPertama;
    for(int i = 0; i <= JumlahSuku; i++){
        TotalDeret += SukuSaatIni;
        SukuSaatIni += selisih;
        System.out.println("Suku ke "+1+" = "+SukuSaatIni);
     }
        System.out.println("Total Deret Aritmatika = "+TotalDeret);
    }
}
