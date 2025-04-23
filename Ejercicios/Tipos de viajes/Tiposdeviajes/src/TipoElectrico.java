public class TipoElectrico extends TipoDeViaje {
    @Override
    public double calcularDemora(Viaje viaje) {
        Trayecto t = viaje.getTrayecto();
        return (t.getDistancia() * t.getCantidadEstaciones()) / 2;
    }
}

