package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Operacion;
import vista.CalcVista;

/**
 *
 * @author J. David Cayo
 *         TSP - UTN FRM
 */

public class Controller implements ActionListener{
    private CalcVista vista;
    private Operacion operacion;
    private String txtDisplay = "";
    
    public Controller(){}

    Controller(CalcVista vista, Operacion operacion) {
        this.vista = vista;
        this.operacion = operacion;
        
        escucharBtn();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(this.vista.btn0)){            
            this.txtDisplay += "0";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn1)){            
            this.txtDisplay += "1";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn2)){            
            this.txtDisplay += "2";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn3)){            
            this.txtDisplay += "3";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn4)){            
            this.txtDisplay += "4";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn5)){            
            this.txtDisplay += "5";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn6)){            
            this.txtDisplay += "6";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn7)){            
            this.txtDisplay += "7";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn8)){            
            this.txtDisplay += "8";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btn9)){            
            this.txtDisplay += "9";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        if(e.getSource().equals(this.vista.btnPunto)){            
            this.txtDisplay += ".";
            this.vista.txtDisplay.setText(txtDisplay);
        }
        
        //Operaciones
        
        if(e.getSource().equals(this.vista.btnSumar)){
            if(!this.vista.txtDisplay.getText().isEmpty()){
            this.operacion.setOp1(Double.valueOf(this.vista.txtDisplay.getText()));
            this.operacion.setOperator('+');
            this.txtDisplay = "";
            this.vista.txtDisplay.setText(txtDisplay);
            }else{
                System.out.println("No ha ingresado un numero a sumar!");
            }
        }
        
        if(e.getSource().equals(this.vista.btnRestar)){
            if(!this.vista.txtDisplay.getText().isEmpty()){
            this.operacion.setOp1(Double.valueOf(this.vista.txtDisplay.getText()));
            this.operacion.setOperator('-');
            this.txtDisplay = "";
            this.vista.txtDisplay.setText(txtDisplay);
            }else{
                System.out.println("No ha ingresado un numero a restar!");
            }
        }
        
        if(e.getSource().equals(this.vista.btnDividir)){
            if(!this.vista.txtDisplay.getText().isEmpty()){
            this.operacion.setOp1(Double.valueOf(this.vista.txtDisplay.getText()));
            this.operacion.setOperator('/');
            this.txtDisplay = "";
            this.vista.txtDisplay.setText(txtDisplay);
            }else{
                System.out.println("No ha ingresado un numero a dividir!");
            }
        }
        
        if(e.getSource().equals(this.vista.btnMultiplicar)){
            if(!this.vista.txtDisplay.getText().isEmpty()){
            this.operacion.setOp1(Double.valueOf(this.vista.txtDisplay.getText()));
            this.operacion.setOperator('*');
            this.txtDisplay = "";
            this.vista.txtDisplay.setText(txtDisplay);
            }else{
                System.out.println("No ha ingresado un numero a multiplicar!");
            }
        }
        
        if(e.getSource().equals(this.vista.btnIgual)){            
            this.operacion.setOp2(Double.valueOf(this.vista.txtDisplay.getText()));
            this.operacion.execute();
            this.vista.txtDisplay.setText(String.valueOf(this.operacion.getResult()));
            
            //Al cacular la operacion  se guarda la misma en la db.
            operacion.save();
            
        }
        
        if(e.getSource().equals(this.vista.btnHistorial)){
            operacion.listarHistorial();
        
        }
        
        if(e.getSource().equals(this.vista.btnClear)){
            this.operacion.clear();
            this.vista.txtDisplay.setText("");
            this.txtDisplay = "";
            
        }
        
    }

    private void escucharBtn() {
        vista.btn0.addActionListener(this);
        vista.btn1.addActionListener(this);
        vista.btn2.addActionListener(this);
        vista.btn3.addActionListener(this);
        vista.btn4.addActionListener(this);
        vista.btn5.addActionListener(this);
        vista.btn6.addActionListener(this);
        vista.btn7.addActionListener(this);
        vista.btn8.addActionListener(this);
        vista.btn9.addActionListener(this);
        vista.btnClear.addActionListener(this);
        vista.btnDividir.addActionListener(this);
        vista.btnHistorial.addActionListener(this);
        vista.btnIgual.addActionListener(this);
        vista.btnMultiplicar.addActionListener(this);
        vista.btnPunto.addActionListener(this);
        vista.btnRestar.addActionListener(this);
        vista.btnSumar.addActionListener(this);
    }

}
