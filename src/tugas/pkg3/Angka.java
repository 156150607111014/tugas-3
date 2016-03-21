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
public class Angka {

    public String huruf[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    public String hasil[] = new String[4];

    public void overloadingMeth(int i) {
        System.out.print("hasil = ");
        if (i >= 0 && i <= 100) {
            if (i < 12) {
                System.out.println(huruf[i]);
            } else if (i < 20) {
                System.out.println(huruf[i - 10] + " belas");
            } else if (i < 100) {
                System.out.println(huruf[i / 10] + " puluh " + huruf[i % 10]);
            } else if (i == 100) {
                System.out.println("seratus");
            }
        } else {
            System.out.println("input tidak sesuai, masukkan 1-100");
        }
    }

    public String overloadingMeth(String i) {
        switch (i) {
            case "nol":
                return "0";
            case "satu":
                return "1";
            case "dua":
                return "2";
            case "tiga":
                return "3";
            case "empat":
                return "4";
            case "lima":
                return "5";
            case "enam":
                return "6";
            case "tujuh":
                return "7";
            case "delapan":
                return "8";
            case "sembilan":
                return "9";
            case "sepuluh":
                return "10";
            case "sebelas":
                return "11";
            case "seratus":
                return "100";
            default:
                hasil = i.split(" ");
                if (hasil.length == 2) {
                    if (hasil[1].equals("belas")) {
                        return 1 + overloadingMeth(hasil[0]);
                    } else {
                        return overloadingMeth(hasil[0]) + "0";
                    }
                } else {
                    return overloadingMeth(hasil[0]) + overloadingMeth(hasil[2]);
                }
        }
    }
}