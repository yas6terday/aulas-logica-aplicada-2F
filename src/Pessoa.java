public class Pessoa extends Animal {

    // Atributos em classe

    public String sobrenome;

    //Método da classe
    public void falar () {
        System.out.println("falei");
    }
    public String falar (String volume) {
        return "falei " + volume;
    }
    // Sobrescrita do método
    public void comer() {
        System.out.println("pessoa comeu");
    }
}
