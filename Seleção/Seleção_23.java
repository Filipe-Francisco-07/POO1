package Seleção;
import java.util.Scanner;
public class Seleção_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	float fMedia = 0;
	
	for  (int i = 1; i <= 3 ; i++) {
		System.out.print("Insira a "+i+"° idade: ");
		int iAge = input.nextInt();
			while (iAge < 0) {
				System.out.println("Insira uma idade válida. ");
				iAge = input.nextInt();
			}
		fMedia = fMedia + iAge;
	}	
	fMedia = (fMedia /3);
	System.out.println("A média de idade da turma é: "+fMedia);
    if (fMedia < 25) {
    	System.out.println("Sua turma é jovem. ");
	} else if (fMedia >= 25 && fMedia < 40) {
    	System.out.println("Sua turma é adulta. ");
	} else  {
    	System.out.println("Sua turma é idosa. ");
	}
    
    input.close();
	}

}
