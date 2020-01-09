
package clases;

import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author erick
 */
public class Reporte {
    JFreeChart Grafica;
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    
    public void Report(){
        
        ConvertirFecha cf = new ConvertirFecha();
        
        String universitario = "UNIVERSITARIO";
        String escolar = "ESCOLAR";
        String urbano = "URBANO";

        
        String speed = "Enero";
        String millage = "Febrero";


        data.addValue(34, universitario, speed);
        data.addValue(1, universitario, millage);


        data.addValue(5.0, escolar, speed);
        data.addValue(10.0, escolar, millage);


        data.addValue(4.0, urbano, speed);
        data.addValue(3.0, urbano, millage);



        Grafica = ChartFactory.createBarChart("Reporte ", "Category", "Score", data,
                PlotOrientation.VERTICAL,
                true, true, false);
        
        JOptionPane.showMessageDialog(null, cf.Fecha("2020-01-02 16:56:55", "dd"));
    }
    
    public JFreeChart getGraf(){
        return Grafica;
    } 
}
