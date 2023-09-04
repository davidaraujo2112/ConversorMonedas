import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EXTERNA:
		while(true) {
			System.out.println("CONVERSOR DE MONEDAS ALURA");
			System.out.println("1 - Soles Peruanos a Dolares \n"
					+ "2 - Pesos Mexicanos a Dolaes \n "
					+ "3 - pesos Colombianos a Dolares \n" 
					+ "4 - Salir");
			
			System.out.print("INGRESE UNA OPCION");
			Scanner leer = new Scanner(System.in);
			char opcion = leer.next().charAt(0);
			
			switch(opcion) {
				case '1' :
					convertir(3.58, "Soles Peruanos");
					break;
				case '2':
					convertir(22.15, "Pesos Mexicanos");
					break;
				case '3':
					convertir(3851.90, "Pesos Colombianos");
					break;
				case '4':
					System.out.println("CERRANDO PROGRAMA DE CONVERSION DE MONEDAS");
					break EXTERNA;
					default:
					System.out.println("OPCION INCORRECTA");
					break;
						
					
					
			}
		} 
		
	}
	
	static void convertir(double valorDolar, String pais) {
		Scanner leer = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de %s :", pais );
		double cantidadMoneda = leer.nextDouble();
		
		double dolares = cantidadMoneda / valorDolar; 
		
		dolares = (double) Math.round(dolares * 100d) / 100;
		
		System.out.println("------------------------");
		System.out.println("     Tienes $" + dolares + " Dolares    |");
		System.out.println("------------------------");
		
	}
}



