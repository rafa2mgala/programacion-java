package dam.temaseis.ejemplos.generica;

public class TestGenericoT {

	public static void main(String[] args) {
		int valor=0;
		EtiquetaProductoGenerico<CodigoC128> etiquetaC128
		=new EtiquetaProductoGenerico<CodigoC128>();
		
		CodigoC128[] etiquetasC128 = 
				new CodigoC128[10];
		for(int i=0;i<10;i++) {
			etiquetasC128[i] = new CodigoC128();
			etiquetasC128[i].setCodigo(String.valueOf(valor++));
		}
		etiquetaC128.imprimir(etiquetasC128);
		//
		EtiquetaProductoGenerico<CodigoEan> etiquetaEan
		=new EtiquetaProductoGenerico<CodigoEan>();
		
		CodigoEan[] etiquetasEan = 
				new CodigoEan[5];
		for(int i=0;i<5;i++) {
			etiquetasEan[i] = new CodigoEan();
			etiquetasEan[i].setCodigo(String.valueOf(valor++));
		}
		
		etiquetaEan.imprimir(etiquetasEan);
	}
}
