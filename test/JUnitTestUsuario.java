
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tarea2.Usuario;

/**
 *
 * @author Nicole
 */
public class JUnitTestUsuario {

    static Usuario usuarioPrueba;

    @Before
    public void setUpBeforeClass() throws Exception {

        usuarioPrueba = new Usuario();

    }

    @Test
    public void testTipoIdentificacionInvalido() {

        String valorPrueba = "@";
        usuarioPrueba.setIdentificacion(valorPrueba);
        String retorno = usuarioPrueba.getIdentificacion();
        assertEquals(valorPrueba, retorno);
    }

    @Test
    public void testTipoIdentificacionVacio() {
        String valorPrueba = " ";
        usuarioPrueba.setIdentificacion(valorPrueba);
        String retorno = usuarioPrueba.getIdentificacion();
        assertEquals(valorPrueba, retorno);
    }

    @Test
    public void testUsuarioInvalido() {

        String valorPrueba = "@";
        usuarioPrueba.setTipoUsuario(valorPrueba);
        String retorno = usuarioPrueba.getTipoUsuario();
        assertEquals(valorPrueba, retorno);

    }
    
    @Test
    public void testUsuarioVacio() {
        
        String valorPrueba = " ";
        usuarioPrueba.setTipoUsuario(valorPrueba);
        String retorno = usuarioPrueba.getTipoUsuario();
        assertEquals(valorPrueba, retorno);
    }
    

    @Test
    public void testNombreConNumeros() {

        String valorPrueba = "123abc";
        usuarioPrueba.setNombreCompleto(valorPrueba);
        String retorno = usuarioPrueba.getNombreCompleto();
        assertEquals(valorPrueba, retorno);
 
    }
    
    @Test public void testNombreVacio() {
        
        String valorPrueba = " ";
        usuarioPrueba.setNombreCompleto(valorPrueba);
        String retorno = usuarioPrueba.getNombreCompleto();
        assertEquals(valorPrueba, retorno);
        
    }

    @Test
    public void testIdentificacionVacia() {

        String valorPrueba = " ";
        usuarioPrueba.setIdentificacion(valorPrueba);
        String retorno = usuarioPrueba.getIdentificacion();
        assertEquals(valorPrueba, retorno);

    }

    @Test
    public void testNombreUnicoVacio() {

        String valorPrueba = " ";
        usuarioPrueba.setNombreUnico(valorPrueba);
        String retorno = usuarioPrueba.getNombreUnico();
        assertEquals(valorPrueba, retorno);

    }
    
    @Test
    public void testNombreUnicoConNumeros() {
        
        String valorPrueba = "123";
        usuarioPrueba.setNombreUnico(valorPrueba);
        String retorno = usuarioPrueba.getNombreUnico();
        assertEquals(valorPrueba, retorno);
        
    }
}
