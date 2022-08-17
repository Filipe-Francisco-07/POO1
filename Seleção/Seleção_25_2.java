package Seleção;
import java.util.Scanner;
public class Seleção_25_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número inteiro: ");
	int iNum = input.nextInt();
	
	if(iNum % 2 == 0) {
		System.out.println("O número digitado é par. ");
	} else {
		System.out.println("O número digitado é ímpar. ");
	}
	
	input.close();
	
	}
}
