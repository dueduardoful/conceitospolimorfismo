package ManipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//nome do arquivo ou pasta
		System.out.println("getName: " + path.getName());
		// apenas o caminho
		System.out.println("getParent: " + path.getParent());
		// todo o caminho
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
