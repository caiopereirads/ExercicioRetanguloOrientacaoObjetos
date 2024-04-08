package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble(); //faz com que o usuário insira o valor da largura
		rect.height = sc.nextDouble(); // faz com que o usuário insira o valor da altura
		
		
		System.out.printf("AREA = %.2f%n", rect.area()); //vai mostrar a área
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter()); //vai mostrar o perimetro
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal()); //vai mostrar a diagonal
		
		sc.close();
	}

}
