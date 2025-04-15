public class TipoAltaVelocidad extends TipoDeViaje {
    @Override
    public double calcularDemora(Viaje viaje) {
        return viaje.getTrayecto().getDistancia() / 10.0;
    }
}