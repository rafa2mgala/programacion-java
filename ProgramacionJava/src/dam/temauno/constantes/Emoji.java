package dam.temauno.constantes;
/**
 * Ejemplo de constantes relacionadas con estados de Emojis
 * @author rafa
 * @version 1.0
 */
public class Emoji {
	public static void main(String[] args) {
		//constantes para estados de Emojis
		final int CANSADO=0;
		final int TRISTE=1;
		final int FELIZ=2;
		final int DORMIDO=3;
		final int PENSANDO=4;
				
		//variable para almacenar el estado
		int estado = CANSADO;
				
		String estadoEmoji = estado==TRISTE?"Triste":estado==CANSADO?"Cansado":"Otro";
		
		//estado cansado
		System.out.println(estado);
		estado = CANSADO + TRISTE;
		estadoEmoji = estado==CANSADO+TRISTE?"Cansado y Triste":estado==CANSADO?"Cansado":"Otro";
		
		//estado cansado y triste
		System.out.println(estado);		
	}
}
