package projectEclipse;
import java.util.Locale;
import java.util.Scanner;

public class imc {


		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Diga o seu peso: ");
			double peso = sc.nextDouble();
			System.out.print("Diga a sua altura: ");
			double altura = sc.nextDouble();
			
			double imc = peso / (altura * altura);
			
			if (imc < 18.5) {
				System.out.println("Magreza");
			}
			else if (imc < 25) {
				System.out.println("Normal");
			}
			else if (imc < 30) {
				System.out.println("Sobrepeso");
			}
			else if (imc < 39.9) {
				System.out.println("Obesidade");
			}
			else {
				System.out.println("Obesidade Grave");
			}
			sc.close();
		}

	}
