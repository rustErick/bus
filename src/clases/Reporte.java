
package clases;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.sql.*;
/**
 *
 * @author erick
 */
public class Reporte {
    JFreeChart Grafica;
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    
    public void Report(){
        String gato = "";
        try {
            ConvertirFecha cf = new ConvertirFecha();
            Connection cn2 = Conexion.conectar();
            PreparedStatement pst2 = cn2.prepareStatement("SELECT FechaRegistrado FROM Clientes");
            ResultSet rs2 = pst2.executeQuery();
            if(rs2.next()){
                gato = cf.Fecha(rs2.getString("FechaRegistrado"), "yyyy");
            
                try {
                    Connection cn = Conexion.conectar();
                    CallableStatement cst = cn.prepareCall("{call spClientesPorMesTipo(?)}");
                    cst.setString(1, gato);
                    ResultSet rs = cst.executeQuery();

                    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                    while(rs.next()){
                        data.addValue(rs.getInt(3), rs.getString(2), meses[rs.getInt(1) - 1]);
                    }
                    Grafica = ChartFactory.createBarChart("Reporte ", "Categoria", "Score", data,
                        PlotOrientation.VERTICAL,
                        true, true, false);    
                }catch(HeadlessException | SQLException e){
                    System.out.println("error" + e);
                }
            }
        } catch (Exception e) {
            System.out.println("contacte con el administrador " + e);
        }
    }
    
    public JFreeChart getGraf(){
        return Grafica;
    } 
}
