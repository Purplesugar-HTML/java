// FUNCIONARIO

public class Funcionario extends Pessoa {

    private String cod;
    private String funcao;

    public Funcionario(String nome, String fone,String cpf, String cod, String funcao) {

        super(nome, fone, cpf);

        this.cod = cod;
        this.funcao = funcao;
    }

    public String getCod() {
        return cod;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String saudacao() {

        return "Olá, sou funcionário e trabalho como "
                + funcao;
    }

    public String desempenhaFuncao() {

        return getNome()
                + " trabalha como "
                + funcao;
    }
}