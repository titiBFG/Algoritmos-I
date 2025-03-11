public class TodosPares {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; ++i) {

            if (args[i].length()%2 == 0) {
                System.out.println(args[i]);
            } else {
                System.out.println(args[i] + args[i]);
            }

        }
    }
}
