package Seleção;
import java.util.Scanner;
public class Seleção_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.println("Informe o número correspondente a um ano : ");	
	int year = input.nextInt();
	
	if (year % 400 != 0 || (year % 4 == 0 && year % 100 == 0)) {
		System.out.println("O ano informado é bissexto! ");
	}else { 
		System.out.println("O ano informado não é bissexto! ");
	}
	
	input.close();
		
	}

}
