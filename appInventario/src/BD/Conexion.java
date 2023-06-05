package BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    // Conexion a la base de datos
    Connection con = null;
    
    public Connection getConexion () {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                           + "database=inventories;"
                           + "user=sa;"
                           + "password=root;"
                           + "encrypt=false;";

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection ( conexionUrl );
            System.out.println ( "CONEXION EXITOSA" );
            return con;
        }
    
        catch ( Exception ex ) {
            System.out.println ( "Error abrir: " + ex.getMessage () );
            return null;
        }
    }
}