
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author J. David Cayo <github.com/deavei>
 * @Created at 24/06/2020
 */
public class Conection2DB {
    private Connection con;
    
    public Conection2DB() {
        this.con = null;
        conect();        
    }

    private void conect() {

        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:historial.db");
            if(this.con != null)System.out.println("Se ha conectado a la db satisfactoriamente");
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al conectarse a la db");
        
            
        }
        
    }

    public Connection getCon() {
        return con;
    }

    public void probarDB(){
        String sql = "INSERT INTO historial( operator ) VALUES(?)";
        
        ResultSet rs = null;
        
        try {
            PreparedStatement consulta = this.con.prepareStatement(sql);
            consulta.setString(1, "Test sql");
            
            consulta.executeUpdate();
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
