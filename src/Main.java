public class Main {
    public static void main(String[] args) {

        // Aula de orientação de objetos
        // Declarar objetos
        Pessoa adao;

        // Instanciar objeto
        adao = new Pessoa();
        Pessoa eva = new Pessoa();

        // Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";

        // Acionar comportamento
        adao.falar();
        eva.falar();

        // Criar mais objetos
        Pessoa qualquer = new Pessoa();

        // Declarar objeto
        Pessoa rainha;

        // Instância ou objeto
        rainha = new Pessoa();

        // Definindo forma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";

        // Definição de comportamento
        System.out.println(rainha.falar("alto"));
        rainha.comer();

    }
}