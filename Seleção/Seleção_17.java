package Seleção;
import java.util.Scanner;
public class Seleção_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira sua primeira nota: ");
	float fNota1 = input.nextFloat();
	System.out.print("Insira sua segunda nota: ");
	float fNota2 = input.nextFloat();
	
	char cConceito = 'F';
	float fMedia = ((fNota1 + fNota2)/2);
	
	if (fMedia >= 9) {
		cConceito = 'A';
	}else if (fMedia >= 7.5 && fMedia < 9) {
		cConceito = 'B';
	}else if (fMedia >= 6.0 && fMedia < 7.5) {
		cConceito = 'C';
	}else if (fMedia >= 4.0 && fMedia < 6.0) {
		cConceito = 'D';
	}else if (fMedia >= 0 && fMedia < 4) {
		cConceito = 'E';
    }
	System.out.println("Sua primeira nota é: "+fNota1);
	System.out.println("Sua segunda nota é: "+fNota2);
	System.out.println("Seu conceito é: " + cConceito);
	
	if (cConceito == 'A' || cConceito == 'B' ||  cConceito =='C') {
		System.out.println("Você foi aprovado com a média: "+fMedia+" C:");
	}	else  {
		System.out.println("Você foi reprovado com a média: "+fMedia+" :C");
	}
	
	input.close();
	
	}
}
