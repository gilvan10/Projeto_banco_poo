import desafio.Conta;
import desafio.Conta_Pessoa_Fisica;
import desafio.Conta_Pessoa_Juridica;
import desafio.Endereco;

public class Main {
    public static void main(String[] args) {
        Conta juridica = new Conta_Pessoa_Juridica();
        ((Conta_Pessoa_Juridica) juridica).setCnpj("10.000.001/0002-05");
        juridica.setNome("Gilvan");
        juridica.setSaldo(100.00);

        Conta fisica = new Conta_Pessoa_Fisica();
        ((Conta_Pessoa_Fisica) fisica).setCpf("988.133.786-27");
        fisica.setNome("João");
        fisica.setSaldo(200.00);

        Endereco endereco = new Endereco();
        endereco.setPais("Brasil");
        endereco.setEstado("Bahia");
        endereco.setCidade("Nova Soure");
        endereco.setBairro("Fatima");
        endereco.setRua("Rua tal");
        endereco.setNumero(1000);
        endereco.setCep("48460-000");

        Endereco endereco2 = new Endereco();
        endereco2.setPais("Brasil");
        endereco2.setEstado("Bahia");
        endereco2.setCidade("Nova Soure");
        endereco2.setBairro("Fatima");
        endereco2.setRua("Rua tal da Silva");
        endereco2.setNumero(2000);
        endereco2.setCep("48460-000");

        juridica.setEndereco(endereco);
        fisica.setEndereco(endereco2);
        System.out.println(((Conta_Pessoa_Juridica) juridica).imprimir());
        System.out.println(((Conta_Pessoa_Fisica) fisica).imprimir());

    }
}
