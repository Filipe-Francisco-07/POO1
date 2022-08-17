package Seleção;
import java.util.Scanner;
public class Seleção_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	int iQuant1 = 0;
	int iQuant2 = 0;
	System.out.println("Escolha 2 tipos de carne para levar(insira o código do produto): ");
	System.out.println("COD-F - Filé Duplo ");
	System.out.println("COD-A - Alcatra ");
	System.out.print("COD-P - Picanha ");
	char cType1 = input.next().charAt(0);
	System.out.print("Insira a quantidade. ");
	iQuant1 = input.nextInt();
	System.out.println("Escolha mais um tipo de carne. ");
	System.out.println("COD-F - Filé Duplo ");
	System.out.println("COD-A - Alcatra ");
	System.out.print("COD-P - Picanha ");
	char cType2 = input.next().charAt(0);
	System.out.print("Insira a quantidade em KG. ");
	iQuant2 = input.nextInt();
	System.out.print("Pagamento com cartão? 5% de desconto , responder com S ou N.");
	char cChoose = input.next().charAt(0);
	
	double dDesc = 0;
	boolean bPicanha = false;
	boolean bAlcatra = false;
	boolean bFile = false;
	double dResult1 = 0;
	double dResult2 = 0;
	double dValue = 0;
	
		
	
	if (cType1 == 'F' || cType1 == 'f' || cType2 == 'F' || cType2 == 'f') {
		bFile = true;
	}
		
	if (cType1 == 'A' || cType1 == 'a' || cType2 == 'A' || cType2 == 'a') {
		bAlcatra = true;
	}
	if (cType1 == 'P' || cType1 == 'p' || cType2 == 'P' || cType2 == 'p') {
		bPicanha = true;
	}
	
	if (bFile && iQuant1 > 0 && iQuant1 <= 5) {
		dResult1 = (iQuant1 * 4.90);
		System.out.println("Sua primeria carne escolhida foi: Filé Duplo.");
		System.out.println("Quantidade: "+iQuant1);
	}else if (bFile && iQuant1 > 5) {
		dResult1 = (iQuant1 * 5.80);
		System.out.println("Sua primeira carne escolhida foi: Filé Duplo.");
		System.out.println("Quantidade: "+iQuant1);
	}
	
	if (bFile && iQuant2 > 0 && iQuant2 <= 5) {
		dResult2 = (iQuant2 * 4.90);
		System.out.println("Sua segunda carne escolhida foi: Filé Duplo.");
		System.out.println("Quantidade: "+iQuant2);
	}else if (bFile && iQuant1 > 5) {
		dResult2 = (iQuant2 * 5.80);
		System.out.println("Sua segunda carne escolhida foi: Filé Duplo.");
		System.out.println("Quantidade: "+iQuant2);
	}
	
	if (bAlcatra && iQuant1 > 0 && iQuant1 <= 5) {
		dResult1 = (iQuant1 * 4.90);
		System.out.println("Sua primeria carne escolhida foi: Alcatra.");
		System.out.println("Quantidade: "+iQuant1);
	}else if (bAlcatra && iQuant1 > 5) {
		dResult1 = (iQuant1 * 5.80);
		System.out.println("Sua primeria carne escolhida foi: Alcatra.");
		System.out.println("Quantidade: "+iQuant1);
	}
	
	if (bAlcatra && iQuant2 > 0 && iQuant2 <= 5) {
		dResult2 = (iQuant2 * 4.90);
		System.out.println("Sua segunda carne escolhida foi: Alcatra.");
		System.out.println("Quantidade: "+iQuant2);
	}else if (bAlcatra && iQuant1 > 5) {
		dResult2 = (iQuant2 * 5.80);
		System.out.println("Sua segunda carne escolhida foi: Alcatra.");
		System.out.println("Quantidade: "+iQuant2);
	}
	
	if (bPicanha && iQuant1 > 0 && iQuant1 <= 5) {
		dResult1 = (iQuant1 * 4.90);
		System.out.println("Sua primeira carne escolhida foi: Picanha.");
		System.out.println("Quantidade: "+iQuant1);
	}else if (bPicanha && iQuant1 > 5) {
		dResult1 = (iQuant1 * 5.80);
		System.out.println("Sua primeira carne escolhida foi: Picanha.");
		System.out.println("Quantidade: "+iQuant1);
	}
	
	if (bPicanha && iQuant2 > 0 && iQuant2 <= 5) {
		dResult2 = (iQuant2 * 4.90);
		System.out.println("Sua segunda carne escolhida foi: Picanha.");
		System.out.println("Quantidade: "+iQuant2);
	}else if (bPicanha && iQuant1 > 5) {
		dResult2 = (iQuant2 * 5.80);
		System.out.println("Sua segunda carne escolhida foi: Picanha.");
		System.out.println("Quantidade: "+iQuant2);
	}
	
	if (cChoose == 'S' || cChoose == 's') {
		dDesc = ((dResult1 + dResult2)*0.05);
		dValue = ((dResult1 + dResult2)-dDesc);
		System.out.println("Pagamento com cartão.");
	} else {
		dValue = (dResult1 +dResult2);
		System.out.println("Pagamento padrão.");
	}
	
	System.out.println("Seu valor de desconto é: "+dDesc+" R$.");
	System.out.println("O Custo final é: "+dValue+" R$.");
	
	input.close();
	
	}
	

}
