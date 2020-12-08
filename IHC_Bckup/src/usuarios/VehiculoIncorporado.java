
package usuarios;

import javax.swing.ImageIcon;

/**
 * @author saipr
 */
public class VehiculoIncorporado
{

    //Propiedades
    private String nombre;
    private ImageIcon credencialAnv;
    private ImageIcon credencialRev;
    private ImageIcon tarjCirculacion;
    private String placas;
    private String marca;
    private String color;
    private String tamanio;

    public VehiculoIncorporado()
    {
    }

    public VehiculoIncorporado(String nombre, ImageIcon credencialAnv, ImageIcon credencialRev, ImageIcon tarjCirculacion, String placas, String marca, String color, String tamanio)
    {
        
        this.nombre = nombre;
        this.credencialAnv = credencialAnv;
        this.credencialRev = credencialRev;
        this.tarjCirculacion = tarjCirculacion;
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        this.tamanio = tamanio;
        
    }

    public String mostrarDatos()
    {
        
        boolean cAnv = (credencialAnv != null);
        boolean cRev = (credencialRev != null);
        boolean cTarjC = (tarjCirculacion != null);

        return "Nombre: " + nombre + "\n"
                + "CredAnverso " + cAnv + "\n"
                + "CredReverso " + cRev + "\n"
                + "TarjCirculacion " + cTarjC + "\n"
                + "Placas " + placas + "\n"
                + "Marca " + marca + "\n"
                + "Color " + color + "\n"
                + "Tamaño " + tamanio + "\n";
        
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public ImageIcon getCredencialAnv()
    {
        return credencialAnv;
    }

    public void setCredencialAnv(ImageIcon credencialAnv)
    {
        this.credencialAnv = credencialAnv;
    }

    public ImageIcon getCredencialRev()
    {
        return credencialRev;
    }

    public void setCredencialRev(ImageIcon credencialRev)
    {
        this.credencialRev = credencialRev;
    }

    public ImageIcon getTarjCirculacion()
    {
        return tarjCirculacion;
    }

    public void setTarjCirculacion(ImageIcon tarjCirculacion)
    {
        this.tarjCirculacion = tarjCirculacion;
    }

    public String getPlacas()
    {
        return placas;
    }

    public void setPlacas(String placas)
    {
        this.placas = placas;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getTamanio()
    {
        return tamanio;
    }

    public void setTamanio(String tamanio)
    {
        this.tamanio = tamanio;
    }

}
