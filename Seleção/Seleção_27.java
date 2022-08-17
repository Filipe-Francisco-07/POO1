package Seleção;
import java.util.Scanner;
public class Seleção_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira o primeiro número: ");
	float fNum1 = input.nextFloat();
	System.out.print("Insira o segundo número: ");
	float fNum2 = input.nextFloat();
	
	boolean bPar = false;
	boolean bInt = false;
	float fResult = 0;
	
	System.out.println("Insira o número respectivo da operação que deseja realizar: ");
	System.out.println("1 - Soma ");
	System.out.println("2 - Subtração ");
	System.out.println("3 - Divisão ");
	System.out.println("4 - Multiplicação ");
	int iEscolha = input.nextInt();
	
	if(iEscolha ==1 ) {
		fResult = (fNum1 + fNum2);
	}else if(iEscolha == 2 ) {
		fResult = (fNum1 - fNum2);
	}else if(iEscolha == 3 ) {
		fResult = (fNum1 / fNum2);
	}else if(iEscolha == 4 ) {
	    fResult = (fNum1 * fNum2);	
	}    
	
	if (fResult % 2 == 0) {
		bPar = true;
	}
	if (fResult % 1 == 0){
		bInt = true;
	}
	System.out.println("O Resultado da operação é: "+fResult);
	if (bPar) {
		System.out.println("O número é par.");
	}else {
		System.out.println("O número é ímpar.");
	}
	if (fResult > 0) {
		System.out.println("O número positivo.");
	}else {
		System.out.println("O número é negativo.");
	}	
	if (bInt) {
		System.out.println("O número é inteiro.");
	}else {
		System.out.println("O número é decimal.");
	}	
	
	input.close();
		
	}
}
