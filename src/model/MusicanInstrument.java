package model;

public class MusicanInstrument {
    String Material;
    public void play(){
        System.out.println("инструмент в хорошем состоянии");
    }
   public MusicanInstrument(String Material){
       this.Material=Material;
    }
    public String getMaterial(){
        return Material;
    }
}
