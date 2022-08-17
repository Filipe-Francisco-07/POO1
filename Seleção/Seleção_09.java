package Seleção;
import java.util.Scanner;
public class Seleção_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira a sua altura: ");
	double dHeight = input.nextFloat();
	System.out.println("Insira o seu peso: ");
	double dWeight = input.nextFloat();
	System.out.println("Insira o seu sexo(F ou M): ");
	char cSex = input.next().charAt(0);
	double dIdeal;
	
	switch (cSex) {
	
	case ('F'):
		dIdeal = ((62.1*dHeight)-44.7);
		System.out.println(dHeight+"" + dWeight+"" + cSex);
		System.out.println(dIdeal);
		if (dWeight > dIdeal )
			System.out.println("Você está acima do peso ideal.");
		else if (dWeight == dIdeal)
			System.out.println("Você está no peso ideal.");
		else 
			System.out.println("Você está abaixo do peso ideal.");
		
	case ('M'):
		dIdeal = ((72.7*dHeight)-58);
		System.out.println(dHeight+" " + dWeight+" " + cSex);
		System.out.println(dIdeal);
		if (dWeight > dIdeal )
			System.out.println("Você está acima do peso ideal.");
		else if (dWeight == dIdeal)
			System.out.println("Você está no peso ideal.");
		else 
			System.out.println("Você está abaixo do peso ideal.");
	
	input.close();
	
	}	
	}

}
