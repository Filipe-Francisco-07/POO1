package Sequencial;
import java.util.Scanner;
public class Sequencial_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira a temperatura em graus Farenheit: ");
	float grau = input.nextFloat();
	float result = (5*(grau - 32)/9);
	
	System.out.println("A conversão em graus Celsius é: " + result) ;
	
	input.close();
	
	}

}
