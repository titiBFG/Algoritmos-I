public class Libro extends Medio {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo Libro \" " + this.titulo + "\" por " + this.autor);
    }

}
