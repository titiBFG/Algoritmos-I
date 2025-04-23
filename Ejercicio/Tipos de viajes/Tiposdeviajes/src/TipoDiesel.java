public class TipoDiesel extends TipoDeViaje {
    @Override
    public double calcularDemora(Viaje viaje) {
        Trayecto t = viaje.getTrayecto();
        return (t.getDistancia() * t.getCantidadEstaciones()) / 2 
               + (t.getCantidadEstaciones() + viaje.getCapacidadMaximaPasajeros()) / 10.0;
    }
}