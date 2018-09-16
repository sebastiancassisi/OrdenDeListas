package ordenamientodelistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(25);
		lista.add(1000);
		lista.add(1);
		
		
		Collections.sort(lista);
		Collections.reverse(lista);
		
		
		System.out.println(lista);
	}

}
