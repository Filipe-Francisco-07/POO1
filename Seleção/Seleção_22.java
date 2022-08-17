package Seleção;
import java.util.Scanner;
public class Seleção_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número  entre 1 e 1000: ");
	int iNum = input.nextInt();
	
	int iCent = 0;
	int iDeze = 0;
	int iUnit = 0;
	int iRest;
	
	while (iNum < 1 || iNum > 1000 ) {
		System.out.println("Insira um número válido. ");
		iNum = input.nextInt();
	}	
	if (iNum % 100 > 0.9) {
		iRest = (iNum % 100);
		iCent = (((iNum % 1000 )-iRest) /100);
		iDeze = ((iNum % 100)/10);
		iUnit = ((iNum - (iCent * 100)- iDeze * 10));
		
	
	}
	System.out.println("O Número digitado possui: "+iCent+" centenas, "+iDeze+" dezenas e "+iUnit+" unidades.");
	
	input.close();
	}

}
