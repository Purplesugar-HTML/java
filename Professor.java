// PROFESSOR

public class Professor extends Aluno {

    private String titulo;

    public Professor(String nome, String fone, String cpf, String mtr,String titulo) {

        super(nome, fone, cpf, mtr);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String saudacao() {

        return "Olá, sou o professor "
                + getNome()
                + ", título: "
                + titulo;
    }

    public String ensina() {

        return getNome() + " está ensinando.";
    }
}