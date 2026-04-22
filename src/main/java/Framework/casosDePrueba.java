package Framework;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Para practicar cualquier flujo de prueba que quieran automatizar, pueden utilizar paginas como:
// - Swag Labs (https://www.saucedemo.com/"): interfaz sencilla y de rapida respuesta, pueden simular (para validar) sesiones de usuario erroneas como problemas generales de carga y renderizado.
// - Simple. (https://sauce-demo.myshopify.com/): interfaz compleja, representa mayores de safios a la hora de identificar elementos y la interaccion en los tiempos que corresponden, puede requerir validaciones de estado de objetos como tiempo de cargas parametrizados.

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class casosDePrueba extends configuracionBase
{
    @Test @Order(1)
    public void CasoDePrueba1() throws Exception {
        // Todo...
    }
}
