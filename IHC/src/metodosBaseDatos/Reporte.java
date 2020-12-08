/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosBaseDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kevin Benitez
 */
public class Reporte
{

    public void generaReporte() throws FileNotFoundException
    {
        /*
        //File file = new File("");
        JasperReport archivo = JasperCompileManager.compileReport("reportes/recu.jrxml");
        Map<String, Object> map = new HashMap<>();
        map.put("fecha_e", "%02 - 12 - 2020%");
        map.put("fecha_s", "%02 - 12 - 2020%");
        map.put("indicador", "02 - 12 - 2020");
        map.put("logo1", "src/imagenes/UAEMex.jpg");
        //JRDataSource data = new JREmptyDataSource();
        JasperPrint prin = JasperFillManager.fillReport(archivo, map, ConexionBD.conectar());
        String rutaG = "pdf/Reporte.pdf";
        //A partir de Reporte... se puede apadir alguna fecha para no sobreescribir el existente
        JasperExportManager.exportReportToPdfFile(prin, rutaG);
        JasperViewer vw = new JasperViewer(prin, false);
        vw.setVisible(true);
        vw.setTitle("Reporte de Recurrencias");
         */
        try
        {
            String path = "src/reportes/recu.jasper";
            JasperReport archivo = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/recu.jasper"));
            Map<String, Object> map = new HashMap<>();
            map.put("fecha_e", "%02 - 12 - 2020%");
            map.put("fecha_s", "%02 - 12 - 2020%");
            map.put("indicador", "02 - 12 - 2020");
            map.put("logo1", getClass().getResource("/imagenes/UAEMex.jpg").toString());

            //JRDataSource data = new JREmptyDataSource();
            JasperPrint prin = JasperFillManager.fillReport(archivo, map, ConexionBD.conectar());
            //A partir de Reporte... se puede apadir alguna fecha para no sobreescribir el existente
            //JasperExportManager.exportReportToPdfFile(prin, getClass().getResource("/reportes/Reporte.pdf").toString());
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, prin);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream("Reporte" + ".pdf")); // your output goes here

            exporter.exportReport();
            JasperViewer vw = new JasperViewer(prin, false);
            vw.setVisible(true);
            vw.setTitle("Reporte de Recurrencias");
            vw.show();
        } catch (JRException e)
        {
            System.out.println(e.toString());
        }

    }
}
