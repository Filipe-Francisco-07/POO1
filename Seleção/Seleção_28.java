package Seleção;
import java.util.Scanner;
public class Seleção_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Investigação : Responda as 5 perguntas com S ou N.");
	System.out.println("Telefonou para a vítima?");
	char cPer1 = input.next().charAt(0);
	System.out.println("Esteve no local do crime?");
	char cPer2 = input.next().charAt(0);
	System.out.println("Mora perto da vítima?");
	char cPer3 = input.next().charAt(0);
	System.out.println("Devia para a vítima?");
	char cPer4 = input.next().charAt(0);
	System.out.println("Já trabalhou com a vítima?");
	char cPer5 = input.next().charAt(0);	
	
	int i =0;
	
	if (cPer1 == 'S') {
		i++;
	}
	if (cPer2 == 'S') {
		i++;
	}
	if (cPer3 == 'S') {
		i++;
	}
	if (cPer4 == 'S') {
		i++;
	}
	if (cPer5 == 'S') {
		i++;
	}
	
	if (i == 2) {
		System.out.println("Você é um(a) suspeito(a) do assassinato.");
	}else if (i == 3 || i == 4) {
		System.out.println("Você é um(a) cúmplice do assassinato.");
	}else if (i == 5) {
		System.out.println("Você é culpado(a) do assassinato.");
	}else  {
		System.out.println("Você é inocente.");
	}
	input.close();
	}

}
