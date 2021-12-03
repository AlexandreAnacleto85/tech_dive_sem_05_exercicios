package semana05;

public class Exercicio10 {
    class Inner {
        Inner () {
            System.out.println("Inner instantiated");
        }
        public void method () {
            System.out.println("method from Inner");
        }
    }

    Inner innerAnonymous = new Inner() {
        public void method() {
            System.out.println("method from Inner Anonymous");
        }
    };

    public static class InnerStatic {
        InnerStatic () {
            System.out.println("InnerStatic instantiated");
        }

    }

    public void method () {
        class InnerLocal {
            InnerLocal () {
                System.out.println("InnerLocal instantiated");
            }
        }
        new InnerLocal();
    }

    public static void main(String[] args) {
        Exercicio10.InnerStatic innerStatic = new Exercicio10.InnerStatic(); // classe interna estatica instanciada

        Exercicio10 enclosing = new Exercicio10();                           // classe interna anonima instanciada
        enclosing.innerAnonymous.method();

        Inner inner = enclosing.new Inner();                                     // classe interna instanciada

        enclosing.method();                                                      // classe interna local instanciada
    }
}
