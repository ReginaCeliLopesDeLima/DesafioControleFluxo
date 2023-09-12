package br.com;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();		
		scanner.close();
		
		try{
			contar(parametroUm, parametroDois);		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception);		
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(contagem = parametroUm; contagem <= parametroDois; contagem++) {
			System.out.println(contagem);
		}	

	}

}
