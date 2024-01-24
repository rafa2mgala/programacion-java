package dam.temasiete.herencia;

public class TestEquals {

	public static void main(String[] args) {
		Integer i1 = 2;
		Integer i2 = 2;
		
		System.out.println(i1==i2);
		
		
 		Empleado emp = new Empleado("Marta",22,"12345678A",1);
		Empleado dir = new Director("Pepe",22,"12345678A",1);
		Empleado dirAdjunto = new DirectorAdjunto("Paco",22,"12345678A",1);
		
		
		emp.setSueldo(100000000);
		
		Empleado[] empleados = new Empleado[3];
		empleados[0] = emp;
		empleados[1] = dir;
		empleados[2] = dirAdjunto;
		
		
		for(int i=0;i<empleados.length;i++)
			System.out.println(empleados[i].miMetodo());
				
	}

}

