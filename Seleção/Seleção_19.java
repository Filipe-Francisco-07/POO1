package Seleção;
import java.util.Scanner;
public class Seleção_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira o Coeficiente A: ");
	float fCoeA = input.nextFloat();
	System.out.print("Insira o Coeficiente B: ");
	float fCoeB = input.nextFloat();
	System.out.print("Insira o Coeficiente C: ");
	float fCoeC = input.nextFloat();
	
	double dDelta;
	double dRaiz1;
	double dRaiz2;
	
	while (fCoeA == 0) {
		System.out.println("Insira um Coeficiente A diferente de 0: ");
		fCoeA = input.nextFloat();
		}	
	dDelta = (fCoeB*fCoeB)-4 * ((fCoeA) * (fCoeC)) ;
	dRaiz1 = ((-fCoeB + Math.sqrt(dDelta))/(2*fCoeA));
	dRaiz2 = ((-fCoeB - Math.sqrt(dDelta))/(2*fCoeA));
	
	if (dDelta < 0) {
		System.out.println("Delta negativo , sem raizes reais. :( ");
	}else if (dDelta == 0) {
		System.out.println("Delta igual a 0 , somente uma raiz.");
		System.out.println("Sua raiz é: " + dRaiz1);
	}else {
		System.out.println("Delta maior que 0 , duas raizes.");
		System.out.println("Suas raizes são: "+dRaiz1+" "+dRaiz2);
	}
	
	input.close();
	}

}
