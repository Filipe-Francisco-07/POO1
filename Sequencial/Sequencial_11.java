package Sequencial;
import java.util.Scanner;
public class Sequencial_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.println("Insira sua altura: ");
	float altura = input.nextFloat();
	
	System.out.println("O seu peso ideal é: " + ((72.7*altura)-58));
	
	input.close();
		
	}

}
