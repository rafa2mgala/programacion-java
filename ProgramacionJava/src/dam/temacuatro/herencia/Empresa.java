package dam.temacuatro.herencia;

public class Empresa {
	private Empleado empleados[];
	private int siguienteEmpleado;
	{
		this.empleados = new Empleado[100];
		this.siguienteEmpleado = 0;
	}
	public static void main(String[] args) {

	}
	public Empresa(Empleado empleado) {
		this.empleados[0] = empleado;
		this.siguienteEmpleado++;
	}
	/**
	 * Añade un nuevo objeto Empleado al final del array
	 * @param empleado Objeto de Empleado que se va a añadir
	 * @return Devuelve -1 en caso de que no se pueda añadir
	 * el objeto, y en caso contrario el número de objetos Empleado en 
	 * el array
	 */
	public int addEmpleado(Empleado empleado) {
		if(this.siguienteEmpleado==this.empleados.length) return -1;
		this.empleados[this.siguienteEmpleado] = empleado;
		return ++this.siguienteEmpleado;
	}
	/**
	 * Inserta un objeto empleado en el array de empleados
	 * @param index Posición de la inserción
	 * @param empleado Empleado que se va a insertar en el array
	 * @return Devuelve -1 si no se puede insertar en el array
	 * , y en caso contrario el número de empleados en el array
	 */
	public int insertEmpleado(int index, Empleado empleado) {
		//se comprueba si el array de empleados está lleno, en dicho
		//caso no se pueden añadir más empleados
		if(this.siguienteEmpleado==this.empleados.length) return -1;
		//se comprueba la validez de los parámetros
		if(index<0 || index >= this.empleados.length || empleado==null) return -1;
		//se inserta el nuevo empleado, no se verifican duplicados
		for(int i=this.empleados.length-1; i>index;i--) {
			this.empleados[i] = this.empleados[i-1];
		}
		this.empleados[index] = empleado;
		return ++this.siguienteEmpleado;
	}
	/**
	 * Elimina un objeto Empleado del array buscando por nif del mismo
	 * @param nif Es el NIF del empleado a eliminar
	 * @return Devuelve true en caso de que se haya podido eliminar el objeto
	 * empleado del array, en otro caso false
	 */
	public boolean delEmpleado(String nif) {
		boolean borrado = false;
		boolean encontrado = false;
		int i=0;
		int posEmpleado = 0;
		while(!encontrado &&  i<this.empleados.length) {
			if(this.empleados[i]!=null && this.empleados[i].getNif().equals(nif)) {
				encontrado=true;
				posEmpleado=i;
			}
			i++;
		}
		//borrado si lo ha encontrado
		if(encontrado) {
			for(int j=posEmpleado;j<this.empleados.length-1;j++) {
				this.empleados[j] = this.empleados[j+1];
			}
			this.empleados[this.empleados.length-1] = null;
			borrado = true;
			//se actualiza la posición del siguiente empleado
			i=0;
			while(i<this.empleados.length && this.empleados[i++]!=null);
			this.siguienteEmpleado = i;
		}		
		return borrado;
	}	
}
