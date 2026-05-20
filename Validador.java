import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validador {

    // Valida texto comum (não pode ser vazio ou nulo)
    public static String validarTexto(String texto, String campo) throws DadoInvalidoException {
        if (texto == null || texto.trim().isEmpty()) {
            throw new DadoInvalidoException("O campo '" + campo + "' não pode estar vazio.");
        }
        return texto.trim();
    }

    // Valida números (ex: telefone, matrícula, código)
    public static String validarNumero(String valor, String campo) throws DadoInvalidoException {
        validarTexto(valor, campo);
        if (!valor.matches("\\d+")) {
            throw new DadoInvalidoException("O campo '" + campo + "' deve conter apenas números.");
        }
        return valor;
    }

    // Valida CPF simplificado (apenas se tem 11 dígitos numéricos)
    public static String validarCpf(String cpf) throws DadoInvalidoException {
        validarTexto(cpf, "CPF");
        String cpfLimpo = cpf.replaceAll("\\D", "");
        if (cpfLimpo.length() != 11) {
            throw new DadoInvalidoException("CPF inválido. Deve conter exatamente 11 dígitos.");
        }
        return cpfLimpo;
    }

    // Valida Data (formato DD/MM/AAAA, não futura, não absurda/passada)
    public static LocalDate validarData(String dataStr, String campo) throws DadoInvalidoException {
        validarTexto(dataStr, campo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            LocalDate data = LocalDate.parse(dataStr, formatter);
            LocalDate hoje = LocalDate.now();
            
            // Regra: Não pode ser no futuro
            if (data.isAfter(hoje)) {
                throw new DadoInvalidoException("A data do campo '" + campo + "' não pode ser uma data futura.");
            }
            
            // Regra: Não pode ser absurdamente antiga (ex: mais de 120 anos atrás)
            if (data.isBefore(hoje.minusYears(120))) {
                throw new DadoInvalidoException("A data do campo '" + campo + "' é antiga demais (absurda).");
            }
            
            return data;
        } catch (DateTimeParseException e) {
            throw new DadoInvalidoException("Formato de data inválido no campo '" + campo + "'. Use DD/MM/AAAA.");
        }
    }
}