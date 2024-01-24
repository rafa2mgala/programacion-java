package dam.temasiete.actividad.siete.seis;

/**
 * Clase vendedor deriva de empleado
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public class Vendedor extends Empleado{
    private String areaVenta;
    private Coche coche;
    private Despacho despacho;
    private Cliente[] clientes = new Cliente[10];
    private int indiceCliente;
    private int comision;

    /**
     * Constructor especifico para poder hacer un vendedor requiere los mismos parametros
     * que Empleado
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param dni
     * @param telefono
     * @param salario
     * @param areaVenta El area donde vende
     * @param coche El coche que tiene
     * @param despacho El despacho que tiene
     * @param comision La comision que se lleva
     */
    public Vendedor(String nombre, String apellidos, String direccion, String dni, int telefono, double salario,
            String areaVenta, Coche coche, Despacho despacho, int comision,
            Supervisable supervisor) {
        super(nombre, apellidos, direccion, dni, telefono, salario,supervisor);
        this.areaVenta = areaVenta;
        this.coche = coche;
        this.despacho = despacho;
        this.comision = comision;
        super.incrementarSalario(10);
    }

    /**
     * Metodo implementado que imprime informacion sobre el vendedor
     * @return El texto con la informacion
     */
    @Override
    public String imprimir() {
        return super.toString()+"\nTipo empleado: Vendedor"+"\nCoche: "+this.coche.toString()+
        "Despacho: "+this.despacho.toString();
    }

    /**
     * Metodo propio para dar de alta a un cliente
     * @param cliente El cliente a dar de alta
     */
    public void darAlta(Cliente cliente){
        if(this.indiceCliente < 10){
            this.clientes[this.indiceCliente] = cliente;
            this.indiceCliente++;
        }
    }
    /**
     * Metodo para dar de baja a un cliente
     * @param cliente El cliente a dar de baja
     */
    public void darBaja(Cliente cliente){
        for(int i = 0; i < this.clientes.length; i++){
            if(this.clientes[i] != null && this.clientes[i].equals(cliente)){
                this.clientes[i] = null;
                this.indiceCliente--;
            }
        }
    }
    /**
     * Metodo para cambiar de coche
     * @param coche Cambia el coche
     */
    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }
}
