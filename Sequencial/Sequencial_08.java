package Sequencial;
import java.util.Scanner;
public class Sequencial_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira o número de horas trabalhadas no mês:");
	int hour = input.nextInt();
	System.out.print("Insira o quanto você ganha por hora:");
	float value = input.nextFloat();
	
	System.out.println("Seu salário no referido mês é de :" + hour*value + " R$.");
	
	input.close();
	
	}

}
