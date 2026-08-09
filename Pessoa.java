 class Pessoa {

    String nome;
    int idade;
    double altura;
    String nacionalidade;
    String profissao;
    String trabalho;


    public void apresentar(){
        System.out.println("meu nome é: " + nome);
        System.out.println("minha idade é: " + idade);
        System.out.println("Minha altura é: " + altura);
        System.out.println("minha nacionalidade é: " + nacionalidade);
        System.out.println("minha profissão é: " + profissao);

    }

    public void ultimoTrabalho(){
        System.out.println("meu ultimo trabalho foi: " + trabalho);
    }

}
