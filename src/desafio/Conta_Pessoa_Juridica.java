package desafio;

public class Conta_Pessoa_Juridica extends Conta {
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String imprimir() {
        return "Conta_Pessoa_Juridica{" +
                "cnpj='" + this.cnpj + '\'' +
                '}' +toString();
    }
}
