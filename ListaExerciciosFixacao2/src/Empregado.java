/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Empregado {
    
    private String Pnome;
    private String Snome;
    private double sMes;
    
    
   public void setPnome(String Pn1) {
       Pnome = Pn1;
   }
    
  public String getPnome(){
      return Pnome;
  }
  
  public void setSnome(String Sn1) {
      Snome = Sn1;
  }
  
  public String getSnome() {
      return Snome;
  }
  
  public void setsMes(double sm){
      if ( sMes < 0.00)
        sMes = 0.0;       
      else 
          sMes = sm;
  }
  public double getSmes() {
     
      return sMes;    
                  
        }
  
  
}
