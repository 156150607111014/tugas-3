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
public class Apotek {
    public String jenisObat[]={"","paramex","paracetamol","formula fix", "mixagrip","mefinal"};
    public int hargaObat[]={0,1000,3000,6500,2000,3500};            
    public int hargaTotal=0;
    public String totalJenisObat="";
    public Apotek(int a){
    }
    public Apotek(){
    }
    public void obat(){
        String obat;
        System.out.println("");
        System.out.println("daftar obat dan harganya : ");
        System.out.println("1."+jenisObat[1]+" "+hargaObat[1]);
        System.out.println("2."+jenisObat[2]+" "+hargaObat[2]);
        System.out.println("3."+jenisObat[3]+" "+hargaObat[3]);
        System.out.println("4."+jenisObat[4]+" "+hargaObat[4]);
        System.out.println("5."+jenisObat[5]+" "+hargaObat[5]);
        System.out.println("");
    }
    public void obat(int a){
        totalJenisObat = totalJenisObat+jenisObat[a]+", ";
        hargaTotal=hargaTotal+hargaObat[a];
        System.out.println("================================");
        System.out.println("barang yang anda beli "+jenisObat[a]);
        System.out.println("================================");
    }
}