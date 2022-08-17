package Seleção;
import java.util.Scanner;
public class Seleção_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new  Scanner(System.in);
	System.out.print("Insira um número: ");
	int iNum = input.nextInt();
	
	if (iNum % 2 == 0) { 
		iNum = (iNum - 1);
		System.out.println("Seu número par passou a ser ímpar: "+ iNum);
	}else {
		iNum = (iNum - 1);
		System.out.println("Seu número ímpar passou a ser par: "+ iNum);
		
	input.close();
		
	}	
	}

}
