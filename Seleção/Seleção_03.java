package Seleção;
import java.util.Scanner;
public class Seleção_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Digite seu sexo (M ou F).");
	char cSexo = input.next().charAt(0);
	
	while (cSexo != 'F' && cSexo != 'M') {
	   System.out.println("Insira um valor válido.");
	   cSexo = input.next().charAt(0);
	}
	
	if (cSexo == 'F')
		System.out.println("F = Feminino.");
	else
		System.out.println("M = Masculino.");
	
	input.close();
	
	
    }

}
