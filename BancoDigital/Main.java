import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente janilson = new Cliente();
        janilson.setNome("Janilson");
        
        Conta cc = new ContaCorrente(janilson);
        Conta poupanca = new ContaPoupanca(janilson);
        List<Conta> contas = new ArrayList<>();
        Banco novo = new Banco();

        contas.add(cc);
        contas.add(poupanca);
        
        novo.setContas(contas);
        cc.depositar(200);
        poupanca.depositar(400);
        cc.imprimirInformacoes();
        cc.transferir(100, poupanca);
        poupanca.imprimirInformacoes();
    }
}
