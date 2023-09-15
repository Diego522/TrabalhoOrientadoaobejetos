package Escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Registrar Professor");
            System.out.println("2. Registrar Aluno");
            System.out.println("3. Registrar Coordenador");
            System.out.println("4. Sair do Menu");

            int opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = ler.nextLine();
                    System.out.print("Idade: ");
                    int idade = ler.nextInt();
                    ler.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = ler.nextLine();
                    Professor professor = new Professor(nome, idade, disciplina);
                    System.out.println("Professor criado: " + professor.Dados());
                    break;

                case 2:
                    System.out.print("Nome: ");
                    nome = ler.nextLine();
                    System.out.print("Idade: ");
                    idade = ler.nextInt();
                    ler.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = ler.nextInt();
                    ler.nextLine();
                    Aluno aluno = new Aluno(nome, idade, matricula);
                    System.out.println("Aluno criado: " + aluno.Dados());
                    break;

                case 3:
                    System.out.print("Nome: ");
                    nome = ler.nextLine();
                    System.out.print("Idade: ");
                    idade = ler.nextInt();
                    ler.nextLine();
                    System.out.print("Disciplina: ");
                    disciplina = ler.nextLine();
                    System.out.print("Setor: ");
                    String setor = ler.nextLine();
                    Coordenador coordenador = new Coordenador(nome, idade, disciplina, setor);
                    System.out.println("Coordenador criado: " + coordenador.Dados());
                    break;

                case 4:
                    ler.close();
                    System.exit(0);

                default:
                    System.out.println("Opção digitada inválida. Por favor, escolha outra opção.");
                    break;
            }
        }
    }
}
