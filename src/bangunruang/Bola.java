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
public class Bola extends BangunRuang{
    float diameter;
    
    public Bola(String diameter){
        this.diameter = Float.parseFloat(diameter);
    }
    
    @Override
    public String getLuas(){
        float luas;
        float r = this.diameter/2;

        luas = (float)(Math.pow(r, 2) * 4 * Math.PI);
        return Float.toString(luas);
    }
    
    @Override
    public String getKeliling(){
        float keliling;
        float r = this.diameter/2;
        
        //keliling = (float)(4/3 * Math.PI * Math.pow(r, 2));
        keliling =  (float)(Math.pow(r, 2) * 4/3 * Math.PI);
        return Float.toString(keliling);
    }
    
    @Override
    public String getVolume(){
        float volume;
        float r = this.diameter/2;
        
        volume = (float)(Math.pow(r, 3) * 4/3 * Math.PI);
        return Float.toString(volume);
    }
}
