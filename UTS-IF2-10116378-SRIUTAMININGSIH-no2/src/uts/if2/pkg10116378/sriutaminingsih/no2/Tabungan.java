/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116378.sriutaminingsih.no2;

/**
 *
 * @author SRI UTAMI NINGSIH
 * KELAS : IF-2
 * NIM : 10116378
 * DESKRIPSI : UTS NO 2
 */
class Tabungan {
    private int saldo;
    
    public void Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    }
}
