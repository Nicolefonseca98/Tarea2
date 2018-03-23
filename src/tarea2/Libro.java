
package tarea2;

/**
 *
 * @author Nicole
 */
public class Libro {
  
     private String titulo;
     private String autor;
     private String fecha;

    public Libro() {
    }

    public Libro(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    
    public String getTitulo() {
        return titulo;
    }

   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
    public String getAutor() {
        return autor;
    }

 
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }
     
}
