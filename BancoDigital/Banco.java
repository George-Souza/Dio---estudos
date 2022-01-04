import java.util.List;

public class Banco{

    private String nome;
    private List<Conta> contas;
    

    public void showClientes(){
        System.out.println("Lista de Clientes:");
        for(Conta n: contas){
            System.out.println(n.getCliente());
        }
    }
    
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}