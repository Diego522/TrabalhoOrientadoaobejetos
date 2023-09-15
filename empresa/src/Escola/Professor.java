package Escola;

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public String Dados() {
        return super.Dados() + ", Disciplina: " + disciplina;
    }
}