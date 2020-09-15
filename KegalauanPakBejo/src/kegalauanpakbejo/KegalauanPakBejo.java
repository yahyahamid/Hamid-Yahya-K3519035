/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejo;

/**
 *
 * @author User
 */
public class KegalauanPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi */
        LantaiRumah k1 = new LantaiRumah () ;
        k1.luasLantai = 100 ;
        k1.ukuranKeramik1 = 3 ; 
        k1.ukuranKeramik2 = 3 ;
        k1.isiPerBox = 10 ;
        k1.hargaPerBox = 54000 ;
        k1.totalKeramikYangDibutuhkan();
        k1.totalBiayaYangDibutuhkan();
        
        LantaiRumah k2 = new LantaiRumah () ;
        k2.luasLantai = 100 ;
        k2.ukuranKeramik1 = 4 ; 
        k2.ukuranKeramik2 = 4 ;
        k2.isiPerBox = 5 ;
        k2.hargaPerBox = 65000 ;
        k2.totalKeramikYangDibutuhkan();
        k2.totalBiayaYangDibutuhkan();
        
         LantaiRumah k3 = new LantaiRumah () ;
        k3.luasLantai = 100 ;
        k3.ukuranKeramik1 = 30 ; 
        k3.ukuranKeramik2 = 40 ;
        k3.isiPerBox = 8 ;
        k3.hargaPerBox = 60000 ;
        k3.totalKeramikYangDibutuhkan();
        k3.totalBiayaYangDibutuhkan();
    }
    
}
