package dam.temasiete.actividad.siete.seis;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase Empleado, con esta clase tendremos a todos los empleados
 * identificados y otras clases derivaran de esta misma
 * 
 * @author Daniel caparros duran
 * @version 1.0
 * @since 1.0
 */
public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private int antiguedad;
    private int telefono;
    private double salario;
    private Supervisor supervisor;

    /**
     * Constructor especifico para poder hacer un empleado no supervisor
     * 
     * @param nombre Su nombre
     * @param apellidos Su apellidos
     * @param direccion Su direccion
     * @param dni Su DNI
     * @param telefono Su telefono
     * @param salario Su salario
     */
    public Empleado(String nombre, String apellidos, 
    		String direccion, String dni, int telefono, 
    		double salario, @NonNull Supervisable supervisor) {
    	this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null;
        this.supervisor = (Supervisor)supervisor;
    }
    
    public abstract String imprimir();
    /**
     * Metodo encargado de añadir un supervisor 
     * 
     * @param supervisor El supervisor
     */
    public void cambiarSupervisor(Supervisable supervisor){
        this.supervisor = (Supervisor) supervisor;
    }
    /**
     * Metodo para incrementar el salario, incrementa el salario en cuestion a un porcentaje
     * @param porcentaje El porcentaje a incrementar
     */
    public void incrementarSalario(int porcentaje){
        this.salario += (this.salario)*(float)(porcentaje/100F);
    }

    /**
     * Metodo equals sobreescrito, este equals esta especializado
     * en la comparacion de objetos del tipo empleado
     * @param Object El objeto a comparar
     * @return Si es igual o no
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(!(obj instanceof Empleado)) return false;

        Empleado empleadoEntrante = (Empleado)obj;
        if(empleadoEntrante.dni.equals(this.dni) && empleadoEntrante.nombre.equals(this.nombre)){
            return true;
        }

        return false;
    }

    /**
     * toString() especifico
     */
    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\nApellidos: "+this.apellidos+
            "\nDireccion: "+this.direccion+"\nDNI: "+this.dni+
            "\nTelefono: "+this.telefono+"\nAntiguedad: "+this.antiguedad+
            "\nSalario: "+this.salario;
    }

    //getters y setters
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    //Getters y setters
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the supervisor
     */
    public Empleado getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Supervisable supervisor) {
        this.supervisor = (Supervisor) supervisor;
    }


    

    
}
