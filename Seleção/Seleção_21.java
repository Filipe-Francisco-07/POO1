package Seleção;
import java.util.Scanner;
public class Seleção_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Validação de data formado dd/mm/aaaa.");
	System.out.print("Insira o dia: ");
	int iDay = input.nextInt();
	System.out.print("Insira o mês: ");
	int iMounth = input.nextInt();
	System.out.print("Insira o ano: ");
	int iYear = input.nextInt();
	
	boolean bDay = false;
	boolean bMounth = false;
	boolean bYear = false;
	
	if (iDay <= 0 || iDay > 31) {
		bDay = true;
	}
	if (iMounth <= 0 || iMounth > 12) {
		bMounth = true;
	}
	while (iYear <= 0 || iYear > 999999) {
		bYear = true;
	}
	
	if (bYear || bMounth || bDay) {
		System.out.println("A data"+iDay+"/"+iMounth+"/"+iYear+" inserida é inválida. ");
	}else{
		System.out.println("A data "+iDay+"/"+iMounth+"/"+iYear+" inserida é válida."); 
	}		
	
	input.close();
	}

}
