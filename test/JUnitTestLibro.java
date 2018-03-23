
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tarea2.Libro;


public class JUnitTestLibro {
    
    static Libro libroPrueba;
    
    @Before
    public void setUpBeforeClass() throws Exception {
	
	libroPrueba = new Libro();
	
	}
 
	@Test
	public void testTituloInvalido() {

	String valorPrueba= "@";
	libroPrueba.setTitulo(valorPrueba);
	String retorno = libroPrueba.getTitulo();
	assertEquals(valorPrueba, retorno);
        
        }      
        
        @Test
	public void testTituloVacio() {

	String valorPrueba= " ";
	libroPrueba.setTitulo(valorPrueba);
	String retorno = libroPrueba.getTitulo();
	assertEquals(valorPrueba, retorno);
        
        }
        
        @Test
	public void testTituloConNumeros() {

	String valorPrueba= "123";
	libroPrueba.setTitulo(valorPrueba);
	String retorno = libroPrueba.getTitulo();
	assertEquals(valorPrueba, retorno);
        
        }
        
        @Test
	public void testAutorVacio() {

	String valorPrueba = " ";
	libroPrueba.setAutor(valorPrueba);
	String retorno = libroPrueba.getAutor();
	assertEquals(valorPrueba, retorno);
        
        }
        
        @Test
	public void testFechaVacia() {

	String valorPrueba = " ";
	libroPrueba.setFecha(valorPrueba);
	String retorno = libroPrueba.getFecha();
	assertEquals(valorPrueba, retorno);
     
        }
}
