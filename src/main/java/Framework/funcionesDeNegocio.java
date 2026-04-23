package Framework;

public class funcionesDeNegocio
{
    // ─────────────────────────────────────────────────────────────────
    // Login: Ingresa credenciales, hace clic en submit y valida título.
    // ─────────────────────────────────────────────────────────────────
    public static void Login(String Usuario, String Password) throws Exception {
        // Ingreso de credenciales del usuario.
        accionesBase.Escribir(objetosDePagina.Login_username, Usuario);
        accionesBase.Escribir(objetosDePagina.Login_password, Password);

        // Ejecución de la acción de inicio de sesión.
        accionesBase.Click(objetosDePagina.Login_submit);

        // Validación de seguridad: Verificar que el usuario aterrizó en el catálogo.
        accionesBase.CompararTexto(objetosDePagina.Catalogo_titulo_productos,
                "Products",
                "ERROR: Autentificado de Manera Incorrecta!");
    }

    // ─────────────────────────────────────────────────────────────────
    // Logout: Abre el menú lateral, hace clic en logout y valida logo.
    // ─────────────────────────────────────────────────────────────────
    public static void Logout() throws Exception {
        // Navegación: Apertura del menú lateral para visualizar opciones.
        accionesBase.Click(objetosDePagina.Catalogo_burger_menu);

        // Ejecución de la acción de cierre de sesión.
        accionesBase.Click(objetosDePagina.Catalogo_link_logout);

        // Validación de seguridad: Verificar el retorno exitoso a la pantalla de Login.
        accionesBase.CompararTexto(objetosDePagina.Login_login_logo,
                "Swag Labs",
                "ERROR: Sesion Cerrada de Manera Incorrecta!");
    }

    // ─────────────────────────────────────────────────────────────────
    // SeleccionarProducto: Hace clic en el producto y valida el título
    //                      en la vista de detalle.
    // ─────────────────────────────────────────────────────────────────
    public static void SeleccionarProducto() throws Exception {
        // Interacción: Clic sobre el producto "Sauce Labs Backpack".
        accionesBase.Click(objetosDePagina.Catalogo_producto_mochila);

        // Validación: Confirmar que el título del detalle corresponde al producto.
        accionesBase.CompararTexto(objetosDePagina.Detalle_titulo_producto,
                "Sauce Labs Backpack",
                "ERROR: El producto visualizado no corresponde al seleccionado!");
    }

    // ─────────────────────────────────────────────────────────────────
    // AgregarAlCarrito: Hace clic en "Add to cart" y valida el badge
    //                   del ícono de carrito.
    // ─────────────────────────────────────────────────────────────────
    public static void AgregarAlCarrito() throws Exception {
        // Interacción: Clic sobre el botón "Add to cart" en la vista de detalle.
        accionesBase.Click(objetosDePagina.Detalle_boton_agregar);

        // Validación: Confirmar que el badge del carrito indica 1 ítem agregado.
        accionesBase.CompararTexto(objetosDePagina.Carrito_icono_badge,
                "1",
                "ERROR: El producto no fue agregado correctamente al carrito!");
    }
}
