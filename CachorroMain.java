//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CachorroMain {
    public static void main(String[] args) {

        //primeira instancia
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "fionna";
        cachorro1.idade = 7;
        cachorro1.raca = "viralata";
        cachorro1.corPelo = "marrom";
        cachorro1.acao = "farejar";

        //segunda instancia
        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "tobi";
        cachorro2.idade = 10;
        cachorro2.raca = "bulldog";
        cachorro2.corPelo = "branco";
        cachorro2.acao = "correr";

        cachorro1.apresentacaoCachorro();
        cachorro1.maisGostaDeFazer();

        System.out.println("----------------------------------------------------------------------");

        cachorro2.apresentacaoCachorro();
        cachorro2.maisGostaDeFazer();


    }
}

