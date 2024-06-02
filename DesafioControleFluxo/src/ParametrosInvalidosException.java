public class ParametrosInvalidosException extends Exception {
    public String mensagem() {
        return "O primeiro parâmetro deve ser menor que o segundo";
    }
}
