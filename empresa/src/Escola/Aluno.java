package Escola;

class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String Dados() {
        return super.Dados() + ", Matrícula: " + matricula;
    }
}
