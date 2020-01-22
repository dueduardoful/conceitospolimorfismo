package application;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Tryecatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
		String[] vect = sc.nextLine().split(" ");
		// ler varios dados na mesma linha separados por espaços em branco
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException erro1){
			System.out.println("Invalid Position!");
		}
		
		catch(InputMismatchException erro2){
			System.out.println("valor inválido!");
		}
		
		System.out.println("End of program");
		
		sc.close();
	}

}
