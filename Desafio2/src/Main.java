import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int resultaint,resultdec,result100,result50,result20,result10,result5,result2,result1,result05,result025,result010,result005,result001;
		float n100,n50,n20,n10,n5,n2,m1,m50,m25,m10,m05,m01;
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor monetário");
		float monet = sc.nextFloat();
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(Locale.US);
		resultaint = (int)monet;
		resultdec = (int)Math.round((monet - (int)monet) *100 );
		System.out.println("Notas:");
		n100 = resultaint / 100;
		result100 = (int)n100;
		System.out.println(result100+"    "+"Notas"+"  "+"de"+"  "+"$ 100.00");
		resultaint = resultaint - (result100 * 100);
		n50 = resultaint / 50;
		result50 = (int)n50;
		System.out.println(result50+"Notas"+"de"+"$50.00");
		resultaint -= (result50 * 50);
		n20 = resultaint / 20;
		result20 = (int)n20;
		System.out.println(result20 + "Notas"+"de"+"$20.00");
		resultaint -=(result20 * 20);
		n10 = resultaint / 10;
		result10 = (int)n10;
		System.out.println(result10 + "Notas"+"de"+"$10.00");
		resultaint -= (result10 * 10);
		n5 = resultaint/5;
		result5 = (int)n5;
		System.out.println(result5 + "Notas"+"de"+"$5.00");
		resultaint -=(result5 * 5);
		n2 = resultaint / 2;
		result2 = (int)n2;
		System.out.println(result2 + "Notas"+"de"+"$2.00");
		resultaint -= (result2 * 2);
		System.out.println("Moedas:");
		m1 = resultaint/1;
		result1 = (int)m1;
		System.out.println(result1 + "Moedas"+"de"+"$1.00");
		resultaint = result1;
		m50 = resultdec / 50;
		result05 = (int)m50;
		System.out.println(result05+"Moedas"+"de"+"$0.50");
		resultdec = resultdec - (result05 * 50);
		m25 = resultdec / 25;
		result025 = (int)m25;
		System.out.println(result025+"Moedas"+"de"+"$0.25");
		resultdec -= (result025 * 25);
		m10 = resultdec/10;
		result010 = (int)m10;
		System.out.println(result010+"Moedas"+"de"+"$0.10");
		resultdec -= (result010 * 10);
		m05 = resultdec / 5;
		result005 = (int)m05;
		System.out.println(result005+"Moedas"+"de"+"$0.05");
		resultdec -= (result005 * 5);
		m01 = resultdec;
		result001 = (int)m01;
		System.out.println(result001+"Moedas"+"de"+"$0.01");
		resultdec -= result001;
		
		sc.close();

	}

}
