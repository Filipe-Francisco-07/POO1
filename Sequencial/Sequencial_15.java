package Sequencial;
import java.util.Scanner;
public class Sequencial_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.print("Insira a área em m² a ser pindada: ");	
	float area = input.nextFloat();
	float n_litro = (area / 3);
	if (n_litro > 18) {
		float n_lata = (n_litro / 18);
			System.out.println("A quantidade de latas a serem compradas é de: "+n_lata);
			System.out.println("O preço a ser pago é de: "+n_lata*80+"R$.");
	}else {
		int n_lata = 1;
		System.out.println("A quantidade de latas a serem compradas é de: "+ n_lata );
		System.out.println("O preço a ser pago é de: "+ n_lata *80+"R$.");
	}

	input.close();
	
	}

}
