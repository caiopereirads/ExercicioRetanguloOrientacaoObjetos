package entities;

public class Rectangle { //nome da classe
	
	public double width;//atributos da Classe
	public double height;
	
	public double area() { //método para calcular a área do retângulo
		return width * height; //corpo do método
	}
	
	public double perimeter() { //método para calcular o perimetro do retângulo
		return 2 *(width + height);
	}
	
	public double diagonal() { //método para calcular a diagonal do retângulo
		return Math.sqrt(width * width + height * height);
	}
	
}
