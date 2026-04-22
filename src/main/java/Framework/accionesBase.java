package Framework;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class accionesBase extends configuracionBase
{
    private static final Integer esperaAccion = 500;

    public static void Click(String rutaElemento) throws Exception {
        // Estabilización: Tiempo de espera para asegurar que el DOM esté listo.
        Thread.sleep(esperaAccion);

        // Localización: Identificación del elemento mediante su ruta XPath.
        WebElement botonEnviar = Driver.findElement(By.xpath(rutaElemento));

        // Interacción: Ejecución del evento de click.
        botonEnviar.click();
    }

    public static void Escribir(String rutaElemento, String ingresoTexto) throws Exception {
        // Estabilización: Breve pausa antes de la interacción de teclado.
        Thread.sleep(esperaAccion);

        // Localización: Identificación del campo de texto.
        WebElement userTextBox = Driver.findElement(By.xpath(rutaElemento));

        // Interacción: Envío de la cadena de caracteres al elemento.
        userTextBox.sendKeys(ingresoTexto);
    }

    public static String LeerTexto(String rutaElemento) throws Exception {
        // Estabilización: Espera para asegurar que el texto se haya renderizado.
        Thread.sleep(esperaAccion);

        // Localización: Identificación del elemento que contiene la información.
        WebElement tituloProducto = Driver.findElement(By.xpath(rutaElemento));

        // Extracción: Captura y retorno del valor de texto del elemento.
        return tituloProducto.getText();
    }

    public static void CompararTexto (String rutaElemento, String Esperado, String Mensaje) throws Exception {
        // Obtención de datos: Se invoca al método de lectura para obtener el valor real.
        String Actual = LeerTexto(rutaElemento);

        // Verificación: Comparación mediante aserción de JUnit para validar el resultado.
        Assertions.assertEquals(Esperado, Actual, Mensaje);
    }
}