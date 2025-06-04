import java.util.LinkedList;

public class Fila {
	public static void main(String[] args) {
		LinkedList<String> fila = new LinkedList<String>();
		fila.add("Núbia");
		fila.add("Miguel");
		fila.add("Stella");
		fila.add("Igor");
		fila.add("Diogo");
		fila.add("André");
		fila.add("Alexandre");
		int tam = fila.size();

		for (int i = 0; i < tam; i++) {
			System.out.println(fila.getFirst());
			fila.removeFirst();
		}
	}
}