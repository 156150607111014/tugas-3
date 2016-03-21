/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan3;
/**
 *
 * @author Fandi
 */
import java.util.Scanner;

public class MainAngka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Byte pil, angka;
        String huruf;
        Angka convert = new Angka();
        System.out.println("program konversi huruf dan angka");
        System.out.println("");
        System.out.println("menu");
        System.out.println("1.konversi angka ke huruf");
        System.out.println("2.konversi huruf ke angka");
        System.out.println("3.exit");
        do {
            System.out.println("");
            System.out.print("masukkan pilihan anda : ");
            pil = input.nextByte();
            switch (pil) {
                case 1:
                    System.out.print("masukkan angka (1-100): ");
                    angka = input.nextByte();
                    if (angka > 100 || angka == 0) {
                        System.out.println("input hanya dapat 1-100");
                    } else {
                        convert.overloadingMeth(angka);
                    }
                    break;
                case 2:
                    System.out.print("masukkan angka dalam huruf (satu - seratus): ");
                    huruf = input.nextLine();
                    huruf = input.nextLine();
                    convert.overloadingMeth(huruf);
                    System.out.println("hasil = " + convert.overloadingMeth(huruf.toLowerCase()));
                    break;
            }
        } while (pil != 3);
    }
}
