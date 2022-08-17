package Seleção;
import java.util.Scanner;
public class Seleção_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira o lado 1 do triângulo: ");
	float fLado1 = input.nextFloat();
	System.out.println("Insira o lado 2 do triângulo: ");
	float fLado2 = input.nextFloat();
	System.out.println("Insira o lado 3 do triângulo: ");
	float fLado3 = input.nextFloat();
	
	if (fLado1 == fLado2 && fLado2 == fLado3) {
		System.out.println("Você tem um triângulo Equilátero. ");
	}	
	else if (fLado1 != fLado2 && fLado2 != fLado3 && fLado3 != fLado1) {
		System.out.println("Você tem um triângulo Escaleno. ");
	}else {
		System.out.println("Você tem um triângulo Isósceles. ");
	}
	
	input.close();
	}

}
