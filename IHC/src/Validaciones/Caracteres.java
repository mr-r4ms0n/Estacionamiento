/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import java.awt.event.KeyEvent;
/**
 *
 * @author Kevin Benitez
 */
public class Caracteres
{

    //Propiedades 
    String cad1;
    String cad2;

    public static void va(KeyEvent ke)
    {
        if ((ke.getKeyChar() < 'a' || ke.getKeyChar() > 'z')
                && (ke.getKeyChar() < 'A' || ke.getKeyChar() > 'Z')
                && ke.getKeyChar() != ' ' && ke.getKeyChar() != 'ñ'
                && ke.getKeyChar() != 'Ñ' && ke.getKeyChar() != 'á'
                && ke.getKeyChar() != 'Á' && ke.getKeyChar() != 'é'
                && ke.getKeyChar() != 'É' && ke.getKeyChar() != 'í'
                && ke.getKeyChar() != 'Í' && ke.getKeyChar() != 'ó'
                && ke.getKeyChar() != 'Ó' && ke.getKeyChar() != 'ú'
                && ke.getKeyChar() != 'Ú')
        {
            ke.setKeyChar((char) 8);
        }
    }

    /**
     * @param c1 cadena a comparar 1
     * @param c2 cadena 2 a comparar
     * @return false si una de las cadenas es == vacio O c1 == c2
     */
    public static boolean comparacion(String c1, String c2)
    {
        boolean b = true;
        if ((c1.trim().toUpperCase().isEmpty() || c2.trim().toUpperCase().isEmpty()) || (c1.trim().toUpperCase().equals(c2.trim().toUpperCase())))
        {
            b = false;
        }
        return b;
    }

}
