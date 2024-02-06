package dam.temaseis.actividad.seis.tres;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.3
 * @author Rafa
 * @version 1.0
 */
public class GestionEmpleados {
	private final int BUSCAR=1;
	private final int MODIFICAR=2;
	private final int ELIMINAR=3;
	private final int NUEVO=4;
	private final int ORDENAR = 5;
	private final int SALIR=6;
	private final int ORDEN_NIF=1;
	private final int ORDEN_NOMBRE=2;
	private final int ORDEN_EDAD=3;
	private final int ORDEN_FECHA_ALTA=4;
	private final int ORDEN_TELEFONO=5;
	private Scanner sc;
	private ArrayList<Empleado> empleados;
	public static void main(String[] args) {
		GestionEmpleados ge = new GestionEmpleados();
		ge.sc = new Scanner(System.in);
		ge.empleados = new ArrayList<Empleado>();
		ge.menuPrincipal();
		ge.sc.close();
	}
	public void menuPrincipal() {
		int opcion = 0;
		Empleado empleado=null;
		while(opcion!=SALIR) {
			System.out.println("\nGestión de empleados");
			System.out.println("---------------------------------------");
			System.out.println("Seleccione una opcion:");
			System.out.println("1. BUSCAR");
			System.out.println("2. MODIFICAR");
			System.out.println("3. ELIMINAR");
			System.out.println("4. NUEVO");
			System.out.println("5. ORDENAR");
			System.out.println("6. SALIR");
			opcion = Integer.valueOf(this.sc.nextLine());
			switch(opcion) {
			case BUSCAR:
				empleado = this.buscarEmpleado(this.menuBuscarEmpleado());
				if(empleado==null)
					System.out.println("No existe el empleado buscado");
				else
					System.out.println(empleado);
				break;
			case MODIFICAR:
				empleado = this.buscarEmpleado(this.menuBuscarEmpleado());
				if(empleado!=null)
					this.modificarEmpleado(this.menuModificarEmpleado(empleado));
				else
					System.out.println("No existe el empleado buscado");
				break;
			case ELIMINAR:
				if(!this.eliminarEmpleado(this.menuBuscarEmpleado()))
					System.out.println("No existe el empleado buscado");
				break;
			case NUEVO:
				empleado = this.menuNuevoEmpleado();
				if(empleado == null) {
					System.out.println("Datos de empleado incorrecto, pulse 0 para continuar");
					this.sc.next();
				}else {
					this.nuevoEmpleado(empleado);
				}
				break;
			case ORDENAR:
				this.ordenar(this.menuOrdenar(), ComparadorEmpleado.DESC);
				this.mostrarEmpleados();
				break;
			case SALIR:
				System.out.println("Gracias por usar la apliación!, pulse 0 para salir");
				this.sc.nextLine();
				break;
			default:
				System.out.println("Opción incorrecta, pulse 0 para continuar");
				this.sc.nextLine();
				break;
			}
		}
	}
	private String menuBuscarEmpleado() {
		this.sc.reset();
		String nif="";
		do {
			System.out.print("\nIntroduzca el NIF del empleado a buscar:");
			nif = this.sc.nextLine();
		}while(nif.isEmpty());
		return nif;
	}
	private Empleado menuNuevoEmpleado() {
		Empleado empleado=null;
		String nombre, nif, fecha;
		int edad;
		LocalDate fechaAlta=null;
		DateTimeFormatter formatoFecha;
		long telefono;
		this.sc.reset();
		System.out.println("\nIntroduzca los datos del nuevo empleado");
		System.out.print("Nombre:");
		nombre = this.sc.nextLine();
		System.out.print("\nNIF:");
		nif = this.sc.nextLine();
		System.out.print("\nEdad:");
		edad = Integer.valueOf(this.sc.nextLine());
		System.out.print("\nTeléfono:");
		telefono = Long.valueOf(this.sc.nextLine());
		System.out.print("Fecha alta (dd-MM-aaaa):");
		fecha = this.sc.nextLine();
		formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			fechaAlta = LocalDate.from(formatoFecha.parse(fecha));
		}catch(DateTimeParseException e) {
			return empleado;
		}
		
		empleado = new Empleado(nombre, nif,edad,telefono, fechaAlta);
		return empleado;
	}
	private int menuOrdenar() {
		int orden = 0;
		this.sc.reset();
		do {
			System.out.println("\nSeleccione el campo de ordenación:");
			System.out.println("1. NIF");
			System.out.println("2. Nombre");
			System.out.println("3. Edad");
			System.out.println("4. Fecha de alta");
			System.out.println("5. Teléfono");
			orden = Integer.valueOf(this.sc.nextLine());
			switch(orden) {
			case ORDEN_NIF:
				return ComparadorEmpleado.NIF;
			case ORDEN_NOMBRE:
				return ComparadorEmpleado.NOMBRE;
			case ORDEN_EDAD:
				return ComparadorEmpleado.EDAD;
			case ORDEN_FECHA_ALTA:
				return ComparadorEmpleado.FECHA_ALTA;
			case ORDEN_TELEFONO:
				return ComparadorEmpleado.TELEFONO;
			default:
				System.out.println("Opción incorrecta, pulse 0 para continuar");
				this.sc.nextLine();
				break;
			}
		}while(orden==0);
		return orden;
	}
	private Empleado menuMostrarEmpleado(String nif) {
		Empleado empleado = this.buscarEmpleado(nif);
		this.sc.reset();
		if(empleado!=null) {
			System.out.println("\nNombre: " + empleado.getNombre());
			System.out.println("NIF: " + empleado.getNif());
			System.out.println("Edad: " + empleado.getEdad());
			System.out.println("Teléfono: " + empleado.getTelefono());
			System.out.println("Fecha de alta: " + empleado.getFechaAlta());
			System.out.println("Pulse 0 para continuar");
			this.sc.next();
		}
		return empleado;
	}
	private Empleado menuModificarEmpleado(Empleado empleado) {
		String dato,nombre;
		long telefono;
		int edad;
		DateTimeFormatter formato;
		LocalDate fechaAlta;
		this.sc.reset();
		if(empleado!=null) {
			System.out.println("\nSi no quiere modificar un campo pulse INTRO");
			System.out.println("Nombre (" + empleado.getNombre() + "):");
			dato = sc.nextLine();
			nombre = dato.isEmpty()?empleado.getNombre():dato;
			System.out.println("Edad (" + empleado.getEdad()+ "):");
			dato = sc.nextLine();
			edad = dato.isEmpty()?empleado.getEdad():Integer.valueOf(dato);
			System.out.println("Teléfono (" + empleado.getTelefono() +"):");
			dato = sc.nextLine();
			telefono = dato.isEmpty()?empleado.getTelefono():Long.valueOf(dato);
			System.out.println("Fecha de alta (" + empleado.getFechaAlta() + "):");
			dato = sc.nextLine();
			try {
				formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				fechaAlta = LocalDate.from(formato.parse(dato));
			}catch(DateTimeParseException e) {
				fechaAlta = empleado.getFechaAlta();
			}
			empleado = new Empleado(nombre,empleado.getNif(),edad,telefono,fechaAlta);
			System.out.println("Pulse 0 para continuar");
			this.sc.next();
		}
		return empleado;
	}
	public Empleado buscarEmpleado(@NonNull String nif) {
		boolean encontrado = false;
		int i=0;
		while(!encontrado && i<this.empleados.size()) {
			if(this.empleados.get(i).getNif().equals(nif))
				encontrado = true;
			i++;
		}
		if(encontrado)
			return this.empleados.get(i-1);
		return null;
	}
	public Empleado modificarEmpleado(@NonNull Empleado empleado) {
		return this.empleados.set(this.empleados.indexOf(empleado), empleado);
	}
	public boolean eliminarEmpleado(@NonNull String nif) {
		Empleado empleado = this.buscarEmpleado(nif);
		if(empleado == null) return false;
		return this.empleados.remove(empleado);
	}
	public boolean nuevoEmpleado(Empleado empleado) {
		return this.empleados.add(empleado);
	}
	public ArrayList<Empleado> ordenar(int campoComparacion, int ascDesc){
		ComparadorEmpleado comparador = 
				new ComparadorEmpleado(campoComparacion,ascDesc);
		this.empleados.sort(comparador);
		return this.empleados;
	}
	public void mostrarEmpleados() {
		System.out.println("Empleados en la empresa");
		System.out.println("---------------------------------------");
		for(Empleado empleado:this.empleados) {
			System.out.println(empleado);
		}
	}
}
