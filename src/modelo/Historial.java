
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author J. David Cayo <github.com/deavei>
 * @Created at 24/06/2020
 */
public class Historial {
    
    private Operacion calculo;
    private ArrayList listado = new ArrayList();
    private Conection2DB db;
    
    
    public Historial(){
        calculo = null;
        db = new Conection2DB();
    }

    public Operacion getCalculo() {
        return calculo;
    }

    public void setCalculo(Operacion calculo) {
        this.calculo = calculo;
    }

    public ArrayList getListado() {
        String sql = "SELECT * FROM historial ORDER BY id DESC LIMIT 5";
        ResultSet rs = null;
        String tmp = null;
        try {
            PreparedStatement ps = this.db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                tmp = (
                        "  " +
                        rs.getDouble("op1") + "\n" +
                        rs.getString("operator") + " " +
                        rs.getDouble("op2") + "\n------\n" +
                        rs.getDouble("result")
                        +"\n"
                );
                listado.add(tmp);
            }
            
            this.db.getCon().close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        return listado;
    }

    public void addToHistorial(Operacion op){
        writeOperation(op);
    }

    public Conection2DB getDb() {
        return db;
    }

    
    private void writeOperation(Operacion op) {
        String sql = "INSERT INTO historial(op1, op2, operator, result) VALUES(?,?,?,?)";
        try {
            PreparedStatement consulta = db.getCon().prepareStatement(sql);
            consulta.setDouble(1, op.getOp1());
            consulta.setDouble(2, op.getOp2());
            consulta.setDouble(4, op.getResult());
            consulta.setString(3, String.valueOf(op.getOperator()));
            
            consulta.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
