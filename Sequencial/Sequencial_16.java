package Sequencial;
import java.util.Scanner;
public class Sequencial_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	System.out.print("Insira a área em m² a ser pindada: ");	
	float area = input.nextFloat();
	float n_litros = (area/6);
	float lata_18 = (n_litros/18);
	double lata_3 = (n_litros/3.6);
	
	System.out.println("Comprando latas de 3,6 litros você pagará: "+(lata_3*25)+" R$.");
	System.out.println("Comprando latas de 18 litros você pagará: "+(lata_18*80)+" R$.");
	
	input.close();
	
	}

}
