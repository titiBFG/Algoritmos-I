public class App {
    public static void main(String[] args) {
        var p1 = new Punto(1.0, 1.0);
        var p2 = p1;
        var p3 = new Punto(1.0, 1.0);

        if (p1 == p2){
            System.out.println("Son el mismo");
        } 
        if (p1.equals(p3)) {
            System.out.println("Son iguales");
        }
    }
}
