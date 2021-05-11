/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * @author Best Buy Uptown
 */
public class Calculadora {
    private int operando1;
    private int operando2;
    
   public Calculadora() {
}
 public Calculadora (int operando1, int operando2){
     this.operando1=operando1;
     this.operando2=operando2;
 }
 public int sumar(){
     int suma=this.operando1+this.operando2;
     return suma;
 }
  public int restar(){
     int resta=this.operando1-this.operando2;
     return resta;
}
   public int multiplicar(){
     int multiplicacion=this.operando1*this.operando2;
     return multiplicacion;
}
   public double dividir(){
       double division=(double)this.operando1 /(double)this.operando2;
       return division;
   }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
  