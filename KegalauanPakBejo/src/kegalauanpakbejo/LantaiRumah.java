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
public class LantaiRumah {
    /* ATRIBUTE */
    int luasLantai ;
    int ukuranKeramik1 ;
    int ukuranKeramik2 ;
    int isiPerBox ;
    int hargaPerBox;
    
    /* METHODS */
    void totalKeramikYangDibutuhkan () {
        int keramik ;
        keramik = this.luasLantai / this.ukuranKeramik1 * this.ukuranKeramik2 ;
        System.out.println("Total Keramik yang Dibutuhkan : " + keramik + " Keping" );   
    }
    
    void totalBiayaYangDibutuhkan (){
        int biaya ;
        biaya = this.luasLantai / this.ukuranKeramik1 * this.ukuranKeramik2 * this.isiPerBox * this.hargaPerBox ;
        System.out.println("Total Biaya Keramik yang Dibutuhkan : Rp." + biaya + " Rupiah" );
    }
            
        
    }
    
    
