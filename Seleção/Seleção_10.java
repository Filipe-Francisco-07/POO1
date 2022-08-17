package Seleção;
import java.util.Scanner;
public class Seleção_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int iNum1 = input.nextInt();
	System.out.println("Digite um número: ");
	int iNum2 = input.nextInt();
	System.out.println("Digite um número: ");
	int iNum3 = input.nextInt();
	
	if (iNum1 > iNum2 && iNum1 > iNum3 && iNum2 > iNum3 ) {
		System.out.println("O maior número é: "+iNum1+" e o menor número é: "+iNum3);
	}else if (iNum1 > iNum2 && iNum1 > iNum3 && iNum3 > iNum2 ) {
		System.out.println("O maior número é: "+iNum1+" e o menor número é: "+iNum2);
	}	
	if (iNum2 > iNum1 && iNum2 > iNum3 && iNum1 > iNum3 ) {
		System.out.println("O maior número é: "+iNum2+" e o menor número é: "+iNum3);
	}else if (iNum2 > iNum1 && iNum2 > iNum3 && iNum3 > iNum1 ) {
		System.out.println("O maior número é: "+iNum2+" e o menor número é: "+iNum1);
	}	
	if (iNum3 > iNum2 && iNum3 > iNum1 && iNum2 > iNum1 ) {
		System.out.println("O maior número é: "+iNum3+" e o menor número é: "+iNum1);
	}else if (iNum3 > iNum2 && iNum3 > iNum1 && iNum1 > iNum2 ) {
		System.out.println("O maior número é: "+iNum3+" e o menor número é: "+iNum2);
	}	
	
	input.close();
	}

}
