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
public class EntitasData {
    private String bangun_ruang;
    private String input1;
    private String input2;
    private String input3;
    private String luas;
    private String keliling;
    private String volume;
    
    public EntitasData(String bangun_ruang, String input1, String input2, String input3, String luas, String keliling, String volume) {
        this.bangun_ruang = bangun_ruang;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.luas = luas;
        this.keliling = keliling;
        this.volume = volume; 
    }
    
    public String getBangunRuang(){
        return this.bangun_ruang;
    }
    
    public String getInput1(){
        return this.input1;
    }
    
    public String getInput2(){
        return this.input2;
    }
    
    public String getInput3(){
        return this.input3;
    }
    
    public String getLuas(){
        return this.luas;
    }
    
    public String getKeliling(){
        return this.keliling;
    }
    
    public String getVolume(){
        return this.volume;
    }
    
}
