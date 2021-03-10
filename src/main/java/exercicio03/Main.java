package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
		System.out.print("Digite uma idade aqui: ");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		
		if(idade > 20) {
			System.out.println("Idade maior que 20");
		} else if(idade > 12 && idade < 17) {
			System.out.println("Idade maior que 12");
		} else if(idade == 7 || idade < 5) {
			System.out.println("Idade igual a 7 OU menor que 5");
		} else {
			System.out.println("Outras combinações");
		}
		
		
		
	}

}
