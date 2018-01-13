/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacodingday2;

/**
 *
 * @author user
 */
public class LvRigacodingDay2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // šiet izveidojam konkrētus objektus
        // 1. variansts
        Automasina auto1 = new Automasina();
        // 2 variants
        Transportlidzekls auto2 = new Automasina();
        // Nē
        // Transportlidzeklis auto3 = new Transportlidzekls();
        Transportlidzekls lidmasina = new Lidmasina();
        Transportlidzekls vilciens = new Vilciens();
        
        // attiecīgi mēs varam izsaukt šo metodi pārvietoties
        auto1.Parvietoties();
        lidmasina.Parvietoties();
        vilciens.Parvietoties();
        
        
    }
    
}
