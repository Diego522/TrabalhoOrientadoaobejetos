package Escola;

class Coordenador extends Professor {
    private String setor;

    public Coordenador (String nome, int idade, String disciplina, String setor) {
        super(nome, idade, disciplina);
        this.setor = setor;
    }

    @Override
    public String Dados() {
        return super.Dados() + ", Setor: " + setor;
    }
}