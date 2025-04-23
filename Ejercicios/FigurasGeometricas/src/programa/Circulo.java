package programa;

public class Circulo extends Figuras{
    
    double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

}
