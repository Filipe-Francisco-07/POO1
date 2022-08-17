package Sequencial;
import java.util.Scanner;
public class Sequencial_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
    System.out.println("Insira sua altura: ");
	float altura = input.nextFloat();
	
	System.out.println("Homem: o seu peso ideal é: " + ((72.7*altura)-58));
    System.out.println("Mulher: o seu peso ideal é: " + ((62.1*altura)-44.7));	
  	
    input.close();
		
	}

}
