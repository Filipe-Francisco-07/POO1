package Seleção;
import java.util.Scanner;
public class Seleção_32 {

public static void main(String[] args) {
// TODO Auto-generated method stub

int i = 0;

Scanner input = new Scanner(System.in);
System.out.println("--------------PROVA---------------");
System.out.println("Questão 1 : Que linguagem estamos utilizando?");
System.out.println("A - Java");
System.out.println("B - Python");
System.out.println("C - C++");
System.out.println("D - Html");
System.out.println("E - VisualG");
char cAnswer1 = input.next().charAt(0);

System.out.println("Questão 2 : Em que ano estamos ?");
System.out.println("A - 2022");
System.out.println("B - 2022 A.C.");
System.out.println("C - 2077");
System.out.println("D - 666");
System.out.println("E - 2012");
char cAnswer2 = input.next().charAt(0);

System.out.println("Questão 3 : Quem é o criador da marca Tesla?");
System.out.println("A - Steve Jobs");
System.out.println("B - Ellon Musk");
System.out.println("C - Silvio Santos");
System.out.println("D - Tiringa");
System.out.println("E - Nikola Tesla");
char cAnswer3 = input.next().charAt(0);

System.out.println("Questão 4 : Que empresa criou o Red Dead Redemption 2?");
System.out.println("A - CD Projekt Red");
System.out.println("B - Rockstar Games");
System.out.println("C - Eletronic Arts (EA)");
System.out.println("D - Valve");
System.out.println("E - Capcom Games");
char cAnswer4 = input.next().charAt(0);

System.out.println("Questão 5 : Qual das seguintes marcas criou o iPhone?");
System.out.println("A - Samsung");
System.out.println("B - Xiaomi");
System.out.println("C - Apple");
System.out.println("D - Asus");
System.out.println("E - Positivo kkkk");
char cAnswer5 = input.next().charAt(0);

System.out.println("Questão 6 : Qual linguagem mais cresceu no Brasil nos últimos anos? ");
System.out.println("A - Java");
System.out.println("B - Python");
System.out.println("C - Java Script");
System.out.println("D - Html");
System.out.println("E - C++");
char cAnswer6 = input.next().charAt(0);

System.out.println("Questão 7 : Qual linguagem de banco de dados abaixo não exite?");
System.out.println("A - Mongo DB");
System.out.println("B - Oracle");
System.out.println("C - PGAdmin");
System.out.println("D - GardenSQL");
System.out.println("E - MySQL");
char cAnswer7 = input.next().charAt(0);

System.out.println("Questão 8 : Qual das seguintes armas está no CSGO?");
System.out.println("A - AK74");
System.out.println("B - Thompson");
System.out.println("C - M60");
System.out.println("D - MP5-S");
System.out.println("E - Scar-L");
char cAnswer8 = input.next().charAt(0);

System.out.println("Questão 9 : ''A Tecnologia move o mundo'' , quem disse esta frase?");
System.out.println("A - Bill Gates");
System.out.println("B - Grace Hopper");
System.out.println("C - Palmirinha");
System.out.println("D - Alan Turing");
System.out.println("E - Steve Jobs");
char cAnswer9 = input.next().charAt(0);

System.out.println("Questão 10 : Spray bom...");
System.out.println("A - é com os guri.");
System.out.println("B - é com ColorGin.");
System.out.println("C - é com Coral.");
System.out.println("D - é na Valve.");
System.out.println("E - é na Gamersclub.");
char cAnswer10 = input.next().charAt(0);

if(cAnswer1 == 'A' || cAnswer1 == 'a') {
System.out.println("Questão 1 : Resposta correta.");
i++;
}else {
System.out.println("Questão 1 :Resposta incorreta.");
}
if(cAnswer2 == 'A'|| cAnswer2 == 'a') {
System.out.println("Questão 2 : Resposta correta.");
i++;
}else {
System.out.println("Questão 2 :Resposta incorreta.");
}
if(cAnswer3 == 'B'|| cAnswer3 == 'b') {
System.out.println("Questão 3 : Resposta correta.");
i++;
}else {
System.out.println("Questão 3 :Resposta incorreta.");
}
if(cAnswer4 == 'B'|| cAnswer4 == 'b') {
System.out.println("Questão 4 : Resposta correta.");
i++;
}else {
System.out.println("Questão 4 :Resposta incorreta.");
}
if(cAnswer5 == 'C'|| cAnswer5 == 'c') {
System.out.println("Questão 5 : Resposta correta.");
i++;
}else {
System.out.println("Questão 5 :Resposta incorreta.");
}
if(cAnswer6 == 'C'|| cAnswer6 == 'c') {
System.out.println("Questão 6 : Resposta correta.");
i++;
}else {
System.out.println("Questão 6 :Resposta incorreta.");
}
if(cAnswer7 == 'D'|| cAnswer7 == 'd') {
System.out.println("Questão 7 : Resposta correta.");
i++;
}else {
System.out.println("Questão 7 :Resposta incorreta.");
}
if(cAnswer8 == 'D'|| cAnswer8 == 'd') {
System.out.println("Questão 8 : Resposta correta.");
i++;
}else {
System.out.println("Questão 8 :Resposta incorreta.");
}
if(cAnswer9 == 'E'|| cAnswer9 == 'e') {
System.out.println("Questão 9 : Resposta correta.");
i++;
}else {
System.out.println("Questão 9 :Resposta incorreta.");
}
if(cAnswer10 == 'E'|| cAnswer10 == 'e') {
System.out.println("Questão 10 : Resposta correta.");
i++;
}else {
System.out.println("Questão 10 :Resposta incorreta.");
}

if (i >= 6) {
System.out.println("Você tirou "+i+" , está acima da média.");
}else {
System.out.println("Você tirou "+i+" , está abaixo da média.");

}
input.close();
}

}
