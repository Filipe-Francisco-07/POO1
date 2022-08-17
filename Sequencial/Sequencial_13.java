package Sequencial;
import java.util.Scanner;
public class Sequencial_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira quantos KG de peixe: ");
	int kg = input.nextInt();
	if (kg > 50) {
	float multa = ((kg - 50)* 4);
		System.out.println("Seus KG de peixe excederam 50 e sua multa é de:" + multa + "R$.");
	}else {
		System.out.println("Seus KG de peixe não excederam 50 , sem multas.");
			
	}	
	
	input.close();
  }
}