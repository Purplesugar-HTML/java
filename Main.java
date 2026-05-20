import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String[] opcoes = {"Texto (Console)", "Interface Gráfica (GUI)"};
        
        // Pergunta inicial usando GUI apenas para escolher o modo
        int escolha = JOptionPane.showOptionDialog(
                null, 
                "Escolha o modo de execução:", 
                "Sistema Escolar", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
        );

        if (escolha == 0) {
            rodarModoTexto();
        } else if (escolha == 1) {
            rodarModoGUI();
        }
    }

    // ================= MODO TEXTO =================
    private static void rodarModoTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- MODO TEXTO INICIADO ---");
        
        Aluno a1 = null;
        // Loop de repetição com try-catch para garantir que o dado entre correto
        while (a1 == null) {
            try {
                System.out.print("Nome do aluno: ");
                String nome = Validador.validarTexto(scanner.nextLine(), "Nome");

                System.out.print("Telefone do aluno (apenas números): ");
                String fone = Validador.validarNumero(scanner.nextLine(), "Telefone");

                System.out.print("CPF do aluno (11 dígitos): ");
                String cpf = Validador.validarCpf(scanner.nextLine());

                System.out.print("Matrícula do aluno: ");
                String mtr = Validador.validarNumero(scanner.nextLine(), "Matrícula");

                a1 = new Aluno(nome, fone, cpf, mtr);
            } catch (DadoInvalidoException e) {
                System.out.println("[ERRO] " + e.getMessage() + " Tente novamente.\n");
            }
        }

        // Criando os objetos fixos (valores já válidos)
        Professor p1 = new Professor("Pedro", "98888", "12345678901", "002", "Mestre");
        Funcionario f1 = new Funcionario("Lucas", "97777", "98765432100", "C01", "Coordenador");
        Aluno[] alunos = {a1};
        Responsavel r1 = new Responsavel("Juliana", "96666", "11122233344", alunos);

        Pessoa[] pessoas = {a1, p1, f1, r1};

        // Exibindo resultados no Console
        System.out.println("\n--- RESULTADO DO SISTEMA ---");
        for (Pessoa p : pessoas) {
            System.out.println(p.saudacao());
        }
        System.out.println("\n" + r1.mostrarAlunos());
        scanner.close();
    }

    // ================= MODO GUI =================
    private static void rodarModoGUI() {
        Aluno a1 = null;

        while (a1 == null) {
            try {
                String nome = Validador.validarTexto(JOptionPane.showInputDialog("Nome do aluno:"), "Nome");
                String fone = Validador.validarNumero(JOptionPane.showInputDialog("Telefone do aluno (apenas números):"), "Telefone");
                String cpf = Validador.validarCpf(JOptionPane.showInputDialog("CPF do aluno (11 dígitos):"));
                String mtr = Validador.validarNumero(JOptionPane.showInputDialog("Matrícula do aluno:"), "Matrícula");

                a1 = new Aluno(nome, fone, cpf, mtr);
            } catch (DadoInvalidoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                
                // Se o usuário fechar a janela ou cancelar, interrompe o programa
                int continuar = JOptionPane.showConfirmDialog(null, "Deseja tentar preencher novamente?", "Continuar?", JOptionPane.YES_NO_OPTION);
                if (continuar != JOptionPane.YES_OPTION) {
                    return; 
                }
            }
        }

        Professor p1 = new Professor("Pedro", "98888", "12345678901", "002", "Mestre");
        Funcionario f1 = new Funcionario("Lucas", "97777", "98765432100", "C01", "Coordenador");
        Aluno[] alunos = {a1};
        Responsavel r1 = new Responsavel("Juliana", "96666", "11122233344", alunos);

        Pessoa[] pessoas = {a1, p1, f1, r1};

        String resultado = "";
        for (Pessoa p : pessoas) {
            resultado += p.saudacao() + "\n\n";
        }
        resultado += r1.mostrarAlunos();

        JOptionPane.showMessageDialog(null, resultado, "Sistema Escolar - GUI", JOptionPane.INFORMATION_MESSAGE);
    }
}