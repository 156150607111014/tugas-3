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

public class MainApotek {
    public static void main(String[] args) {
            Apotek apotek = new Apotek();
            Byte pil, pilObat, blLg;
            String data[] = {"", ""};
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------------------------");
            System.out.println("             apotek adika            ");
            System.out.println("-------------------------------------");
            System.out.println(" ");
            System.out.println("silahkan masukkan data diri anda terlebih dahulu");
            System.out.print("masukkan nama : ");
            data[0] = input.nextLine();
            System.out.print("masukkan alamat : ");
            data[1] = input.nextLine();
            System.out.println("");
            System.out.println("menu");
            System.out.println("1.lihat daftar obat");
            System.out.println("2.beli obat");
            System.out.println("3.selesai, lihat total harga");
            do {
                System.out.println("");
                System.out.print("pilih menu: ");
                pil = input.nextByte();
                if (pil == 1) {
                    apotek.obat();
                } else if (pil == 2) {
                    do {
                        System.out.print("masukkan nomor obat yang ingin dibeli : ");
                        pilObat = input.nextByte();
                        apotek.obat(pilObat);
                        System.out.print("beli lagi(1ya 2tidak)? ");
                        blLg = input.nextByte();
                    } while (blLg != 2);
                } else if (pil == 3) {
                    System.out.println("nama : " + data[0]);
                    System.out.println("alamat : " + data[1]);
                    System.out.println("anda telah membeli " + apotek.totalJenisObat);
                    System.out.println("dengan total harga " + apotek.hargaTotal);
                } else {
                    System.out.println("input tidak valid");
                }
            } while (pil != 3);
        }
    }