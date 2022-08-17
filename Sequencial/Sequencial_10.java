package Sequencial;
import java.util.Scanner;
public class Sequencial_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número inteiro: ");
	int num1 = input.nextInt();
	System.out.print("Insira outro número inteiro: ");
	int num2 = input.nextInt();
	System.out.print("Insira um número real: ");
	float real1 = input.nextFloat();
	
	System.out.println("O Prod do dobro do 1° com a metade do 2° é: " + (num1*2)*(num2*0.5));
	System.out.println("A soma do triplo do 1° com o 3° é: " + (num1*3)+ real1);
	System.out.println("O terceiro elevado ao cubo é: " + (real1*real1*real1));
	
	input.close();
		
	}

}
