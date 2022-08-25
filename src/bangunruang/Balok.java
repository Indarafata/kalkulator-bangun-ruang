/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author RennyRakhmawati
 */
public class Balok extends BangunRuang{
    float panjang;
    float lebar;
    float tinggi;
    
    public Balok(String panjang, String lebar, String tinggi){
        this.panjang = Float.parseFloat(panjang);
        this.lebar = Float.parseFloat(lebar);
        this.tinggi = Float.parseFloat(tinggi);
    }
    
    @Override
    public String getLuas(){
        float luas;
        
        luas = 2*((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
        return Float.toString(luas);
    }
    
    @Override
    public String getKeliling(){
        float keliling;
        
        keliling = (this.panjang + this.lebar + this.tinggi)*4;
        return Float.toString(keliling);
    }
    
    @Override
    public String getVolume(){
        float volume;
        
        volume = this.panjang * this.lebar * this.tinggi;
        return Float.toString(volume);
    }
}
