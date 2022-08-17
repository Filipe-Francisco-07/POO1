package Seleção;
import java.util.Scanner;
public class Seleção_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira a origem do  seu produto: ");
	System.out.println("1 - Sul ");
	System.out.println("2 - Norte ");
	System.out.println("3 - Leste");
	System.out.println("4 - Oeste");
	System.out.println("5 - Nordeste");
	System.out.println("6 - Centro-Oeste");
	System.out.print("Se sua alternativa não está aqui , digite qualquer outro número.");
    int iCode = input.nextInt();
	System.out.print("Insira o preço do seu produto(R$): ");
	float fValue = input.nextFloat();
  
	
		
	if (iCode == 1){
		System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Sul do Brasil.");
	}else if (iCode == 2){
		System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Norte do Brasil.");
	}else if (iCode == 3){
		System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Leste do Brasil.");
	}else if (iCode == 4){
		System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Oeste do Brasil.");
	}else if (iCode == 5){
	    System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Nordeste do Brasil.");
	}else if (iCode == 6){
		System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Centro-Oeste do Brasil.");
	}else {
		System.out.println("O Preço do seu produto é: "+fValue);
		System.out.println("Procedência do produto: Produto importado.");
		
		
	}
	
	input.close();
	
	}

}
