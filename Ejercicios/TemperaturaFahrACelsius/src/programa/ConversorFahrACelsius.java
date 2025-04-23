package programa;

//ECB
// Entidad
class Temperatura {
    double valor;
    boolean enCelsius;

    public Temperatura(double valor, boolean enCelisius) {
        this.valor = valor;
        this.enCelsius = enCelisius;
    }

    static Temperatura temperaturaEnGradosCelsius(double gradosC) {
        return new Temperatura(gradosC, true);
    }

    static Temperatura temperaturaEnGradosFahrenheit(double gradosF) {
        return new Temperatura(gradosF, false);
    }

    double enC(){
        if(enCelsius){
            return valor;
        } else {
            return (valor - 32) * 5 / 9;
        }
    }

    double enF(){
        if(!enCelsius){
            return valor;
        } else {
            return(valor * 9 / 5) + 32;

        }
        }    
}


// Controlador

class ConversorDeTemperaturaControlador {

    public String convertirACelsius(String temperaturaEnFahr){

        var temp = Temperatura.temperaturaEnGradosFahrenheit(Double.parseDouble(temperaturaEnFahr));
        temp.enCelsius = true;
        
        return String.format("%s °C", temp.enC());

    }
}


// Boundary o Interfaz

public class ConversorFahrACelsius {

    public static void main(String[] args) {
        var controlador = new ConversorDeTemperaturaControlador();

        for (int i = 0; i < args.length ; ++i) {
            String temperaturaEnFahr = args[i];
            String temperaturaEnCelsius = controlador.convertirACelsius(temperaturaEnFahr);
            System.out.println(temperaturaEnFahr + " F son " + temperaturaEnCelsius);
        }
    }
}