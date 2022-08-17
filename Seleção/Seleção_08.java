package Seleção;
import java.util.Scanner;
public class Seleção_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Digite a primeira nota: ");
	float fNota1 = input.nextFloat();
	System.out.println("Digite a segunda nota: ");
	float fNota2 = input.nextFloat();
	
	float fMedia = ((fNota1 + fNota2) / 2);
	
	if (fMedia >= 6) {
		System.out.println("Você foi aprovado com a média: "+fMedia+" , parabéns.");
	}else { 
		System.out.println("Que pena , você foi reprovado com a média: "+fMedia);
		
	}
	
	input.close();
	}

}
