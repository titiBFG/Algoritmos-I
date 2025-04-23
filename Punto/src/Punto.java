public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true; /*Si son el mismo */
        }
        if (this == null){
            return false; /*Si el otro es null */
        }
        if (!(o instanceof Punto)){
            return false; /* si otro no es una instancia de Punto */
        }
        Punto otro = (Punto) o;
        if(this.x == otro.x && this.y == otro.y){
            return true;
        }
        return false; 
    }
}