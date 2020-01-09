package clases;
import java.sql.*;
/**
 *
 * @author erick
 */
public class Conexion {
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost/BDBuses", "erick", "localhost");
            return cn;
        }catch(SQLException ex){
            System.out.println("error en la conexion "+ex);
        }
        return (null);
    }
}
