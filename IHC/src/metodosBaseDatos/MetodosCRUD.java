/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosBaseDatos;

import Ventanas.VtnConsultasInvitados;
import Ventanas.VtnConsultasIncorporados;
import Ventanas.VtnModifica;
import Ventanas.VtnModificaInv;
import Ventanas.VtnRecurrencias;
import java.applet.AudioClip;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * @author saipr
 */
public class MetodosCRUD
{

    private static Connection conexion;
    private static PreparedStatement sentencia;
    private static ResultSet resultado;
    private final static String cenco = "Q09OVEFET1I=";
    private final static String aenco = "QVNQSVM=";
    public static int confirmacionmod = 0;
    public static String[] arr = null;

    /**
     * Utiliza 1 para retornar el total de registros de incorporados Utiliza 2
     * para retornar el total de registros de invitados
     *
     * @param opc 1 == Incorporados 2 == Invitados
     * @return int con el total de vehiculos
     */
    public static int ultimoRegistro(int opc)
    {
        int n = 0;
        switch (opc)
        {
            case 1:
                try
                {
                    conexion = ConexionBD.conectar();
                    sentencia = conexion.prepareStatement("SELECT * FROM vehiculosincorporados ORDER BY registro DESC LIMIT 1");
                    resultado = sentencia.executeQuery();
                } catch (SQLException e)
                {
                    System.out.println("Error al conectar a BD vehiculos incorporados " + e);
                }
                break;
            case 2: //Para retornarte el numero de la tabla de los invitados
                try
                {
                    conexion = ConexionBD.conectar();
                    sentencia = conexion.prepareStatement("SELECT * FROM vehiculosinvitados ORDER BY registro DESC LIMIT 1");
                    resultado = sentencia.executeQuery();
                } catch (SQLException e)
                {
                    System.out.println("Error al conectar a BD vehiculos invitados " + e);
                }
                break;
        }
        try
        {
            if (resultado.next())
            {
                n = resultado.getInt("registro");
            } else
            {
                n = -1;
            }
        } catch (SQLException e)
        {
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
                System.out.println("Error!!! " + ex);
            }
        }
        return n;
    }

    /**
     * Metodo para guardar en la tabla "vehiculosincorporados"
     *
     * @param codigo_b
     * @param nomb Nombre del incorporado
     * @param rutaCredAnv Ruta del archivo de la credencial anverso
     * @param rutaCredRev Ruta del archivo de la credencial reverso
     * @param rutaTarjCirc Ruta del archivo de la tarjeta de circulacion
     * @param placas ID de las placas del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del Vehiculo
     * @param tamanio Tamaño del vehiculo
     */
    public static void guardaBD(String codigo_b, String nomb, String rutaCredAnv, String rutaCredRev, String rutaTarjCirc, String placas, String color, String marca, String tamanio)
    {
        try
        {
            System.out.println("En guarda BD");
            System.out.println("Ruta credAnver: " + rutaCredAnv);
            System.out.println("Ruta credRever: " + rutaCredRev);
            System.out.println("Ruta tarjCirculacion: " + rutaTarjCirc);
            //Preparacion de las imagenes a binarios para subir a la BD
            File cAnv = new File(rutaCredAnv); //Archivo para la imagen de la credencial Anverso
            File cRev = new File(rutaCredRev); //Archivo para la imagen de la credencial Reverso
            File trjC = new File(rutaTarjCirc);//Archivo para la imagen de la Tarjeta de Circulacion
            ////////////////////////////////////////////////////////////////////////////////////////
            conexion = ConexionBD.conectar();
            String consulta = "INSERT INTO vehiculosincorporados "
                    + "(codigo_b,nombre,credencialAnv,credencialRev,tarjetaCirculacion,placas,color,marca,tamanio) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, codigo_b);
            sentencia.setString(2, nomb);
            FileInputStream fcAnv = new FileInputStream(cAnv); //Permite leer el archivo en binario
            sentencia.setBinaryStream(3, fcAnv); //Esto inserta la imagen del archivo binario de la credencial Anverso
            FileInputStream fcRev = new FileInputStream(cRev); //Permite leer el archivo en binario
            sentencia.setBinaryStream(4, fcRev); //Esto inserta la imagen del archivo binario de la credencial Reverso
            FileInputStream ftrjC = new FileInputStream(trjC); //Permite leer el archivo en binario
            sentencia.setBinaryStream(5, ftrjC); //Esto inserta la imagen del archivo binario de la credencial tarjeta de circulacion
            sentencia.setString(6, placas);
            sentencia.setString(7, color);
            sentencia.setString(8, marca);
            sentencia.setString(9, tamanio);
            int i = sentencia.executeUpdate();
            if (i > 0)
            {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            } else
            {
                JOptionPane.showMessageDialog(null, "Datos NO guardados correctamente.");
            }
            conexion.close();
        } catch (HeadlessException | FileNotFoundException | SQLException e)
        {
            System.out.println("Error!!!" + e);
        } finally
        {
            try
            {
                conexion.close();
            } catch (SQLException e)
            {
                System.out.println("Error!!! " + e);
            }
        }
    }

    /**
     * Metodo para guardar en la tabla "vehiculosinvitados"
     *
     * @param codigo_b
     * @param nomb Nombre del invitado
     * @param placas Placas del cehiculo del invitado
     * @param color Color del vehiculo invitado
     * @param marca Marca del vehiculo invitado
     * @param tamanio Tamaño del vehiculo invitado
     */
    public static void guardaBD(String nomb, String placas, String color, String marca, String tamanio)
    {
        try
        {
            System.out.println("En guarda BD");
            conexion = ConexionBD.conectar();
            String consulta = "INSERT INTO vehiculosinvitados "
                    + "(nombre,placas,color,marca,tamanio,estado) "
                    + "VALUES (?,?,?,?,?,?)";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, nomb);
            sentencia.setString(2, placas);
            sentencia.setString(3, color);
            sentencia.setString(4, marca);
            sentencia.setString(5, tamanio);
            sentencia.setString(6, "ACTIVADO");
            int i = sentencia.executeUpdate();
            if (i > 0)
            {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            } else
            {
                JOptionPane.showMessageDialog(null, "Datos NO guardados correctamente.");
            }
            conexion.close();
        } catch (HeadlessException | SQLException e)
        {
            System.out.println("Error!!!" + e);
        } finally
        {
            try
            {
                conexion.close();
            } catch (SQLException e)
            {
                System.out.println("Error!!! " + e);
            }
        }
    }

    /**
     * Guarda en la base de datos en la tabla INCIDENCIAS
     *
     * @param codigo_b
     * @param hora
     * @param fecha
     */
    public static void guardaBD(String codigo_b, String hora, String fecha)
    {
        conexion = ConexionBD.conectar();
        try
        {
            sentencia = conexion.prepareStatement("SELECT nombre,placas,marca,tamanio,color FROM vehiculosincorporados WHERE codigo_b = ?");
            sentencia.setString(1, codigo_b);
            resultado = sentencia.executeQuery();
            System.out.println("rs incorporado == " + resultado.getRow());
            if (!resultado.first())
            {
                resultado.beforeFirst();
                sentencia = conexion.prepareStatement("SELECT nombre,placas,marca,tamanio,color FROM vehiculosinvitados WHERE registro = ?");
                sentencia.setInt(1, (Integer.parseInt(codigo_b) - 1000000));
                resultado = sentencia.executeQuery();
                System.out.println("rs invitado == " + resultado.getRow());
            }

            if (resultado.first())
            {
                String nombre = resultado.getString("nombre");
                String placas = resultado.getString("placas");
                String marca = resultado.getString("marca");
                String tamaño = resultado.getString("tamanio");
                String color = resultado.getString("color");
                if (!nombre.isEmpty())
                {

                    sentencia = conexion.prepareStatement("SELECT * FROM incidencias WHERE nombre = ? AND salida = 'PENDIENTE'");
                    sentencia.setString(1, nombre);
                    resultado = sentencia.executeQuery();

                    if (!resultado.next()) //Entro pero aun no sale el papu
                    {
                        sentencia = conexion.prepareStatement("INSERT INTO incidencias (nombre,placas,marca,tamanio,color,entrada,salida,f_entrada,f_salida) VALUES (?,?,?,?,?,?,?,?,?)");
                        sentencia.setString(1, nombre);
                        sentencia.setString(2, placas);
                        sentencia.setString(3, marca);
                        sentencia.setString(4, tamaño);
                        sentencia.setString(5, color);
                        sentencia.setString(6, hora);
                        sentencia.setString(7, "PENDIENTE");
                        sentencia.setString(8, fecha);
                        sentencia.setString(9, "PENDIENTE");
                        int i = sentencia.executeUpdate();
                    } else
                    {
                        int num_registro = resultado.getInt("registro");
                        sentencia = conexion.prepareStatement("UPDATE incidencias SET salida = ?, f_salida = ? WHERE registro = ?");
                        sentencia.setString(1, hora);
                        sentencia.setString(2, fecha);
                        sentencia.setInt(3, num_registro);
                        int i = sentencia.executeUpdate();
                    }

                    conexion.close();
                }
            }else
            {
                Alertas al = new Alertas();
                al.incorrect(1);
                JOptionPane.showMessageDialog(VtnRecurrencias.vtn, "Alguien intenta ingresar con un codigo de barras no registrado");
            }

        } catch (SQLException ex)
        {
            System.out.println("ERROR " + ex);
            Logger.getLogger(MetodosCRUD.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            try
            {
                conexion.clearWarnings();
            } catch (SQLException e)
            {
                System.out.println("Error de cierre de conexion" + e);
            }
        }
    }

    /**
     * Proporciona TODA la tabla segun tu opcion
     *
     * @param opc 1 = Vehiculos incorporados 2 = Vehiculos invitados
     * @return DefaultTableModel con todos los datos en la tabla listos para
     * setear en tu tabla del frame
     */
    public static DefaultTableModel consultaBD(int opc)
    {
        DefaultTableModel mdl = null;
        try
        {
            //Obtenemos el Query con los resultados
            conexion = ConexionBD.conectar();
            switch (opc) //Switch para el query
            {
                case 1: //Caso de los vehiculos incorporados 
                    sentencia = conexion.prepareStatement("SELECT registro,nombre,placas,color,marca,tamanio FROM vehiculosincorporados");
                    mdl = (DefaultTableModel) VtnConsultasIncorporados.tblVhIncorporados.getModel();
                    break;

                case 2: //Caso de los vehiculos invitados
                    sentencia = conexion.prepareStatement("SELECT registro,nombre,placas,color,marca,tamanio,estado FROM vehiculosinvitados");
                    mdl = (DefaultTableModel) VtnConsultasInvitados.tblVhInvitados.getModel();//Colocamos su respectivo model
                    break;
                case 3://PROXIMAMENTE Caso para las incidencias de vehiculos 
                    sentencia = conexion.prepareStatement("SELECT * FROM incidencias WHERE f_entrada = ? OR f_salida = ?");
                    sentencia.setString(1, VtnRecurrencias.jTFecha.getText());
                    sentencia.setString(2, VtnRecurrencias.jTFecha.getText());
                    mdl = (DefaultTableModel) VtnRecurrencias.tblIncidencias.getModel();//Colocamos su respectivo model
                    break;
            }
            resultado = sentencia.executeQuery();
            mdl.setRowCount(0);//vacia la tabla por si las dudas
            if (resultado != null) //Para que no truene xd
            {
                switch (opc)//switch para llenar la tabla segun su caso
                {
                    case 1:
                        while (resultado.next())
                        {
                            mdl.addRow(new Object[]
                            {
                                resultado.getString("registro"), resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("color"), resultado.getString("marca"), resultado.getString("tamanio"), new Boolean(false)
                            });//A nuestro modelo le agregamos las filas con la informacion del Query
                        }//Una vez termina el while, model tiene todas las filas insertadas en el
                        break;

                    case 2:
                        //Llenamos el modelo de la tabla
                        while (resultado.next())
                        {
                            mdl.addRow(new Object[]
                            {
                                resultado.getString("registro"), resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("color"), resultado.getString("marca"), resultado.getString("tamanio"), resultado.getString("estado"), new Boolean(false)
                            });//A nuestro modelo le agregamos las filas con la informacion del Query
                        }//Una vez termina el while, model tiene todas las filas insertadas en el  mdl
                        break;
                    case 3://PROXIMAMENTE Llenado de tabla para incidencias
                        while (resultado.next())
                        {
                            mdl.addRow(new Object[]
                            {
                                resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("marca"), resultado.getString("color"), resultado.getString("tamanio"), resultado.getString("f_entrada"), resultado.getString("entrada"), resultado.getString("f_salida"), resultado.getString("salida")
                            });//A nuestro modelo le agregamos las filas con la informacion del Query
                        }
                        break;
                }
            }
            conexion.close();
        } catch (SQLException e)
        {
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
                System.out.println("Error!!! para cerrar conexion" + ex);
            }
            System.out.println("Error!!! " + e);
        }
        return mdl;
    }

    /**
     * Proporciona una tabla con todos los datos que coincidan con tu busqueda
     * segun la tabla en la que elijas buscar
     *
     * @param opc Tabla donde buscar 1 = incorporados 2 = invitados
     * @param busq sentencia a buscar en la tabla
     * @return
     */
    public static DefaultTableModel consultaBD(int opc, String busq)
    {
        DefaultTableModel mdl = null;
        try
        {
            //Obtenemos el Query con los resultados
            conexion = ConexionBD.conectar();
            switch (opc) //Switch para el query
            {
                case 1: //Caso de los vehiculos incorporados 
                    sentencia = conexion.prepareStatement("SELECT registro,nombre,placas,color,marca,tamanio FROM vehiculosincorporados");
                    mdl = (DefaultTableModel) VtnConsultasIncorporados.tblVhIncorporados.getModel();
                    break;
                case 2: //Caso de los vehiculos invitados
                    sentencia = conexion.prepareStatement("SELECT registro,nombre,placas,color,marca,tamanio,estado FROM vehiculosinvitados");
                    mdl = (DefaultTableModel) VtnConsultasInvitados.tblVhInvitados.getModel();//Colocamos su respectivo model
                    break;
                case 3: //PROXIMAMENTE Caso de las incidencias
                    sentencia = conexion.prepareStatement("SELECT * FROM incidencias WHERE f_entrada = ? OR f_salida = ?");
                    sentencia.setString(1, VtnRecurrencias.jTFecha.getText());
                    sentencia.setString(2, VtnRecurrencias.jTFecha.getText());
                    mdl = (DefaultTableModel) VtnRecurrencias.tblIncidencias.getModel();//Colocamos su respectivo model
                    break;
            }
            resultado = sentencia.executeQuery();
            mdl.setRowCount(0);//vaciala tabla por si las dudas
            if (resultado != null) //Para que no truene xd
            {
                switch (opc)//switch para llenar la tabla segun su caso
                {
                    case 1:
                        while (resultado.next())
                        {
                            if (resultado.getString("nombre").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("placas").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("color").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("marca").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("tamanio").toUpperCase().startsWith(busq.toUpperCase()))
                            {
                                mdl.addRow(new Object[]
                                {
                                    resultado.getString("registro"), resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("color"), resultado.getString("marca"), resultado.getString("tamanio"), new Boolean(false)
                                });//A nuestro modelo le agregamos las filas con la informacion del Query
                            }
                        }//Una vez termina el while, model tiene todas las filas insertadas en el
                        break;

                    case 2:
                        //Llenamos el modelo de la tabla
                        while (resultado.next())
                        {
                            if (resultado.getString("nombre").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("placas").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("color").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("marca").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("tamanio").toUpperCase().startsWith(busq.toUpperCase()))
                            {
                                mdl.addRow(new Object[]
                                {
                                    resultado.getString("registro"), resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("color"), resultado.getString("marca"), resultado.getString("tamanio"), new Boolean(true)
                                });//A nuestro modelo le agregamos las filas con la informacion del Query
                            }

                        }//Una vez termina el while, model tiene todas las filas insertadas en el  mdl
                        break;
                    case 3://PROXIMAMENTE Llenado de tabla para las incidencias
                        while (resultado.next())
                        {
                            if (resultado.getString("nombre").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("placas").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("color").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("marca").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("tamanio").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("f_entrada").toUpperCase().startsWith(busq.toUpperCase())
                                    || resultado.getString("f_salida").toUpperCase().startsWith(busq.toUpperCase()))
                            {
                                mdl.addRow(new Object[]
                                {
                                    resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("marca"), resultado.getString("color"), resultado.getString("tamanio"), resultado.getString("f_entrada"), resultado.getString("entrada"), resultado.getString("f_salida"), resultado.getString("salida")
                                });//A nuestro modelo le agregamos las filas con la informacion del Query
                            }

                        }//Una vez termina el while, model tiene todas las filas insertadas en el  mdl
                        break;
                }
            }
            conexion.close();
        } catch (SQLException e)
        {
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
                System.out.println("Error!!! para cerrar conexion" + ex);
            }
            System.out.println("Error!!! " + e);
        }
        return mdl;
    }

    /**
     * Proporciona una tabla con todos los datos que coincidan con tu busqueda
     * segun la tabla en la que elijas buscar y el campo
     *
     * @param opc Tabla donde buscar 1 = incorporados 2 = invitados
     * @param busq sentencia a buscar en la tabla
     * @param tipo Busqueda por placas, nombre, color
     * @return
     */
    public static DefaultTableModel consultaBD(int opc, String busq, String tipo)
    {
        DefaultTableModel mdl = null;
        try
        {
            //Obtenemos el Query con los resultados
            conexion = ConexionBD.conectar();
            switch (opc) //Switch para el query
            {
                case 1: //Caso de los vehiculos incorporados 
                    sentencia = conexion.prepareStatement("SELECT registro,nombre,placas,color,marca,tamanio FROM vehiculosincorporados");
                    mdl = (DefaultTableModel) VtnConsultasIncorporados.tblVhIncorporados.getModel();
                    break;
                case 2: //Caso de los vehiculos invitados
                    sentencia = conexion.prepareStatement("SELECT registro,nombre,placas,color,marca,tamanio,estado FROM vehiculosinvitados");
                    mdl = (DefaultTableModel) VtnConsultasInvitados.tblVhInvitados.getModel();//Colocamos su respectivo model
                    break;
                case 3: //PROXIMAMENTE Caso para las incidencias de vehiculos
                    sentencia = conexion.prepareStatement("SELECT * FROM incidencias WHERE f_entrada = ? OR f_salida = ?");
                    sentencia.setString(1, VtnRecurrencias.jTFecha.getText());
                    sentencia.setString(2, VtnRecurrencias.jTFecha.getText());
                    mdl = (DefaultTableModel) VtnRecurrencias.tblIncidencias.getModel();//Colocamos su respectivo model
                    break;
            }
            resultado = sentencia.executeQuery();
            mdl.setRowCount(0);//vacia la tabla por si las dudas
            if (resultado != null) //Para que no truene xd
            {
                switch (opc)//switch para llenar la tabla segun su caso
                {
                    case 1:
                        while (resultado.next())
                        {
                            if (resultado.getString(tipo.toLowerCase()).toUpperCase().startsWith(busq.toUpperCase()))
                            {
                                mdl.addRow(new Object[]
                                {
                                    resultado.getString("registro"), resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("color"), resultado.getString("marca"), resultado.getString("tamanio"), new Boolean(false)
                                });//A nuestro modelo le agregamos las filas con la informacion del Query
                            }
                        }//Una vez termina el while, model tiene todas las filas insertadas en el
                        break;

                    case 2:
                        //Llenamos el modelo de la tabla
                        while (resultado.next())
                        {
                            if (resultado.getString(tipo.toLowerCase()).toUpperCase().startsWith(busq.toUpperCase()))
                            {
                                mdl.addRow(new Object[]
                                {
                                    resultado.getString("registro"), resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("color"), resultado.getString("marca"), resultado.getString("tamanio"), resultado.getString("estado"), new Boolean(false)
                                });//A nuestro modelo le agregamos las filas con la informacion del Query
                            }
                        }//Una vez termina el while, model tiene todas las filas insertadas en el  mdl
                        break;
                    case 3: //PROXIMAMENTE Llenado de la tabla para las incidencias de vehiculos 
                        while (resultado.next())
                        {
                            if (resultado.getString(tipo.toLowerCase()).toUpperCase().startsWith(busq.toUpperCase()))
                            {
                                mdl.addRow(new Object[]
                                {
                                    resultado.getString("nombre"), resultado.getString("placas"), resultado.getString("marca"), resultado.getString("color"), resultado.getString("tamanio"), resultado.getString("f_entrada"), resultado.getString("entrada"), resultado.getString("f_salida"), resultado.getString("salida")
                                });//A nuestro modelo le agregamos las filas con la informacion del Query
                            }
                        }//Una vez termina el while, model tiene todas las filas insertadas en el  mdl
                        break;
                }
            }
            conexion.close();
        } catch (SQLException e)
        {
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
                System.out.println("Error!!! para cerrar conexion" + ex);
            }
            System.out.println("Error!!! " + e);
        }
        return mdl;
    }

    /**
     * Elimina de la base de datos
     *
     * @param opc tabla donde eliminar opc == 1 Tabla Vehiculos incoporados opc
     * == 2 Tabla Vehiculos invitados opc == 3 Tabla incidencias
     * @param mdl la tabla que contiene seleccionados los elementos a eliminar
     */
    public static void eliminaBD(int opc, DefaultTableModel mdl)
    {
        try
        {
            int n = (int) mdl.getRowCount();
            conexion = ConexionBD.conectar();
            try
            {
                switch (opc) //Switch para ejecutar el query
                {
                    case 1: //Caso para la tabla de incorporados

                        for (int i = 0; i < n; i++)//recorre toda la tabla
                        {
                            //System.out.println("Valor " + i + " == " + mdl.getValueAt(i, 6).toString());
                            if (mdl.getValueAt(i, 6).toString().equals("true"))//Inspecciona la columna 7 la cual contiene un boolean, si es TRUE elimina
                            {
                                sentencia = conexion.prepareStatement("DELETE FROM vehiculosincorporados WHERE registro = ?");
                                sentencia.setInt(1, Integer.parseInt(mdl.getValueAt(i, 0).toString())); //Columna 0 apunta al numero de registro en la tabla
                                sentencia.executeUpdate();
                            }
                        }
                        break;
                    case 2: //Caso para la tabla de los invitados
                        for (int i = 0; i < n; i++)
                        {
                            if (mdl.getValueAt(i, 7).toString().equals("true"))//La columna 7 es la que contiene el boolean para saber si esta seleccionado
                            {
                                sentencia = conexion.prepareStatement("DELETE FROM vehiculosinvitados WHERE registro = ?");
                                sentencia.setInt(1, Integer.parseInt(mdl.getValueAt(i, 0).toString())); //Columna 0 apunta al numero de registro en la tabla
                                sentencia.executeUpdate();
                            }
                        }
                        //sentencia.setInt(1, dlt);
                        break;
                    case 3: //PROXIMAMENTE Caso para la tabla de incidencias
                        break;
                }
                conexion.close();
            } catch (NumberFormatException | SQLException e)
            {
                try
                {
                    conexion.close();
                } catch (SQLException ex)
                {
                    System.out.println("Error!!! para cerrar conexion" + ex);
                }
                System.out.println("Error!!! " + e);
            }

        } catch (Exception e)
        {
            System.out.println("Error " + e);
        }
    }

    public static void actualizaBD(int opc, TableModel mdl)
    {

        byte[] imagen1;
        byte[] imagen2;
        byte[] imagen3;
        confirmacionmod = 0;
        try
        {
            int n = (int) mdl.getRowCount();
            System.out.println(n);
            conexion = ConexionBD.conectar();
            try
            {
                switch (opc)
                {
                    case 1:
                        for (int i = 0; i < n; i++)
                        {
                            confirmacionmod = 0;
                            if (mdl.getValueAt(i, 6).toString().equals("true"))
                            {
                                sentencia = conexion.prepareStatement("SELECT * FROM vehiculosincorporados WHERE registro = ? ");
                                sentencia.setInt(1, Integer.parseInt(mdl.getValueAt(i, 0).toString()));
                                //System.out.println(mdl.getValueAt(i, 0).toString());
                                resultado = sentencia.executeQuery();
                                if (resultado.next())
                                {
                                    Blob i1 = resultado.getBlob(4);
                                    Blob i2 = resultado.getBlob(5);
                                    Blob i3 = resultado.getBlob(6);
                                    imagen1 = i1.getBytes(1, (int) i1.length());
                                    imagen2 = i2.getBytes(1, (int) i2.length());
                                    imagen3 = i3.getBytes(1, (int) i3.length());
                                    VtnModifica vtn = new VtnModifica(resultado.getString(1), resultado.getString(2), resultado.getString(3), imagen1, imagen2, imagen3, resultado.getString(7), resultado.getString(8), resultado.getString(9), resultado.getString(10));
                                    vtn.setModal(true);
                                    vtn.setVisible(true);
                                    if (confirmacionmod == 1)
                                    {
                                        /*
                                        for (int j = 0; j < arr.length; j++)
                                        {
                                            System.out.println(arr[j]);
                                        }
                                         */
                                        sentencia = conexion.prepareStatement("UPDATE vehiculosincorporados SET nombre = ?,credencialAnv = ?,credencialRev = ?,tarjetaCirculacion = ?,placas = ?,color = ?,marca = ?,tamanio = ? WHERE registro = ?");
                                        sentencia.setString(1, arr[0]);
                                        if (arr[1] != null)
                                        {
                                            File cAnv = new File(arr[1]);
                                            FileInputStream fcAnv = new FileInputStream(cAnv);
                                            sentencia.setBinaryStream(2, fcAnv);
                                        } else
                                        {
                                            sentencia.setBlob(2, i1);
                                        }
                                        if (arr[2] != null)
                                        {
                                            File cRev = new File(arr[2]);
                                            FileInputStream fcRev = new FileInputStream(cRev);
                                            sentencia.setBinaryStream(3, fcRev);
                                        } else
                                        {
                                            sentencia.setBlob(3, i2);
                                        }
                                        if (arr[3] != null)
                                        {
                                            File trjC = new File(arr[3]);
                                            FileInputStream ftrjC = new FileInputStream(trjC);
                                            sentencia.setBinaryStream(4, ftrjC);
                                        } else
                                        {
                                            sentencia.setBlob(4, i3);
                                        }
                                        sentencia.setString(5, arr[4]);
                                        sentencia.setString(6, arr[5]);
                                        sentencia.setString(7, arr[6]);
                                        sentencia.setString(8, arr[7]);
                                        sentencia.setInt(9, Integer.parseInt(mdl.getValueAt(i, 0).toString()));

                                        int f = sentencia.executeUpdate();
                                        if (f > 0)
                                        {
                                            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
                                        } else
                                        {
                                            JOptionPane.showMessageDialog(null, "Datos NO guardados correctamente.");
                                        }

                                    }
                                }

                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < n; i++)
                        {
                            confirmacionmod = 0;
                            if (mdl.getValueAt(i, 7).toString().equals("true"))
                            {
                                sentencia = conexion.prepareStatement("SELECT * FROM vehiculosinvitados WHERE registro = ? ");
                                sentencia.setInt(1, Integer.parseInt(mdl.getValueAt(i, 0).toString()));
                                resultado = sentencia.executeQuery();
                                if (resultado.next())
                                {
                                    String estado = resultado.getString(7);
                                    VtnModificaInv vtn = new VtnModificaInv(resultado.getString(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6));
                                    vtn.setModal(true);
                                    vtn.setVisible(true);
                                    if (confirmacionmod == 1)
                                    {
                                        sentencia = conexion.prepareStatement("UPDATE vehiculosinvitados SET nombre = ?,placas = ?,color = ?,marca = ?,tamanio = ?,estado = ? WHERE registro = ?");
                                        sentencia.setString(1, arr[0]);
                                        sentencia.setString(2, arr[1]);
                                        sentencia.setString(3, arr[2]);
                                        sentencia.setString(4, arr[3]);
                                        sentencia.setString(5, arr[4]);
                                        sentencia.setString(6, estado);
                                        sentencia.setInt(7, Integer.parseInt(mdl.getValueAt(i, 0).toString()));
                                        int f = sentencia.executeUpdate();
                                        if (f > 0)
                                        {
                                            JOptionPane.showMessageDialog(null, "Datos de invitado actualizados correctamente.");
                                        } else
                                        {
                                            JOptionPane.showMessageDialog(null, "Datos NO actualizados correctamente.");
                                        }
                                    }
                                }
                            }
                        }
                        break;

                }
                conexion.close();
            } catch (NumberFormatException | SQLException e)
            {
                try
                {
                    conexion.close();
                } catch (SQLException ex)
                {
                    System.out.println("Error al cerrar conexion");
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error " + e);
        }
    }

    /**
     * Método encargado de validar entrada al sistema por Contadores o Personal
     * de seguridad
     *
     * @param cad
     * @return
     */
    public static int verify_CAS(String cad)
    {
        int ret = 0;
        System.out.println("CAD == " + cad);
        try
        {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT ctr FROM usr WHERE ctr = BINARY ?";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, cad);
            resultado = sentencia.executeQuery();
            if (resultado.next())
            {

                String edeco = new String(Base64.getDecoder().decode(cenco));
                String adeco = new String(Base64.getDecoder().decode(aenco));
                if (resultado.getString(1).equals(edeco))
                {
                    ret = 1;
                } else
                {
                    if (resultado.getString(1).equals(adeco))
                    {
                        ret = 2;
                    }
                }
            }
            conexion.close();
        } catch (SQLException e)
        {
            System.out.println("Error SQL" + e);
        } finally
        {
            try
            {
                conexion.close();
            } catch (SQLException e)
            {
                System.out.println("Error al cerrar la conexion");
            }
        }
        return ret;
    }

}
