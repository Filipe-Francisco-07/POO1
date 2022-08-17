package Seleção;
import java.util.Scanner;
public class Seleção_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira uma letra: ");
	char letter = input.next().charAt(0);
	
	if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
		System.out.println("A letra é uma vogal. ");
	else  
		System.out.println("A letra não é uma vogal. ");

	     		
	
	input.close();
    }

}
