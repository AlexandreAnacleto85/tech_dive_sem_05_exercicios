package semana05;

public class Exercicio09 {
    static {
        System.out.println("dentro do bloco static");
    }

    {
        System.out.println("dentro do bloco de instancia");
    }

    Exercicio09() {
        System.out.println("dentro do construtor");
    }

    public static void main(String[] args) {
        new Exercicio09();
    }

}
