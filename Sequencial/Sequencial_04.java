package Sequencial;
import java.util.Scanner;
public class Sequencial_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.print("Digite a nota 1: ");
	float nota1 = input.nextFloat();
	System.out.print("Digite a nota 2: ");
	float nota2 = input.nextFloat();
	System.out.print("Digite a nota 3: ");
	float nota3 = input.nextFloat();
	System.out.print("Digite a nota 4: ");
	float nota4 = input.nextFloat();
	
	float media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("A Media das 4 notas é: " + media);
	
	input.close();
			
	}

}
