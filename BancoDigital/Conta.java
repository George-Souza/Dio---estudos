public abstract class Conta implements ContaInterface{
    
    protected final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
        }
        else{
            System.out.println("Não é possível realizar o saque");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInformacoes(){
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getNumero(){
        return numero;
    }

    public int getAgencia(){
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getCliente(){
        return cliente.getNome();
    }

}
