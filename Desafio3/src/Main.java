import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int dig;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int N = sc.nextInt();
		System.out.println("Digite o valor target");
		int K = sc.nextInt();
		int[] arr = new int[N];
		
		for(int digito : arr) {
			arr[digito] = digito + 1;
		}
		
		if (K>=N || K<=-N) {
			dig = 0;
			System.out.println(dig);
		} else {
			if(K < 0 ) {
				dig = N + K;
				System.out.println(dig);
			} else {
				dig = N - K;
				System.out.println(dig);
			}
		}
		
       
	}

}
