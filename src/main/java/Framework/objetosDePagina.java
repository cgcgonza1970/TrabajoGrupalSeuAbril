package Framework;

public class objetosDePagina
{
    // ─────────────────────────────────────────────
    // Rutas de elementos — Página: Login
    // ─────────────────────────────────────────────
    public static String Login_username    = "//*[@id='user-name']";
    public static String Login_password    = "//*[@id='password']";
    public static String Login_submit      = "//*[@id='login-button']";
    public static String Login_login_logo  = "//*[@id='root']/div/div[1]";

    // ─────────────────────────────────────────────
    // Rutas de elementos — Página: Catálogo
    // ─────────────────────────────────────────────
    public static String Catalogo_titulo_productos = "//*[@class='title']";
    public static String Catalogo_burger_menu      = "//*[@id='react-burger-menu-btn']";
    public static String Catalogo_link_logout      = "//*[@id='logout_sidebar_link']";

    // Producto seleccionado: "Sauce Labs Backpack" (primer producto del catálogo)
    public static String Catalogo_producto_mochila = "//*[@id='item_4_title_link']/div";

    // ─────────────────────────────────────────────
    // Rutas de elementos — Página: Detalle de Producto
    // ─────────────────────────────────────────────
    public static String Detalle_titulo_producto   = "//*[@class='inventory_details_name large_size']";
    public static String Detalle_boton_agregar     = "//*[@id='add-to-cart']";

    // ─────────────────────────────────────────────
    // Rutas de elementos — Página: Carrito
    // ─────────────────────────────────────────────
    public static String Carrito_icono_badge       = "//*[@class='shopping_cart_badge']";
    public static String Carrito_titulo_item       = "//*[@class='inventory_item_name']";
}
