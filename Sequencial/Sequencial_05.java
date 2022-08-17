package Sequencial;
import java.util.Scanner;
public class Sequencial_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira os metros que deseja converter :");
	float metro = input.nextFloat();
	
	System.out.println("A Conversão de "+ metro +" Metros para CM é: " + (metro*100));
	
	input.close();
		
	}

}
