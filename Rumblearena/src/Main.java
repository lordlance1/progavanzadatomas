import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            String[] opciones = {"Iniciar sesión como Administrador", "Iniciar sesión como Jugador", "Salir"};

            opcion = JOptionPane.showOptionDialog(
                null,
                "Bienvenido al juego. Por favor, seleccione una opción:",
                "Inicio de Sesión",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Iniciando sesión como Administrador...");
                    //  código para el menú del administrador
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "Iniciando sesión como Jugador...");
                    // código para el menú del jugador
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del juego. ¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Seleccione una opción válida.");
            }
        } while (opcion != 2);
    }
}

