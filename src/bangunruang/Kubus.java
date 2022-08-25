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
public class Kubus extends BangunRuang{
    float sisi;
    
    public Kubus(String sisi){
        this.sisi = Float.parseFloat(sisi);
    }
    
    @Override
    public String getLuas(){
        float luas;
        
        
        luas = this.sisi * 6;
        return Float.toString(luas);
    }
    
    @Override
    public String getKeliling(){
        float keliling;
        
        keliling = this.sisi * 12;
        return Float.toString(keliling);
    }
    
    @Override
    public String getVolume(){
        float volume;
        
        volume = (float)(Math.pow(this.sisi, 3));
        return Float.toString(volume);
    }
}
