/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    //deklarasi variabel
    String jenis, brand;
    int cc;
    
    // method input data
    public void input() {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Jenis Mobil\t:");
        jenis = masuk.nextLine();
        System.out.print("Masukan Brand Mobil\t:");
        brand = masuk.nextLine();
        System.out.print("Masukan cc Mobil\t:");
        cc = masuk.nextInt();
    }
    //method tampilan akhir
    void tampil(){
        System.out.println("Jenis Mobil\t: "+jenis);
        System.out.println("Brand Mobil\t: "+brand);
        System.out.println("CC Mobil\t: "+cc);
    }
}
