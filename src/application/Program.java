package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ol�, o que vc quer?");
		String pessoa  = scan.next();
		
		if(pessoa  == "Grana"){
			System.out.println("Vai trabalhar, sem vergonha");
		}
		else if (pessoa == "Divers�o") {
			System.out.println("Ent�o o que vc est� fazendo aqui?, vai viajar, curtira vida...sei l�");
		}
		else if(pessoa == "Estudar") {
			System.out.println("Um exemplo de pessoa, um futuro s�bio em nosso meio");
		}
		else {
			System.out.println("N�o quero saber");
		}
		
	}

}
