public class PareImpar {
    public static void main(String[] args) {
        if (args.length%2 == 0) {
            for (int i = 0; i < args.length; ++i) {
                System.out.println("Hola, " + args[i]);
            }
        } else {
            for (int i = 0; i < args.length; ++i) {
                System.out.println("Hola, " + args[i]);
                System.out.println("Hola, " + args[i]);
            }
        }
    }
}
