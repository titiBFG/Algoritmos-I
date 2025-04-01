//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// ENTITY
public class Marcador {
    private double carga;
    private boolean daniado;
    private String color;

    Marcador(String color) {
        this.color = color;
        this.carga = 0.0;
        this.daniado = false;
    }

    public boolean getDisponibilidad() {
        return this.carga > 0.1 && !this.daniado;
    }

    public void setCarga(double carga) {
        if ((carga <= 1) && (carga >= 0)) {
            this.carga = carga;
        }
    }

    public void seDanio() {
        this.daniado = true;
    }
}