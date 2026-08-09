public class Recibo {

    // 5 atributos
    int numero;
    double valor;
    String nomePagador;
    String cpfPagador;
    String nomeRecebedor;


    // Método 1
    public void exibirRecibo() {

        System.out.println("========== RECIBO ==========");
        System.out.println("Número: " + numero);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Pagador: " + nomePagador);
        System.out.println("CPF: " + cpfPagador);
        System.out.println("Recebedor: " + nomeRecebedor);
        System.out.println("============================");
    }


    // Método 2
    public void confirmarPagamento() {

        System.out.println("Pagamento de R$ " + valor + " confirmado!");
    }
}