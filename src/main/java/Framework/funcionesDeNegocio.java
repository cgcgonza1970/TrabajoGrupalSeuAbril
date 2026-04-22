package Framework;

public class funcionesDeNegocio
{
    public static void Login(String Usuario, String Password) throws Exception {
        // Ingreso de credenciales del usuario.
        accionesBase.Escribir(objetosDePagina.Login_username, Usuario);
        accionesBase.Escribir(objetosDePagina.Login_password, Password);

        // Ejecución de la acción de inicio de sesión.
        accionesBase.Click(objetosDePagina.Login_submit);

        // Validación de seguridad: Verificar que el usuario aterrizó en el catálogo.
        accionesBase.CompararTexto(objetosDePagina.Catalogo_titulo_productos, "Products", "ERROR: Autentificado de Manera Incorrecta!");
    }

    public static void Logout() throws Exception {
        // Navegación: Apertura del menú lateral para visualizar opciones.
        accionesBase.Click(objetosDePagina.Catalogo_burger_menu);

        // Ejecución de la acción de cierre de sesión.
        accionesBase.Click(objetosDePagina.Catalogo_link_logout);

        // Validación de seguridad: Verificar el retorno exitoso a la pantalla de Login.
        accionesBase.CompararTexto(objetosDePagina.Login_login_logo, "Swag Labs", "ERROR: Sesion Cerrada de Manera Incorrecta!");
    }
}