package dam.temasiete.actividad.siete.seis;

/**
 * Clase derivada de Empleado, con esta clase podemos tener en cuenta a los
 * jefes de zona
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public class JefeZona extends Empleado{
    private Despacho despacho;
    private Secretario secretario;
    private Vendedor[] vendedores = new Vendedor[10];
    private int indiceVendedor;
    private Coche coche;

    /**
     * 
     * Constructor especifico de JefeZona, se requiere tanto los parametros de la
     * clase base como los suyos propios 
     *
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param dni
     * @param telefono
     * @param salario
     * @param despacho El despacho que va a tener
     * @param secretario El secretario que tiene
     * @param coche El coche que tiene
     */
    public JefeZona(String nombre, String apellidos, String direccion, 
    		String dni, int telefono, double salario,
            Despacho despacho, Secretario secretario, Coche coche
            ,Supervisable supervisor) {
        super(nombre, apellidos, direccion, dni, telefono, salario, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
        super.incrementarSalario(20);
    }

    /**
     * Metodo implementado imprimir(), con este metodo podremos imprimir informacion
     * basica del JefeZona
     * 
     * @return El texto con la informacion
     */
    @Override
    public String imprimir() {
        return super.toString()+"\nTipo empleado: Jefe de zona"+"\nCoche: "+coche.toString()+
        "\nSecretario: \n\n"+this.secretario.imprimir()+"\n\nDespacho: "+this.despacho.toString();
    }

    /**
     * Metodo propio, se encarga de cambiar el secretario
     * @param secretario El nuevo secretario
     */
    public void cambiarSecretario(Secretario secretario){
        this.secretario = secretario;
    }
    /**
     * Metodo propio, permite cambiar el coche
     * @param coche El nuevo coche
     */
    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    /**
     * Metodo especifico para dar de alta a un vendedor
     * @param vendedor El vendedor a dar de alta
     */
    public void darAltaVendedor(Vendedor vendedor){
        if(this.indiceVendedor < this.vendedores.length-1){
            this.vendedores[this.indiceVendedor] = vendedor;
            this.indiceVendedor++;
        }
    }
    /**
     * Metodo especifico para dar de baja un vendedor
     * @param vendedor El vendedor a dar de baja
     */
    public void darBajaVendedor(Vendedor vendedor){
        for(int i = 0; i < this.vendedores.length-1; i++){
            if(this.vendedores[i] != null && this.vendedores[i].equals(vendedor)){
                this.vendedores[i] = null;
                this.indiceVendedor--;
            }
        }
    }
}
