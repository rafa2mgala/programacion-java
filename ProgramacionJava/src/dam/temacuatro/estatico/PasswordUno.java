package dam.temacuatro.estatico;

import java.util.Random;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta para la actividad 4.5. En esta clase se satisfacen los
 * requisitos del enunciado y además se trabaja con constantes, constructores
 * especializados, y métodos propios para distintas finalidades. Esta clase se
 * encuentra en este paquete porque en la actividad 4.6 se pedirá una evolución 
 * de la misma en la que se utilizarán más miembros estáticos
 * @author Rafa
 * @version 1.0
 */
public class PasswordUno {
	public static final int SUBSTITUTION = 0;
	public static final int TRANSPOSITION = 1;
	private final String alphabet="aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
	private int length;
	private String password;
	private int type;
	public static void main(String[] args) {
		//se genera una contraseña automática ya que no se especifica ningua
		//PasswordUno pass = new PasswordUno(PasswordUno.SUBSTITUTION,10);
		//System.out.println(pass.getPassword());
	}
	/**
	 * Con este constructor permitimos crear contraseñas no vacías
	 * @param password Contraseña que se quiere cifrar y almacenar
	 * @param tipo Tipo de cifrado de la contraseña
	 */
	public PasswordUno(@NonNull String password, int tipo) {
		this.password = password;
		this.setType(tipo);
		if(password.length()==0)
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
	public PasswordUno(int tipo, int longitud) {
		this.setType(tipo);
		this.length = longitud<8?8:longitud;
		this.generatePassword();
	}
	public int getLongitud() {
		return length;
	}
	public String getPassword() {
		return password;
	}
	public int getTipo() {
		return type;
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
		char theChar;
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
			theChar=this.password.charAt(rndNumber);
			savedPass = this.password;
			this.password = this.password.substring(0,rndNumber) + 
					String.valueOf(theChar).toUpperCase() + 
					savedPass.substring(rndNumber+1);
		} 
		//si todos los caracteres de la contraseña están en mayúsculas se pone
		//al menos uno en minúsculas para cumplir con la fortaleza que en la próxima
		//actividad se pedirá
		if(this.getNumCaps()==this.password.length()) {
			theChar = this.password.charAt(rnd.nextInt(this.password.length()));
			this.password = this.password.replaceFirst(String.valueOf(theChar), 
					String.valueOf(theChar).toLowerCase());
		}
	}
	/**
	 * Obtiene el número de mayúsculas de la contraseña
	 * @return El número de caracteres en mayúsculas encontrados en la contraseña
	 */
	private int getNumCaps() {
		char charAtI;
		int numCaps = 0;
		for(int i=0;i<this.password.length();i++) {
			charAtI = this.password.charAt(i);
			numCaps += (String.valueOf(charAtI).toUpperCase().charAt(0)==charAtI)?1:0;
		}
		return numCaps;
	}
}
