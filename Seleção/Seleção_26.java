package Seleção;
import java.util.Scanner;
public class Seleção_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número: ");
	float fNum = input.nextFloat();
	
	if (fNum % 1 == 0) {
		System.out.println("O número inserido é inteiro. ");
	}else {
		System.out.println("O número inserido é decimal. ");
	}	
	
	input.close();
	
	}

}
