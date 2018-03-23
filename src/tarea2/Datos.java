package tarea2;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicole
 */
public class Datos {

    /**
     * Lista que va a contener a los usuarios
     */
    static List<Usuario> lista = new ArrayList<Usuario>();

    public void Lista() {
        

        /**
         * Se guardan los datos que se le piden al usuario utilizando los
         * diferentes métodos para cada dato a ingresar
         */
        
        Usuario us = new Usuario(pedirNombreUnico(), pedirContraseña(), pedirNombreCompleto(), pedirTipoIdentificacion(),
                 pedirIdentificacion(), pedirTipoUsuario());

        /**
         * Añade cada usuario ingresado a la lista
         */
        
        lista.add(us);
        JOptionPane.showMessageDialog(null, "Usuario añadido");

        /**
         * Imprime la lista de usuarios
         */
        
        for (int i = 0; i <= lista.size() - 1; i++) {
            for (Usuario u : lista) {
                System.out.println(u.getNombreUnico() + u.getContraseña() + u.getNombreCompleto() + u.getIdentificacion() + u.getTipoIdentificacion()
                        + u.getTipoUsuario());
            } //Fin for each
        } //Fin for

    } //Fin Lista()

    /**
     * Métodos para solicitar al datos para agregar un nuevo usuario
     */
    public String pedirNombreUnico() {

        String nombreUnico = JOptionPane.showInputDialog("Ingrese su nombre de usuario");

        return nombreUnico;
    } //Fin pedirNombreUnico

    public String pedirContraseña() {

        String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña");
        String textoEncriptadoConMD5=DigestUtils.md5Hex(contraseña);
        return textoEncriptadoConMD5;
    } //Fin pedirContraseña

    public String pedirNombreCompleto() {

        String nomCompleto = JOptionPane.showInputDialog("Ingrese su nombre completo");

        return nomCompleto;
    } //Fin pedirNombreCompleto

    public String pedirTipoIdentificacion() {

        String tipoId = "";
        int id = Integer.parseInt(JOptionPane.showInputDialog("Tipo de identificación, ingrese un número\n"
                + "1. Cédula de identidad \n"
                + "2. Residencia \n"
                + "3. Pasaporte"));
        switch (id) {
            case 1:
                tipoId = "Cédula de identidad";
                break;
            case 2:
                tipoId = "Residencia";
                break;
            case 3:
                tipoId = "Pasaporte";
                break;
        }

        return tipoId;
    } //Fin pedirTipoIdentificación

    public String pedirIdentificacion() {

        String id = JOptionPane.showInputDialog("Ingrese su identificación");

        return id;
    } //Fin pedirIdentificación()

    public String pedirTipoUsuario() {

        String tipoUsuario = "";
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Usuario, ingrese un número \n"
                + "1. Bibliotecario\n"
                + "2. Autor \n"
                + "3. Usuario"));
        switch (tipo) {
            case 1:
                tipoUsuario = "Bibliotecario";
                break;
            case 2:
                tipoUsuario = "Autor";
                break;
            case 3:
                tipoUsuario = "Usuario";
                break;
        }

        return tipoUsuario;
    } //Fin pedirTipoUsuario()

    /**
     * Lista donde se van a guardar los libros
     */
    static List<Libro> listaLibros = new ArrayList<Libro>();

    /*
    * Se piden los datos necesarios 
    * para poder guardar un libro
     */
    public void agregarLibro() {

        String titulo = JOptionPane.showInputDialog("Título del libro");
        String autor = JOptionPane.showInputDialog("Autor del libro");
        String fecha = JOptionPane.showInputDialog("Fecha de publicación");
        Libro lb = new Libro(titulo, autor, fecha);

        listaLibros.add(lb);
        JOptionPane.showMessageDialog(null, "Libro añadido");

        for (int i = 0; i <= listaLibros.size() - 1; i++) {
            for (Libro l : listaLibros) {
                System.out.println(l.getAutor() + l.getTitulo() + l.getFecha());
                
            } //Fin for each
        } //Fin for

    } //Fin agregarLibro()

    /*
        * En el for se recorre la lista de libros
        * En el for each se recorre cada atributo de cada libro
        * Se toma el titulo del libro para buscar si coincide con 
        * el que se está buscando, si se encuentra el libro entonces
        * se elimina con .remove(), de lo contrario manda un mensaje
        * avisandole al usuario que el libro buscado no existe
     */
    public void quitarLibro() {

        String nombreLibro = JOptionPane.showInputDialog("Ingrese el título del libro que desea eliminar");
        if (existeLibro(nombreLibro)) {
            Libro l = getLibro(nombreLibro);

            listaLibros.remove(l);
            JOptionPane.showMessageDialog(null, "Libro eliminado");

        }
        else
            JOptionPane.showMessageDialog(null, "El libro no existe");
        
        System.out.println(listaLibros.toString());
    } //Fin quitarLibro
    
    /*
    * Se pide al usuario el nombre del libro a modificar, se busca en la lista
    * de libros con el título del mismo, si se encuentra se modifica solo la fecha de 
    * actualizacion del libro
     */
    public void modificarLibro() {

        String nombreLibro = JOptionPane.showInputDialog("Ingrese el título del libro que desea modificar");
        if (existeLibro(nombreLibro)) {
            String nuevaFecha = JOptionPane.showInputDialog("Libro encontrado, ingrese la nueva fecha");
            Libro fechaVieja = getLibro(nombreLibro);
            fechaVieja.setFecha(nuevaFecha);
        }
        System.out.println(listaLibros.toString());

    } //Fin modificarLibro()

    public Libro getLibro(String nombreLibro) {
        for (int i = 0; i <= listaLibros.size() - 1; i++) {
            Libro l = (Libro) listaLibros.get(i);
            if (l.getTitulo().equalsIgnoreCase(nombreLibro)) {
                return l;
            }
        }
        return null;
    }

    private boolean existeLibro(String nombreLibro) {
        for (int i = 0; i <= listaLibros.size() - 1; i++) {
            Libro l = (Libro) listaLibros.get(i);
            String n = l.getTitulo();
            if (n.equals(nombreLibro)) {
                return true;
            }

        }
        return false;
    }

    /**
     * El método utilizado es similar a quitarLibro() solo se cambian los datos,
     * además, se utiliza para quitar a usuarios y autores
     */
    public void quitarUsuario() {

        String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario que desea eliminar");
        if (existeUsuario(nombreUsuario)) {
            Usuario u = getUsuario(nombreUsuario);

            lista.remove(u);
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
        }
        else
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        
        System.out.println(lista.toString());
        
    } //Fin quitarUsuario()

    /*
    * Se utiliza método similar a modificarLibro, solo 
    * se cambian los datos
     */
    public void modificarUsuario() {
        
        System.out.println("SIZE " + lista.size());

        String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario que desea modificar");
        if (existeUsuario(nombreUsuario)) {
            String nuevoUsuario = JOptionPane.showInputDialog("Usuario encontrado, ingrese el nuevo nombre de usuario");
            Usuario uViejo = getUsuario(nombreUsuario);
            uViejo.setNombreUnico(nuevoUsuario);
        }
        System.out.println(lista.toString());

    } //Fin modificarUsuario()

    public Usuario getUsuario(String nombreUsuario) {
        for (int i = 0; i <= lista.size() - 1; i++) {
            Usuario u = (Usuario) lista.get(i);
            if (u.getNombreUnico().equalsIgnoreCase(nombreUsuario)) {
                return u;
            }
        }
        return null;
    }

    private boolean existeUsuario(String nombreUsuario) {
        for (int i = 0; i <= lista.size() - 1; i++) {
            Usuario u = (Usuario) lista.get(i);
            String n = u.getNombreUnico();
            if (n.equals(nombreUsuario)) {
                return true;
            }

        }
        return false;
    }

    public void listaObras() {

        JOptionPane.showMessageDialog(null, listaLibros.toString());
    }


}
