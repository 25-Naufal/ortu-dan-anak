/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortu;

/**
 *
 * @author ASUS X450JN
 */
public class anak extends Ortu {
    //memanggil fungsi dari kelas parent
    
    public anak(){
        super();
        System.out.println("Makanan dan Minuman");
    }
    
    public void tampil(){
        super.Man();
    }
    
}