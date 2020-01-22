package application;

import java.util.InputMismatchException;

import java.util.Scanner;


public class PilhadeChamadaDeMetodos {
	
public static void main(String[] args) {
		
		method1();
		System.out.println("End of program");
		
	}

	public static void method1() {
		System.out.println("***METHOD1 START");
		method2();
		System.out.println("***METHOD1 END");
		
		
	}

	public static void method2() {
		System.out.println("***METHOD2 START");
		Scanner sc = new Scanner(System.in);
		
		try {
		
		String[] vect = sc.nextLine().split(" ");
		// ler varios dados na mesma linha separados por espaços em branco
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException erro1){
			System.out.println("Invalid Position!");
			erro1.printStackTrace();
			sc.next();
		}
		
		catch(InputMismatchException erro2){
			System.out.println("valor inválido!");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	
	}

}
