package dam.temasiete.actividad.siete.seis;

/**
 * Clase despacho, con esta clase podremos identificar los despachos de los empleados 
 * de la empresa
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public class Despacho {
    private int numDespacho;
    /**
     * Constructor especifico para los despachos, se requiere de un numero para el usuario
     * @param numDespacho El numero
     */
    public Despacho(int numDespacho){
        this.numDespacho = numDespacho;
    }

    //Getters y setters

    public void setNumDespacho(int numDespacho){
        this.numDespacho = numDespacho;
    }

    public int getNumDespacho(){
        return this.numDespacho;
    }

    @Override
    public String toString() {
        return "Despacho [numDespacho=" + numDespacho + "]";
    }

    
}
