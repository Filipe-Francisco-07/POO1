package Seleção;
import java.util.Scanner;
public class Seleção_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int iNum1 = input.nextInt();
		System.out.println("Insira outro número: ");
		int iNum2 = input.nextInt();
		if (iNum1 > iNum2)
			System.out.println(iNum1 +" é o maior número.");
		else
			System.out.println(iNum2 +" é o maior número.");
			
		
	input.close();
	
	}

}
