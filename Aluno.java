// ALUNO

public class Aluno extends Pessoa {

    private String mtr;

    public Aluno(String nome, String fone,String cpf, String mtr) {

        super(nome, fone, cpf);
        this.mtr = mtr;
    }

    public String getMtr() {
        return mtr;
    }

    @Override
    public String saudacao() {

        return "Oi, eu sou o aluno " + getNome();
    }

    public String aprende() {

        return getNome() + " está aprendendo.";
    }
}