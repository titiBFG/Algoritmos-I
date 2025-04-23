public class PruebaCalculadoraAvanzada {
    public static void main(String[] args) {
        // Instanciamos la calculadora
        CalculadoraAvanzada calc = new CalculadoraAvanzada();
        
        // Operaciones usando números enteros
        int sumaEnteros = calc.sumar(5, 3);
        int restaEnteros = calc.restar(10, 4);
        int multiplicacionEnteros = calc.multiplicar(2, 3);
        int divisionEnteros = calc.dividir(10, 2);
        
        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Resta de enteros: " + restaEnteros);
        System.out.println("Multiplicación de enteros: " + multiplicacionEnteros);
        System.out.println("División de enteros: " + divisionEnteros);
        
        // Operaciones usando números de punto flotante (double)
        double sumaDoubles = calc.sumar(2.5, 3.5);
        double restaDoubles = calc.restar(7.0, 2.5);
        double multiplicacionDoubles = calc.multiplicar(2.0, 4.0);
        double divisionDoubles = calc.dividir(9.0, 3.0);
        
        System.out.println("Suma de doubles: " + sumaDoubles);
        System.out.println("Resta de doubles: " + restaDoubles);
        System.out.println("Multiplicación de doubles: " + multiplicacionDoubles);
        System.out.println("División de doubles: " + divisionDoubles);
    }
}
