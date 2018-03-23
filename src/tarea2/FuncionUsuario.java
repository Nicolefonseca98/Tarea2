
package tarea2;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicole
 */
public class FuncionUsuario {
    
    public void Funciones() {
        
        String menu = "";
        do {
        Datos dt = new Datos();
        int funcion;       
        String tipoUsuario = dt.pedirTipoUsuario();
        
            if(tipoUsuario.equals("Bibliotecario")) {
            funcion = Integer.parseInt(JOptionPane.showInputDialog("Funciones bibliotecario, ingrese un número\n"
                                                         + "Libros: \n"
                                                                  + "\t \t \t \t1. Agregar \n" 
                                                                  + "\t \t \t \t 2. Quitar \n"
                                                                  + "\t \t \t \t 3. Modificar \n"
                                                         + "Usuarios: \n" 
                                                                  + "\t  \t \t \t 4. Agregar \n" 
                                                                  + "\t  \t \t \t 5. Quitar \n"
                                                                  + "\t  \t \t \t 6. Modificar \n"
                                                         + "Autores: \n"
                                                                  + "\t  \t \t \t 7. Agregar \n"
                                                                  + "\t  \t \t \t 8. Quitar \n"
                                                                  + "\t  \t \t \t 9. Modificar"));                                                                
               switch (funcion) {
            case 1:
                dt.agregarLibro();
                break;
            case 2:
                dt.quitarLibro();
                break;
            case 3:
                dt.modificarLibro();
                break;
            case 4:
                dt.Lista();
                break;
            case 5:
                dt.quitarUsuario();
                break;
            case 6:
                dt.modificarUsuario();
                break;
            case 7:
                dt.Lista();
                        
                break;
            case 8:
                dt.quitarUsuario();
                break;
            case 9:
                dt.modificarUsuario();
                break;
                
                } //Fin switch                                         
            }
            else if (tipoUsuario.equals("Autor")) {
                dt.listaObras();
            }
            else if (tipoUsuario.equals("Usuario")) {
             dt.listaObras();
            }
            
         menu = JOptionPane.showInputDialog("Ingrese una 'm' para volver al menu principal o cualquier otro caracter para salir");
        } while(menu.equalsIgnoreCase("m"));
    }
    
}
