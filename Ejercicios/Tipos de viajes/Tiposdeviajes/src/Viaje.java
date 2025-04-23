public class Viaje {
    private Trayecto trayecto;
    private int cantidadVagones;
    private int capacidadMaximaPasajeros;
    private TipoDeViaje tipo;

    public Viaje(Trayecto trayecto, int cantidadVagones, int capacidadMaximaPasajeros, TipoDeViaje tipo) {
        this.trayecto = trayecto;
        this.cantidadVagones = cantidadVagones;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
        this.tipo = tipo;
    }

    public double tiempoDeDemora() {
        return tipo.calcularDemora(this);
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }

    public int getCapacidadMaximaPasajeros() {
        return capacidadMaximaPasajeros;
    }
}