package application;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {

	public static void main(String[] args) {
		
		int n = 6;
		List<String> asterisco = new ArrayList<>();
	 
		
		for (int i = 0; i < n; i++) {
			asterisco.add(" ".repeat(n - i - 1) + "*".repeat(i + 1));
		}

		for (String c : asterisco ) {
			System.out.println(c);
		}

	}

}
