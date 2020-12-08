/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosBaseDatos;

import java.io.FileNotFoundException;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Kevin Benitez
 */
public class Report
{

    /**
     * @param args the command line arguments
     * @throws net.sf.jasperreports.engine.JRException
     */
    public static void main(String[] args) throws JRException, FileNotFoundException
    {
        Reporte rep = new Reporte();
        rep.generaReporte();
    }
    
}
