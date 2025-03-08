public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        if (args.length == 2) {
            System.out.println("Hola, " + args[1]);
        }
        for (int i = 0 ; i < args.length ; ++i) {
            System.out.println("Hola, " + args[i]);
        }
    }
}
