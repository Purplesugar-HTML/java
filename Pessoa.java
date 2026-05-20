// PESSOA

public class Pessoa {

    private String nome;
    private String fone;
    private String cpf;

    public Pessoa(String nome, String fone, String cpf) {

        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getCpf() {
        return cpf;
    }

    // POLIMORFISMO
    public String saudacao() {

        return "Olá, meu nome é " + nome;
    }
}