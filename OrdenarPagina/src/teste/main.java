package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 1;
		//Ordenar las paginas insertadas en el STRING
		Integer n = null;
		List<Integer> lista = new ArrayList<>();
		StringTokenizer st = new StringTokenizer("1,3-5,10", ",-");
		int cantidad = st.countTokens();
		for (int i = 0; i < cantidad; i++) {
			lista.add(Integer.parseInt(st.nextToken()));
			if (i == 1)
				n = lista.get(i);
		}
		count = Integer.valueOf(n) + 1;
		lista.add(count);
		lista.sort((o1, o2) -> o1.compareTo(o2));
		String ordenado;
		for (Integer b : lista) {
			if (count2 == lista.size()) ordenado = b + "";
			else ordenado = b + ",";
			count2++;
			System.out.print(ordenado);
		}

	}
}
