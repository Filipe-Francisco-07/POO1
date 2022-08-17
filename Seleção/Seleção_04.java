package Seleção;
import java.util.Scanner;
public class Seleção_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.println("Insira um ano com 4 dígitos: ");	
	int year = input.nextInt();
	
	if (year % 400 != 0 || (year % 4 == 0 && year % 100 == 0)) {
		System.out.println("O ano é bissexto! ");
	}else { 
		System.out.println("O ano não é bissexto! ");
	
	input.close();
		
	
	}

		
	}

}
