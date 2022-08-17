package Seleção;
import java.util.Scanner;
public class Seleção_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira o valor que deseja sacar: ");
	float dValue = input.nextFloat();
	
	while (dValue < 10 && dValue > 600) {
		System.out.println("Insira um valor de saque válido: ");
		dValue = input.nextFloat();
		
	}
	if (dValue % 100 > 0.9);	
		double dResto = (dValue % 100);
		double dCem = (((dValue % 1000)-dResto)/100);
		dResto = (dValue % 50);
		double dCinquenta =(((dValue % 500)-dResto)/50);
		dResto = (dValue % 10);
		double dDez = (((dValue % 100)-dResto)/ 10);
		dResto = (dValue % 5);
		double dCinco = (((dValue % 50)-dResto)/ 5);
		dResto = (dValue % 1);
		double dUm = ((dValue %10)-dResto);
		
		System.out.println("Notas de cem: "+dCem+", Notas de 50: "+dCinquenta+", Notas de dez: "+dDez+", Notas de 5: "+dCinco+", Notas de 1: "+dUm);	
	
	input.close();	
		
	}

}
