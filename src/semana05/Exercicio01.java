package semana05;

public class Exercicio01 {
    String soName;
    long maxMemory;
    long allocatedMemory;
    long freeMemory;

    public Exercicio01() {
        soName =          System.getProperty("os.name");
        maxMemory =       Runtime.getRuntime().maxMemory();
        allocatedMemory = Runtime.getRuntime().totalMemory();
        freeMemory =      Runtime.getRuntime().freeMemory();
    }

    @Override
    public String toString() {
        return ("SO =             '%s'      %n" +
                "maxMemory =       %d Bytes %n" +
                "allocatedMemory = %d Bytes %n" +
                "freeMemory =      %d Bytes").formatted(soName, maxMemory, allocatedMemory, freeMemory);
    }

    public static void main(String[] args) {
        Exercicio01 system = new Exercicio01();
        System.out.println(system.toString());
    }
}
