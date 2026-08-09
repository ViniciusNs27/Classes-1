//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PessoaMain {

    public static void main(String[] args) {

        //primeira instância
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Shigeru Miyamoto";
        pessoa1.idade = 73;
        pessoa1.altura = 1.65;
        pessoa1.nacionalidade = "Japones";
        pessoa1.profissao = "Game Dev";
        pessoa1.trabalho = "Super Mario Galaxy: o filme";

        //segunda instância
        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Michael Jackson";
        pessoa2.idade = 50;
        pessoa2.altura = 1.75;
        pessoa2.nacionalidade = "Estadunidense";
        pessoa2.profissao = "Artista Musical";
        pessoa2.trabalho = "This Is It";


        pessoa1.apresentar();
        pessoa1.ultimoTrabalho();

        System.out.println("----------------------------------------------------------------------");


        pessoa2.apresentar();
        pessoa2.ultimoTrabalho();
    }
}
