package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Login;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Set <Login> set = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
				String[] cont = line.split(" ");
				String usuario = cont[0];
				Date momento = Date.from(Instant.parse(cont[1]));
				set.add(new Login(usuario, momento));
				
				line = br.readLine();
			}
			
			System.out.println("Número de usuários: " + set.size());
			
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		
		sc.close();

	}

}
