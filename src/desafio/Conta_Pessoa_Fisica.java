package desafio;

public class Conta_Pessoa_Fisica extends Conta {
    private String cpf;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String imprimir() {
        return "Conta_Pessoa_Fisica{" +
                "cpf='" + this.cpf + '\'' +
                '}' + toString();
    }
}
