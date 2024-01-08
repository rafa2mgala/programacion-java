package dam.temacuatro.estatico;

import java.util.Random;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta para la actividad 4.6. En esta clase se satisfacen los
 * requisitos del enunciado y además se trabaja con constantes, constructores
 * especializados, y métodos propios para distintas finalidades. Se incluyen
 * como estáticos el método que genera la contraseña y el que comprueba la
 * fortaleza de la misma.
 * 
 * @author Rafa
 * @version 1.1
 * @since 1.0
 */
public class PasswordDos {
	public static final int SUBSTITUTION = 0;
	public static final int TRANSPOSITION = 1;
	private final String alphabet="aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
	private int length;
	private static int minLength = 8;
	private String password;
	private int type;
	
	public static void main(String[] args) {
		//generación de una contraseña de manera automática
		//PasswordDos pass = new PasswordDos(PasswordUno.SUBSTITUTION,10);
		//System.out.println(pass.getPassword());
		//Prueba de fortaleza sin crear un objeto de la clase
		//System.out.print(PasswordDos.isStrong("AAAAAAAA"));
	}
	/**
	 * Con este constructor permitimos crear contraseñas no vacías
	 * @param password Contraseña que se quiere cifrar y almacenar
	 * @param tipo Tipo de cifrado de la contraseña
	 */
	public PasswordDos(@NonNull String password, int tipo) {
		this.password = password;
		this.setType(tipo);
		if(password.length()==0 || !PasswordDos.isStrong(password))
			this.generatePassword();
		this.length = password.length();
	}
	/**
	 * Este constructor permite crear contraseñas automáticamente
	 * indicando el tipo de cifrado y la longitud de la misma
	 * No pide la contraseña porque se supone que no hace falta ya que
	 * se va a generar automáticamente.
	 * @param tipo Tipo de cifrado de la contraseña
	 * @param longitud Longitud mínima de la contraseña
	 */
	public PasswordDos(int tipo, int longitud) {
		this.setType(tipo);
		this.length = longitud<8?8:longitud;
		this.generatePassword();
	}
	/**
	 * Permite modificar el tipo de cifrado garantizando que si el tipo
	 * indicado como parámetro no es correcto, el cifrado será siempre
	 * por SUSTITUCION
	 * @param type Tipo de cifrado, puede ser por SUSTITUTCION o por
	 * TRANSPOSICION
	 */
	private void setType(int type) {
		this.type = (type<PasswordUno.SUBSTITUTION || type>PasswordUno.TRANSPOSITION)?
				PasswordUno.SUBSTITUTION:type;
	}
	/**
	 * Genera una clave automática cumpliendo con los requisitos de fortaleza
	 * exigidos
	 */
	private void generatePassword() {
		//para generar números aleatorios
		Random rnd = new Random();
		//donde se almacenan números enteros aleatorios
		int rndNumber =0;
		//donde se guarda el carácter a convertir en mayúsculas
		char upChar;
		//donde se guarda la clave original para no perderla
		String savedPass;
		this.password = "";
		//se generan 8 números aleatorios comprendidos entre 0 y la longitud
		//del alfabeto menos 1
		for(int i=0;i<this.length;i++) {
			rndNumber= rnd.nextInt(alphabet.length());
			this.password += alphabet.charAt(rndNumber);
		}
		//después se generan otras dos posiciones aleatorias entre 0 y 8 
		//para poner en mayúsculas 2 caracteres. No merece la pena poner
		//un if dentro del for para controlar si el carácter que se va a poner
		//en mayúsculas está ya en mayúsculas
		for(int i=0;i<2;i++) {
			rndNumber= rnd.nextInt(this.length-1)+1;
			upChar=this.password.charAt(rndNumber);
			savedPass = this.password;
			this.password = this.password.substring(0,rndNumber) + 
					String.valueOf(upChar).toUpperCase() + 
					savedPass.substring(rndNumber+1);

		}
	}
	/**
	 * Permite comprobar la fortaleza de una contraseña sin necesidad de crear
	 * un objeto de la clase. 
	 * @param password Contraseña sobre la que se comprobará la fortaleza
	 * @return Devolverá true en caso de que la contraseña sea fuerte. Una contraseña
	 * es fuerte si tiene longitud mayor o igual a la mínima, al menos 2 caracteres
	 * en mayúsculas y no todos los caracteres en mayúsculas
	 */
	public static boolean isStrong(String password) {
		int numCaps=0;
		//si la contraseña tiene una longitud menor al mínimo permitido
		//no es fuerte
		if(password.length()<PasswordDos.minLength) return false;
		//si la contraseña no contiene 2 caracteres en mayúsculas
		//no es fuerte
		numCaps = getNumCaps(password);
		//si hay menos de mayúsculas la contraseña no es fuerte
		if(numCaps<2) return false;
		//si todos los caracteres son mayúsculas la contraseña no es fuerte
		if(numCaps==password.length()) return false;
		return true;
	}
	/**
	 * Obtiene el número de mayúsculas de la contraseña
	 * @return El número de caracteres en mayúsculas encontrados en la contraseña
	 */
	private static int getNumCaps(String password) {
		char charAtI;
		int numCaps = 0;
		for(int i=0;i<password.length();i++) {
			charAtI = password.charAt(i);
			numCaps += (String.valueOf(charAtI).toUpperCase().charAt(0)==charAtI)?1:0;
		}
		return numCaps;
	}
	public int getLength() {
		return length;
	}
	public String getPassword() {
		return password;
	}
	public int getType() {
		return type;
	}
}
