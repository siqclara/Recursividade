import java.util.LinkedList;

public class Recusao {

	int resultado;
	int aux;
	int aux1;

	LinkedList<Character> lista = new LinkedList<Character>();

	public int conversor(String x) {
		
		String numero = x;

		if(aux < numero.length()) {
			lista.add(numero.charAt(aux));
			aux++;
			conversor(numero);
			
		}

		while(!lista.isEmpty()){
			
			int y = Character.getNumericValue(lista.removeLast());
			
			resultado += (int) (y * Math.pow(2, aux1));
			aux1 ++;
			
		}
	
		return resultado;
		
		
	}
}
