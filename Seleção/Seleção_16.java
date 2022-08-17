package Seleção;
import java.util.Scanner;
public class Seleção_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Digite a primeira nota: ");
	float fNota1 = input.nextFloat();
	System.out.print("Digite a segunda nota: ");
	float fNota2 = input.nextFloat();
	
	float fMedia = ((fNota1 + fNota2) / 2);
	
	if (fMedia >= 0 && fMedia < 3) {
		System.out.println("Você foi reprovado com a média : "+fMedia+" , que peninha.");
	}else if (fMedia >=3 && fMedia <= 6.9) { 
		System.out.println("Você está em recuperação com a média: "+fMedia +" , tome cuidado!");
	}else { 
		System.out.println("Parabéns , você foi aprovado com a média: "+fMedia);
		
	}
	
	input.close();
	}

}
