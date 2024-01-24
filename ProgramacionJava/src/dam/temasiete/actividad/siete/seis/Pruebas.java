package dam.temasiete.actividad.siete.seis;

/**
 * Ejemplo de polimorfismo, se realiza sobre la clase Empleado
 * y derivadas. El método polimórfico es imprimir()
 */
public class Pruebas {
    public static void main(String[] args) {
    	Empleado[] empleados = new Empleado[5];
    	
        Despacho d1 = new Despacho(1);
        //todos los empleados tienen el mismo supervisor
        Supervisor supervisor = new Supervisor("ElJefe", "Supremo", 
			"C/Noname, s/n", "12345678J", 654321789, 
			2345);
        empleados[0] = supervisor;
        System.out.println(empleados[0].imprimir());
        
        
        Coche c1 = new Coche("a", "b", "c");
        Vendedor v1 = new Vendedor("Pedro", "Paco", "aa", 
        		"a", 1234, 123, "areaVenta", c1, d1, 1, supervisor);
        empleados[1] = v1;
        
        Cliente cl1 = new Cliente("23");

        v1.darAlta(cl1);

        System.out.println(empleados[1].imprimir()+"\n\n");

        Despacho d2 = new Despacho(2);
        Secretario s1 = new Secretario("Paco", "Oh no!", "A", 
        		"B", 1234, 100, d2, 123, supervisor);
        empleados[2] = s1;
        
        System.out.println(empleados[2].imprimir()+"\n\n");

        Coche c2 = new Coche("Ferraria", "123c", "Un modelo");
        Despacho d3 = new Despacho(3);
        JefeZona jefe1 = new JefeZona("Manuel", "Alguien", "si", 
        		"no", 1000, 10000, d3, s1, c2, supervisor);
        empleados[3] = jefe1;
        
        jefe1.darAltaVendedor(v1);

        System.out.println(empleados[3].imprimir());
    }
}
