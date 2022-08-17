package Seleção;
import java.util.Scanner;
public class Seleção_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira seu salário: ");
	double dSal = input.nextFloat();

	double dAumento;
	boolean bVinte= false;
	boolean bQuinze= false;
	boolean bDez= false;

	
	if (dSal <= 280) {
		dAumento = (dSal * 0.20);
		bVinte = true;
	}else if (dSal >= 280 && dSal <= 700) {
		dAumento = (dSal * 0.15);
		bQuinze = true;
	}else if (dSal >= 700 && dSal <= 1500) {
		dAumento = (dSal * 0.10);
		bDez = true;
	}else {
		dAumento = (dSal * 0.05);

	}	
	System.out.println("Seu salário antes do reajuste era: " + dSal);
	if (bVinte) {
		System.out.println("O aumento aplicado foi de 20%.");
	}else if (bQuinze) {
		System.out.println("O aumento aplicado foi de 15%.");
	}else if (bDez) {
		System.out.println("O aumento aplicado foi de 10%.");
	}else {
		System.out.println("O aumento aplicado foi de 5%.");
	}
	System.out.println("O valor do aumento é: "+ dAumento+" R$.");
	System.out.println("O novo salário após o aumento é: "+ (dSal + dAumento) +" R$.");
	
	input.close();
	}

}
