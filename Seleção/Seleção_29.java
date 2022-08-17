package Seleção;
import java.util.Scanner;
public class Seleção_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira qual combustível deseja: ");
	System.out.println("Álcool : A ");
	System.out.println("Gasolina: G ");
	char cEscolha = input.next().charAt(0);
	System.out.println("Insira o número de litros desejado: ");
	int iLitro = input.nextInt();
	
	double dResult = 0;
		
	if (cEscolha =='A') {
		if (iLitro < 20) {
			dResult = ((iLitro * 1.90) -(iLitro *0.03) );
		}else {
			dResult = ((iLitro*1.90)-(iLitro *0.05) );	
		}    	
	}
	if (cEscolha =='G') {
		dResult = ((iLitro*2.50)-(iLitro *0.04) );	
	}else {
		dResult = ((iLitro*2.50)-(iLitro *0.06) );		
	}
	System.out.println("O Valor a ser pago é: "+dResult);
	
	input.close();
	
	}
	
}
