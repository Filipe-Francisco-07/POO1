package Seleção;
import java.util.Scanner;
public class Seleção_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira um número: ");
	int iNum1 = input.nextInt();	
	System.out.println("Insira outro número: ");
	int iNum2 = input.nextInt();
	System.out.println("Insira mais um número: ");
	int iNum3 = input.nextInt();
	
	if (iNum1 > iNum2 && iNum1 > iNum3) {
		System.out.println(iNum1 + " " + iNum2 + " "  + iNum3);
	}else if   (iNum2 > iNum1 && iNum2 > iNum3){
		System.out.println(iNum1+" "+ iNum2+" " + iNum3);
	}else {
		System.out.println(iNum3+" "+iNum2+" "+iNum1);
	}	
	input.close();
	
		
	
	}

}
