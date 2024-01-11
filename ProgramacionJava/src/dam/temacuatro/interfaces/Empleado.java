package dam.temacuatro.interfaces;
/**
 * Ejemplos de sobrecarga y escalada de constructores, paso de parámetros 
 * por valor y por referencia, objetos inmutables y bloques de inicialización
 * @author rafa
 * @version 1.0
 *
 */
public class Empleado implements Comparable{
	private String nif;
	private String departamento;
	private double salarioBase;
	//bloque de inicialización instanciable
	{
		this.departamento = "Ninguno";
	}
	public Empleado(String nif) {
		this.nif = nif;
	}
	/**
	 * Constructor especializado en inicializar objetos de la clase
	 * para la propiedad departamento
	 * @param departamento nombre del departamento del empleado
	 */
	public Empleado(String departamento, String nif){
		this(nif);
		this.setDepartamento(departamento);
	}
	/**
	 * Constructor especializado en inicializar objetos de la clase
	 * para la propiedad salarioBase
	 * @param departamento nombre del departamento del empleado
	 * @param salarioBase Salario del empleado
	 */
	public Empleado(String departamento, double salarioBase, String nif) {
		this(departamento,nif);
		this.salarioBase = salarioBase;
	}
	public String getDepartamento(){
		return departamento;
	}
	/**
	 * Modifica el valor de la propiedad departamento,
	 * todos los nombres de departamento se guardan en mayúsculas
	 * @param departamento Nombre del departamento del empleado
	 */
	public void setDepartamento(String departamento){
		this.departamento = departamento.toUpperCase();
	}
	public void setBase(double salariobase){
		this.salarioBase = salariobase;
	}
	public double getSalarioBase() {
		return this.salarioBase;
	}
	@Override
	public boolean equals(Object obj) {		
		return this.nif.equals(((Empleado)obj).nif);
	}	
	public String getNif() {
		return this.nif;
	}
	@Override
	public int compareTo(Object arg0) {
		if(arg0==null)
			throw new IllegalArgumentException("El parámetro no puede ser nulo");		
		
		if(!(arg0 instanceof Empleado))
			throw new IllegalArgumentException("El parámetro debe ser del tipo Empleado");
		
		if(((Empleado)arg0).nif==null)
			throw new IllegalArgumentException("El nif del empleado es nulo");		
		//Ojo! el orden está invertido
		return this.nif.compareTo(((Empleado)arg0).nif);
	}
}
