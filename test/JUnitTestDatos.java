
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tarea2.Datos;

public class JUnitTestDatos {
    
    static Datos datosPrueba;
    
    @Before
    public void setUpBeforeClass() throws Exception {
	
	datosPrueba = new Datos();
	
	}
 
	@Test
	public void testNombreUnicoInvalido() {

	String valorPrueba= "@";
	String retorno = datosPrueba.pedirNombreUnico();
	assertEquals(valorPrueba, retorno);
        
        }    
        
        @Test
	public void testNombreCompletoVacio() {

	String valorPrueba= " ";
	String retorno = datosPrueba.pedirNombreCompleto();
	assertEquals(valorPrueba, retorno);
        
        }
        
        @Test
	public void testContraseñaConNumeros() {

	String valorPrueba= "abc123";
	String retorno = datosPrueba.pedirContraseña();
	assertEquals(valorPrueba, retorno);
        
        }
       
        @Test
	public void testIdentificacionConNumerosLetras() {

	String valorPrueba= "abc123";
	String retorno = datosPrueba.pedirIdentificacion();
	assertEquals(valorPrueba, retorno);
        
        }
       
}

