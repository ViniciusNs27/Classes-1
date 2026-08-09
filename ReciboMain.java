public class ReciboMain {

    public static void main(String[] args) {

        // Primeiro objeto
        Recibo recibo1 = new Recibo();

        recibo1.numero = 1;
        recibo1.valor = 1530.50;
        recibo1.nomePagador = "João Francisco Mendes Rocha Azevedo";
        recibo1.cpfPagador = "222.222.222-22";
        recibo1.nomeRecebedor = "Maria Francisca Mendes Rocha Azevedo";


        // Segundo objeto
        Recibo recibo2 = new Recibo();

        recibo2.numero = 2;
        recibo2.valor = 850.00;
        recibo2.nomePagador = "Carlos Silva";
        recibo2.cpfPagador = "111.111.111-11";
        recibo2.nomeRecebedor = "Ana Silva";


        // Utilizando os métodos
        recibo1.exibirRecibo();
        recibo1.confirmarPagamento();

        System.out.println();

        recibo2.exibirRecibo();
        recibo2.confirmarPagamento();
    }
}