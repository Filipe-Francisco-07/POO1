package Seleção;
import java.util.Scanner;
public class Seleção_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira o número de horas trabalhadas no mês: ");
	int iHour = input.nextInt();
	System.out.print("Insira o valor de cada hora: ");
	double dValue = input.nextDouble();
	
	double dSal = (iHour * dValue);
	double dIR ;
	double dFGTS = (dSal * 0.11);
	double dINSS = (dSal * 0.10);


	
	if (dSal <= 900) {
		System.out.println("Seu salário bruto é :" + dSal);
		System.out.println("Você não possui imposto de renda.");
		System.out.println("Seu INSS é :" + dINSS);
		System.out.println("Total de descontos: "+ dINSS);
		System.out.println("Salário líquido: " + (dSal - dINSS));
		System.out.println("Seu FGTS (não descontado) é: "+dFGTS);
	} else if (dSal > 900 && dSal <= 1500) {
		dIR = (dSal * 0.05);
		System.out.println("Seu salário bruto é :" + dSal);
		System.out.println("Seu imposto de renda é: "+dIR);
		System.out.println("Seu INSS é :" + dINSS);
		System.out.println("Total de descontos: "+ (dINSS+dIR));
		System.out.println("Salário líquido: " + (dSal - dINSS - dIR));
		System.out.println("Seu FGTS (não descontado) é: "+dFGTS);
	} else if (dSal > 1500 && dSal <= 2500) {
		dIR = (dSal * 0.10);
		System.out.println("Seu salário bruto é :" + dSal);
		System.out.println("Seu imposto de renda é: "+dIR);
		System.out.println("Seu INSS é :" + dINSS);
		System.out.println("Total de descontos: "+ (dINSS+dIR));
		System.out.println("Salário líquido: " + (dSal - dINSS - dIR));
		System.out.println("Seu FGTS (não descontado) é: "+dFGTS);
	} else if (dSal > 2500) {
		dIR = (dSal * 0.20);
		System.out.println("Seu salário bruto é :" + dSal);
		System.out.println("Seu imposto de renda é: "+dIR);
		System.out.println("Seu INSS é :" + dINSS);
		System.out.println("Total de descontos: "+ (dINSS+dIR));
		System.out.println("Salário líquido: " + (dSal - dINSS - dIR));
		System.out.println("Seu FGTS (não descontado) é: "+dFGTS);
	}
	
	input.close();	
	
	}

}
