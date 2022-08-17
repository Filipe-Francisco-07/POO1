package Seleção;
import java.util.Scanner;
public class Seleção_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número de 1 a 7: ");
	int iDay = input.nextInt();
	
	boolean bYes= false;
	
	while(bYes == false)  {	
		
	if (iDay == 1){
		System.out.print("Hoje é domingo!");
		bYes= true;
	}else if (iDay == 2){
		System.out.print("Hoje é Segunda-Feira!");
		bYes= true;
	}else if (iDay == 3){
		System.out.print("Hoje é Terça-Feira!");
		bYes= true;
	}else if (iDay == 4){
		System.out.print("Hoje é Quarta-Feira!");
		bYes= true;
	}else if (iDay == 5){
		System.out.print("Hoje é Quinta-Feirao!");
		bYes= true;
	}else if (iDay == 6){
		System.out.print("Hoje é Sexta-Feira!");
		bYes= true;
	}else if (iDay == 7){
		System.out.print("Hoje é Sábado!");
		bYes= true;
	}else {
		System.out.print("Insira um valor válido!");
		iDay = input.nextInt();
		
		
	}
	}
	
	input.close();
	
	}

}
