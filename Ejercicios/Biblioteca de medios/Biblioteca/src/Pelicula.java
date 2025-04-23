public class Pelicula extends Medio{
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director){
        this.titulo = titulo;
        this.director = director;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo Pelicula \" " + this.titulo + "\" por " + this.director);
    }
}
