package Seleção;
import java.util.Scanner;
public class Seleção_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira um número: ");
	int iNum = input.nextInt();
	if (iNum > 0)
		System.out.println("O Número é maior que zero.");
	else if  (iNum < 0)
		System.out.println("O Número é menor que zero.");
	else
		System.out.println("O Número é igual a zero.");
		
	input.close();
	
	}

}
