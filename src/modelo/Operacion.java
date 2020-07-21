
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DavidC
 */
public class Operacion {
    private Historial historial = null;
    
    private double op1, op2, result;
    private char operator;
    
    public Operacion(){
        op1 = op2 = result = 0.0;
        operator = ' ';
        historial = new Historial();
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void execute() {
        switch(operator){
            case '+': this.result = op1 + op2;
                break;
            case '-': this.result = op1 - op2;
                break;
            case '/': 
                if(op2 != 0)this.result = op1 / op2;
                else this.result = 0.0;
                break;
            case '*': this.result = op1 * op2;
                break;
        }
    }

    public void clear() {
        this.op1 = this.op2 = this.result = 0.0;
        this.operator = ' ';
    }

    public void save() {
        historial.addToHistorial(this);
    }

    public void listarHistorial() {
        ArrayList listado = historial.getListado();
        
        for(int i = 0; i < listado.size(); i++){
            System.out.println((String)listado.get(i));
        }
        
    }
    
}
