package dam.temacuatro.relaciones;
/**
 * Pruebas de las relaciones entre Departamento y Profesor
 * Se añaden profesores con NIF duplicado al mismo departamento
 * y se elimina un profesor del mismo
 * @author rafa
 * @version 1.0
 */
public class TestDepartamento {
	public static void main(String[] args) {
		//array para recoger los profesores actuales de un departamento
		Profesor[] profesores;
		//las siguientes dos líneas asocian 
		Profesor profesor = new Profesor("12345678A");
		Departamento departamento = new Departamento("Informática",
				profesor);
		//no se puede añadir un profesor que ya existe en el departamento
		if(!departamento.addProfesor(profesor))
			System.out.println("No ha sido posible añadir al nuevo"
					+ " profesor/a al departamento");
		
		//se añade un nuevo profesor al departamento
		Profesor profesora = new Profesor("23444456B");
		if(departamento.addProfesor(profesora))
			System.out.println("Ha sido posible añadir al nuevo"
					+ " profesor/a al departamento");
		
		System.out.println("En el departamento de " +
				departamento.getNombre() + " hay " + 
				departamento.getNumProfesores()+ " profesores/as");
		
		//se obtienen y muestran los profesores del departamento
		//antes de eliminar uno
		profesores = departamento.getProfesores();
		for(int i=0;i<profesores.length;i++)
			System.out.println(profesores[i]);
		
		//se elimina el primer profesor del departamento
		//y se vuelven a mostrar los profesores/as del departamento
		if(departamento.delProfesor(profesor)) {
			profesora = null;
		}
		System.out.println("En el departamento de " +
				departamento.getNombre() + " hay " + 
				departamento.getNumProfesores()+ " profesores/as");
		for(int i=0;i<profesores.length;i++)
			System.out.println(profesores[i]);
		
		
		departamento = null;
		System.out.println();
	}
}
