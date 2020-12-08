/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosBaseDatos;

import java.applet.AudioClip;

/**
 *
 * @author Kevin Benitez
 */
public class Alertas
{

    public void incorrect(int opc)
    {
        try
        {
            AudioClip sonido;
            switch (opc)
            {
                case 1:
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/alarma.wav"));
                    sonido.play();
                    Thread.sleep(200);

                    break;
                case 2:

                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/correcto.wav"));
                    sonido.play();
                    Thread.sleep(200);

                    break;

                case 3:

                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/error.wav"));
                    sonido.play();
                    Thread.sleep(200);

                    break;
                default:
                    throw new AssertionError();
            }
        } catch (InterruptedException e)
        {
            System.out.println("Error al producir sonidos");
        }

    }
}
