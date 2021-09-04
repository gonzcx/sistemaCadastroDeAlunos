package atividade2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SistemaCadastroAlunos {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileWriter arq = new FileWriter("c:\\Users\\João\\Documents\\cadastroAlunos.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		ArrayList<String> nomeAlunos = new ArrayList<>();
		ArrayList<String> emailAlunos = new ArrayList<>();
		ArrayList<String> cursoAlunos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int opcao, x=0, y = 0;
		String z, m, n;
		
		while(x == 0) {
		System.out.println("Digite o que deseja: \n1-Cadastrar novo aluno\n2-Listar todos os alunos já cadastrados\n"
				+ "3-Buscar um aluno específico\n4-Remover um aluno específico\n5-Alterar um aluno específico\n6-Sair");
		opcao = sc.nextInt();
		if(opcao == 1) {
			sc.nextLine();
			System.out.println("Digite o nome do aluno: ");	 
			z = sc.nextLine();
			nomeAlunos.add(z);
			gravarArq.print("nome: " + z + " || ");
			System.out.println("Digite o email do aluno: ");
			m = sc.nextLine();
			emailAlunos.add(m);
			gravarArq.print("Email: " + m + " || ");
			System.out.println("Digite o curso do aluno: ");
			n = sc.nextLine();
			cursoAlunos.add(n);
			gravarArq.println("Curso :" + n);
		}
		else if(opcao == 2) {
			int size = nomeAlunos.size();
			System.out.println(size);
			for(int i=0;i<size; i++){
			System.out.println("Nome: "+ nomeAlunos.get(i) + " || Email: " + emailAlunos.get(i) + 
					" || Curso: " + cursoAlunos.get(i));
			}
		}
		else if(opcao == 3) {
			sc.nextLine();
			System.out.println("Qual aluno deseja ter as informações?");
			y = nomeAlunos.indexOf(sc.nextLine());
			System.out.println("Nome: "+nomeAlunos.get(y) + " || Email: " + emailAlunos.get(y) + 
					" || Curso: " + cursoAlunos.get(y));
		}
		else if(opcao == 4) {
			sc.nextLine();
			System.out.println("Qual aluno deseja remover do sistema?");
			y = nomeAlunos.indexOf(sc.nextLine());
			nomeAlunos.remove(y);
			emailAlunos.remove(y);
			cursoAlunos.remove(y);
			System.out.println("Aluno removido com sucesso");
		}
		else if(opcao == 5) {
			sc.nextLine();
			System.out.println("Qual aluno deseja alterar no sistema?");
			y = nomeAlunos.indexOf(sc.nextLine());
			nomeAlunos.remove(y);
			emailAlunos.remove(y);
			cursoAlunos.remove(y);
			System.out.println("Digite o novo nome: ");
			nomeAlunos.add(sc.nextLine());
			System.out.println("Digite o novo email: ");
			emailAlunos.add(sc.nextLine());
			System.out.println("Digite o novo curso: ");
			cursoAlunos.add(sc.nextLine());
			System.out.println("Alteração feita com sucesso!");
		}
		else if(opcao == 6) {
			x++;
		}
		else {
			System.out.println("Comando desconhecido, tente outro");
		}
		}
		arq.close();
		sc.close();
		System.exit(0);
	}

}