package Seleção;
import java.util.Scanner;
public class Seleção_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira a primeira nota: ");
	float fNota1 = input.nextFloat();
	System.out.print("Insira a segunda nota: ");
	float fNota2 = input.nextFloat();
	System.out.print("Insira a terceira nota: ");
	float fNota3 = input.nextFloat();
	
	float fMedia = ((fNota1 + fNota2 + fNota3)/3);
	
	if (fMedia >= 7 && fMedia < 10) {
		System.out.print("Aprovado. ");
	}else if (fMedia < 7 ) {
		System.out.print("Reprovado. ");
	}else {
		System.out.print("Aprovado com distinção. ");
	}

	
	input.close();
	
	}
}