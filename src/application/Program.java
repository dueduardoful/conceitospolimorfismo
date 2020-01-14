package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		//12. construção da classe program
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//14.Declaração de lista ou instanciar lista
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		//15. fazer um for para ler repetidamente a qnt de funcionários.
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + "data");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//16. Instanciando a classe OutsourcedEmployee(terceirizado)
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				// 17. adicionando terceirizado na minha lista
				list.add(emp);
				
				//20. outrar forma seria instanciar dentro do lis.add()
			}
			else {
				//18. instanciar Employee (funcionario)
				Employee emp = new Employee(name, hours, valuePerHour);
				//19. adicionando funcionario na lista
				list.add(emp);
			}
			
		}
		//13. ler a quantidade n de funcionários e armazenar em uma lista
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		//21. para imprimir nome e pgt: percorrer a lista mandando imprimir nome e pgt de cada um.
		//22. para cada Employee emp da minha lista list vou mandar imprimir na tela
		for(Employee emp: list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			
		}
		sc.close();
	}

}
