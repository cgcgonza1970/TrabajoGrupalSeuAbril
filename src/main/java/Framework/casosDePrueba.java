package Framework;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Sitio bajo prueba: Swag Labs — https://www.saucedemo.com/
//
// Flujo cubierto:
//   Test 1 — Navegación a la página base (validada en BeforeAll de configuracionBase).
//   Test 2 — Inicio de sesión con credenciales válidas.
//   Test 3 — Validación de ingreso exitoso mediante el título "Products".
//   Test 4 — Selección de un producto y verificación de su vista de detalle.
//   Test 5 — Agregar el producto al carrito y verificar el badge del ícono.

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class casosDePrueba extends configuracionBase
{
    // ─────────────────────────────────────────────────────────────────
    // Test 1: Verificar que la página base carga correctamente.
    //         La navegación a UrlDemo ocurre en BeforeAll; aquí solo
    //         se confirma que el logo de la pantalla de Login es visible.
    // ─────────────────────────────────────────────────────────────────
    @Test @Order(1)
    public void Test1_NavegacionPaginaBase() throws Exception {
        System.out.println("Test 1: Verificando carga de la pagina de Login.");

        // Validación: El logo "Swag Labs" debe estar presente al cargar la URL.
        accionesBase.CompararTexto(
                objetosDePagina.Login_login_logo,
                "Swag Labs",
                "ERROR: La pagina base no cargo correctamente!");
    }

    // ─────────────────────────────────────────────────────────────────
    // Test 2: Iniciar sesión con credenciales válidas.
    // ─────────────────────────────────────────────────────────────────
    @Test @Order(2)
    public void Test2_InicioSesion() throws Exception {
        System.out.println("Test 2: Iniciando sesion con usuario valido.");

        // Acción: Se invoca la función de negocio Login que incluye su propia validación.
        funcionesDeNegocio.Login(Username, Password);
    }

    // ─────────────────────────────────────────────────────────────────
    // Test 3: Validar el ingreso exitoso verificando el título "Products".
    //         Depende del estado de sesión dejado por Test 2.
    // ─────────────────────────────────────────────────────────────────
    @Test @Order(3)
    public void Test3_ValidarIngresoExitoso() throws Exception {
        System.out.println("Test 3: Validando presencia del catalogo de productos.");

        // Validación explícita: El catálogo debe mostrar el encabezado "Products".
        accionesBase.CompararTexto(
                objetosDePagina.Catalogo_titulo_productos,
                "Products",
                "ERROR: El catalogo de productos no es visible tras el login!");
    }

    // ─────────────────────────────────────────────────────────────────
    // Test 4: Seleccionar un producto del catálogo y verificar su detalle.
    // ─────────────────────────────────────────────────────────────────
    @Test @Order(4)
    public void Test4_SeleccionarProducto() throws Exception {
        System.out.println("Test 4: Seleccionando producto y verificando detalle.");

        // Acción + Validación: Navega al detalle del producto y confirma el título.
        funcionesDeNegocio.SeleccionarProducto();
    }

    // ─────────────────────────────────────────────────────────────────
    // Test 5: Agregar el producto al carrito desde la vista de detalle.
    // ─────────────────────────────────────────────────────────────────
    @Test @Order(5)
    public void Test5_AgregarAlCarrito() throws Exception {
        System.out.println("Test 5: Agregando producto al carrito y verificando badge.");

        // Acción + Validación: Hace clic en "Add to cart" y confirma el badge = "1".
        funcionesDeNegocio.AgregarAlCarrito();
    }
}
