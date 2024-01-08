package dam.temacuatro.modificadores;

public class Alumno extends Persona {
	private String nombre;
	private int edad;
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	public Alumno(String nombre, int edad) {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {		
		this.nombre = nombre;
	}
	public void setPreperties(Object ...objects) {
		if(objects.length==2) {
			if(objects[0] instanceof String) {
				this.nombre = objects[0].toString();
			}else if(objects[0] instanceof Integer) {
				this.edad = Integer.valueOf(objects[0].toString());
			}
			if(objects[1] instanceof String) {
				this.nombre = objects[1].toString();
			}else if(objects[1] instanceof Integer) {
				this.edad = Integer.valueOf(objects[1].toString());
			}
		}else if(objects.length==1) {
			if(objects[0] instanceof String) {
				this.nombre = objects[0].toString();
			}else if(objects[0] instanceof Integer) {
				this.edad = Integer.valueOf(objects[0].toString());
			}
		}
	}
}
