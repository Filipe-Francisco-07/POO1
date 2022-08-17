package Seleção;
import java.util.Scanner;
public class Seleção_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Em qual turno você estuda? M-Matutino,V-Vespertino ou N-Noturno: ");
	char cLetter = input.next().charAt(0);
	
	switch (cLetter) {
	
	case ('M'):
		System.out.println("Bom dia!");
	break;
	case ('V'):
		System.out.println("Boa tarde!");
	break;
	case ('N'):
		System.out.println("Boa noite!");

	
	input.close();
	
	}	
	}

}
