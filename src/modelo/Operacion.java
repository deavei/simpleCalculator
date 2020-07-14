
package modelo;

/**
 *
 * @author DavidC
 */
public class Operacion {
    
    private double op1, op2, result;
    private char operator;
    
    public Operacion(){
        op1 = op2 = result = 0.0;
        operator = ' ';
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
    
}
