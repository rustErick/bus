package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author erick
 */
public class ConvertirFecha {
    
    public String Fecha(String data, String salidaFormato)  {
        
        LocalDate fecha = LocalDate.parse(data.substring(0, 19), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); 
        DateTimeFormatter mes = DateTimeFormatter.ofPattern(salidaFormato);
        return fecha.format(mes);
    }
}
