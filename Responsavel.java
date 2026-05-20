// RESPONSAVEL

public class Responsavel extends Pessoa {

    private Aluno[] alunos;

    public Responsavel(String nome, String fone,String cpf, Aluno[] alunos) {

        super(nome, fone, cpf);
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    @Override
    public String saudacao() {

        return "Olá, sou responsável pelos alunos.";
    }

    public String mostrarAlunos() {

        String texto =
                "Alunos do responsável "
                + getNome()
                + ":\n";

        for (Aluno aluno : alunos) {

            texto += "- "
                    + aluno.getNome()
                    + "\n";
        }

        return texto;
    }
}