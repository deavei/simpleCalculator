/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Historial;
import modelo.Operacion;

/**
 *
 * @author DavidC
 */
public class SimpleCalculatorMVCDeavei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char operator = ' ';
        int tmp;
        
        Historial historial = new Historial();
        Operacion cuenta = new Operacion();
        
        historial.getListado();
//        for(int i = 0; i < 10; i++){
//        cuenta.setOp1(Math.round(Math.random()*1000));
//        cuenta.setOp2(Math.round(Math.random()*1000));
//        
//        tmp= (int)(Math.random()*4);
//        switch(tmp){
//            case 0: operator = '+';
//            break;
//            case 1: operator = '-';
//            break;
//            case 2: operator = '*';
//            break;
//            case 3: operator = '/';
//            break;
//        }
//        cuenta.setOperator(operator);
//        
//        cuenta.execute();
//        
//        historial.addToHistorial(cuenta);
//        }
        
//        System.out.println("Operaciones añadidas a la db satisfactoriamente");
        
        
    }
    
}
