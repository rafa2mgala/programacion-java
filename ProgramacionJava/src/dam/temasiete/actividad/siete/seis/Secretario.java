package dam.temasiete.actividad.siete.seis;
/**
 * Clase Secretario, deriva de empleado
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public class Secretario extends Empleado{
    private Despacho despacho;
    private int numFax;
    /**
     * Constructor especifico para Secretario, requiere los mismos parametros 
     * que Empleado y los suyos propios
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param dni
     * @param telefono
     * @param salario
     * @param despacho El despacho que poseera
     * @param numFax El numero del fax
     */
    public Secretario(String nombre, String apellidos, String direccion, 
    		String dni, int telefono, double salario, Despacho despacho, 
    		int numFax, Supervisable supervisor) {
        super(nombre, apellidos, direccion, dni, telefono, salario, supervisor);
        this.despacho = despacho;
        this.numFax = numFax;
        super.incrementarSalario(5);
    }

    /**
     * Metodo implementado imprimir, imprime informacion especifica del empleado
     * 
     * @return El texto con la informacion
     */
    @Override
    public String imprimir() {
        return super.toString()+"Tipo empleado: Secretario";
    }

    /**
     * @return the despacho
     */
    public Despacho getDespacho() {
        return despacho;
    }

    /**
     * @param despacho the despacho to set
     */
    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    /**
     * @return the numFax
     */
    public int getNumFax() {
        return numFax;
    }

    /**
     * @param numFax the numFax to set
     */
    public void setNumFax(int numFax) {
        this.numFax = numFax;
    }
    
}
