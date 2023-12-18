package dam.temacuatro.parametros;

public class Test {

	public static void main(String[] args) {
		Alumno alumno = new Alumno("12345678A");
		//Paso de parámetro por valor
		int edad = 20;
		//Paso por valor de un parámetro
		//La variable edad es de tipo primitivo
		//por lo que se pasa una copia de la variable
		//El método setEdad() de Alumno modifica 
		//la variable del parámetro, le pone el valor 16, 
		//pero al pasarse por valor la modificación 
		//se hace sobre la copia, no sobre la variable 
		//original
		alumno.setEdad(edad);
		//debe mostrar el valor 20
		System.out.println(edad);
		
		//Paso de parámetro por referencia
		Aula aula = new Aula("1º DAM");
		//paso por referencia de un parámetro
		//La variable aula es de tipo Aula
		//por lo que se pasa su dirección de memoria
		//El método setAula() de Alumno modifica el 
		//identificador del aula, como se pasa
		//por referencia, tras el método la variable
		//del parámetro quedará modificada
		alumno.setAula(aula);
		//Se mostrará como identificador del aula
		//2º DAM, valor asignado dentro del método
		//setAula()
		System.out.println(aula.getIdentificador());
	}

}
