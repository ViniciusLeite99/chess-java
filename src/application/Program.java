package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Olá, o que vc quer?");
		String pessoa  = scan.next();
		
		if(pessoa  == "Grana"){
			System.out.println("Vai trabalhar, sem vergonha");
		}
		else if (pessoa == "Diversão") {
			System.out.println("Então o que vc está fazendo aqui?, vai viajar, curtira vida...sei lá");
		}
		else if(pessoa == "Estudar") {
			System.out.println("Um exemplo de pessoa, um futuro sábio em nosso meio");
		}
		else {
			System.out.println("Não quero saber");
		}
		
	}

}
