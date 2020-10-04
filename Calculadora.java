/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raúl
 */
public class Calculadora {
    private int numIz;
    private int numDer;
    private char operacion;
    
    public void setnumIz(int n){
        this.numIz=n;
    }
    public int getnumIz(){
        return numIz;
    }
    public void setnumDer(int n){
        this.numDer=n;
    }
    public int getNumDer(){
        return numDer;
    }
    public void setOp(char op){
        this.operacion=op;
    }
    public int calcular(){
        int resul=0;
        if(operacion=='+'){
            resul=numIz+numDer;
        }
        if(operacion=='-'){
            resul=numIz-numDer;
        }
        return resul;
    }
      public static void main(String[] args) {
        Calculadora instancia = new Calculadora();
        instancia.setnumDer(3);
        instancia.setnumIz(3);
        instancia.setOp('-');
        System.out.println("El numero es "+instancia.getNumDer());
 	System.out.println("fwefwwfe");
 
    }
    
}
