public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public double calcularCostoAlquiler(int dias) {
        return this.precioBase * dias;
    }
    public String toString() {
        return String.format("Marca: %s, Modelo: %s, Precio Base: %f", marca, modelo, precioBase);
    }
}

