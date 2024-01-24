package dam.temasiete.actividad.siete.seis;
/**
 * Clase cliente, con esta clase lo que podremos hacer será identificar a los clientes
 * en nuestro progama
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public class Cliente {
    private String dni;

    /**
     * Constructor especifico para hacer clientes, se requiere del DNI
     * @param dni El DNI
     */
    public Cliente(String dni) {
        this.dni = dni;
    }

    /**
     * Metodo sobrescrito equals, este equals se encarga de comparar dos objetos 
     * del tipo cliente y dará un resultado booleano
     * 
     * @param Object Un objeto del tipo cliente
     * @return Si es o no iguales
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(!(obj instanceof Cliente)) return false;

        Cliente clienteEntrada = (Cliente)obj;
        if(clienteEntrada.dni.equals(this.dni)) return true;

        return false;
    }
}
