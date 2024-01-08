package dam.temacuatro.relaciones;

import org.eclipse.jdt.annotation.NonNull;

public class Departamento {
	private Secretaria secretaria;
	//número de profesores en el departamento
	private int numProfesores=0;
	//nombre del departamento
	private String nombre="";
	//profesores en el departamento
	private Profesor[] profesores = new Profesor[5];
	/**
	 * Constructor especializado en inicializar un objeto de la clase
	 * Departamento asociándole un profesor y el nombre del mismo, 
	 * el objeto de la clase
	 * Profesor pasado como parámetro no puede ser nulo.
	 * @param profesor Primer profesor asociado con el departamento
	 * @param nombre Nombre del departamento
	 */
	public Departamento(@NonNull String nombre,
			@NonNull Profesor profesor) {
		//se asigna el nombre al departamento
		this.nombre=nombre;
		//se asigna el departamento al profesor
		profesor.setDepartamento(this);
		//se asigna el nuevo profesor al departamento
		profesores[numProfesores++]=profesor;
	}
	/**
	 * Añade un nuevo profesor al departamento, si el número
	 * de profesores ha llegado al límite del departamento
	 * no añade y devuelve false. Si el profesor ya está en el
	 * departamento tampoco añade y devuelve false. En caso contrario
	 * se añade el profesor al departamento y devuelve true
	 * @param profesor
	 * @return true si se consigue añadir el profesor al departamento
	 * , false en caso contrario
	 */
	public boolean addProfesor(@NonNull Profesor profesor) {
		int i=0;
		boolean encontrado=false;
		if(this.numProfesores==4)
			return false;
		
		while(i<profesores.length && profesores[i]!=null && !encontrado) {
			encontrado = profesores[i].getNif().equals(profesor.getNif());
			i++;
		}
		if(encontrado) return false;
		profesor.setDepartamento(this);
		profesores[numProfesores++]=profesor;
		return true;
	}
	/**
	 * Obteniene la posición de un profesor en el array de profesores
	 * del departamento
	 * @param nif NIF del profesor del que se quiere conocer su posición
	 * en el array
	 * @return Entero con la posición del profesor indicado en el array
	 */
	public int getProfesorIndex(@NonNull String nif) {
		int i=0;
		boolean encontrado=false;
		while(i<this.profesores.length && !encontrado
				&& this.profesores[i]!=null) {
			encontrado=this.profesores[i].getNif().equals(nif);
			i++;
		}
		return i;
	}
	/**
	 * Elimina el profesor/a indicado por su NIF en caso de que exista
	 * @param nif NIF del profesor/a a eliminar
	 * @return true si lo elimina, false en caso contrario
	 */
	public boolean delProfesor(@NonNull String nif) {
		int i=this.getProfesorIndex(nif);
		if(i==0 || i==profesores.length) return false;
		
		if(i<profesores.length) {
			i--;
			while(i<this.profesores.length-1
					&& profesores[i]!=null) {
				profesores[i]=profesores[i+1];
				i++;
			}
			profesores[i]=null;
			this.numProfesores--;
			return true;
		}
		return false;
	}
	/**
	 * Elimina el profesor del departamento indicado
	 * @param profesor Profesor a eliminar del departamento
	 * @return true si consigue eliminar, false en caso contrario
	 */
	public boolean delProfesor(@NonNull Profesor profesor) {
		return this.delProfesor(profesor.getNif());
	}
	public boolean delProfesores() {
		if(this.numProfesores==1) return true;
		for(int i=1;i<this.profesores.length;i++)
			this.profesores[i]=null;
		return false;
	}
	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	@Override
	public String toString() {
		return "Departamento [numProfesores=" + 
				numProfesores + ", nombre=" + nombre + "]";
	}
	public Profesor[] getProfesores() {
		return this.profesores;
	}
	public int getNumProfesores() {
		return this.numProfesores;
	}
	public String getNombre() {return this.nombre;}
}
