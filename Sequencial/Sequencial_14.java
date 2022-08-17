package Sequencial;
import java.util.Scanner;
public class Sequencial_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
		System.out.print("Insira quantos R$ você ganha por hora: ");
	float value = input.nextFloat();
		System.out.print("Insira quantas horas trabalhadas no mês: ");
	int hour = input.nextInt();
	float salario = (value * hour);
	double imp_renda = (salario * 0.11);
	double inss = (salario * 0.08);
	double sindicato = (salario * 0.05);
	double sal_liquido = (salario - imp_renda - inss - sindicato);
		System.out.println("Seu salário bruto é: " + salario+" R$.");
		System.out.println("Seu imposto de renda é de : "+ imp_renda+" R$.");
		System.out.println("Seu INSS é de: " + inss+" R$.");
		System.out.println("Seu desconto do sindicato é de: "+ sindicato+" R$.");
		System.out.println("Seu salário líquido é: "+sal_liquido+" R$.");
	
		input.close();
	
	
	
	}

}
