package programa;

public class Figura {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo("Rectangulo", 2 , 2);
        System.out.println("El area del " + r.nombre + " es: " + r.calcularArea());

        Circulo c = new Circulo("Circulo", 1);
        System.out.println("El area del " + c.nombre + " es: " + c.calcularArea());    
    }
}
