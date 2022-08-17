package Seleção;
import java.util.Scanner;
public class Seleção_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("----------Fruteira----------");
	System.out.println("Digite quantos KG de Morango: ");
	int iCompra1 = input.nextInt();
	System.out.println("Insira quantos KG de Maçã: ");
	int iCompra2 = input.nextInt();
	
	double dMorango = 0;
	double dMaça = 0;
	
	if (iCompra1 <= 5) {
		dMorango = (iCompra1 * 2.50);
	}else if (iCompra1 > 5 && iCompra1 <= 8){
		dMorango = (iCompra1 * 2.20);
	}
	if (iCompra1 > 8 && dMorango > 25) {
		dMorango = ((iCompra1 *2.20)-(iCompra1 * 0.10) );
	} else {
		dMorango = ((iCompra1 *2.20)-(iCompra1 * 0.10) );
	}
	if (iCompra2 <= 5) {
		dMaça = (iCompra2 * 1.80);
	}else if (iCompra2 > 5 && iCompra2 <= 8){
		dMaça = (iCompra1 * 1.50);
	}
	if (iCompra2 > 8 && dMaça > 25) {
		dMaça = ((iCompra2 *1.50)-(iCompra2 * 0.10) );
	} else {
		dMaça = ((iCompra2 *1.50)-(iCompra2 * 0.10) );
	}
	
	System.out.println("O Valor a ser pago é :"+(dMaça + dMorango )+" R$.");
	
	input.close();
	}

}
