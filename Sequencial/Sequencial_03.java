package Sequencial;
import java.util.Scanner;
public class Sequencial_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.print("Insira o primeiro número: ");
	float num1 = input.nextFloat();
	
	System.out.print("Insira o segundo número: ");
	float num2 = input.nextFloat();
	
	float soma = num1 + num2;
	System.out.println("A Soma dos dois números é: " + soma);
	
	input.close();
		
	}

}
