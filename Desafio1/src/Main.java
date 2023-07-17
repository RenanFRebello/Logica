import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de linhas");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
		
			System.out.println("Digite um valor inteiro qualquer");
			int num = sc.nextInt();
			if(num % 2 == 0) {
				pares.add(num);
			} else {
				impares.add(num);
			}
		}
		
		System.out.println(n);
		
		Collections.sort(pares);
		for(int numero : pares) {
			System.out.println(numero);
		}
		Collections.sort(impares,Collections.reverseOrder());
		for(int numbers : impares) {
			System.out.println(numbers);
		}
		
		
		sc.close();
		
	}

}
