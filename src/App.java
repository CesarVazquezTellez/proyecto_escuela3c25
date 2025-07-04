import screens.VentanaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Hola como estas te ves muy bien hee");
        ventanaPrincipal.setSize(500, 500);
        ventanaPrincipal.setVisible(true);
    }
}
