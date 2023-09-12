import javax.swing.JOptionPane;

public class Princiapal {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas:"));
        
        int totalPersonas = 0;
        int personasIngresadas = 0;
        int personasMayoresEdad = 0;
        int personasMenoresEdad = 0;

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre de la persona #" + (i + 1));
            String edad = JOptionPane.showInputDialog("Edad de " + nombre);
            int edad1 = Integer.parseInt(edad);

            personasIngresadas++;
            totalPersonas++;

            if (edad1 >= 18) {
                personasMayoresEdad++;
            } else {
                personasMenoresEdad++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Resultados:\n" +
                "Total personas registradas: " + totalPersonas + "\n" +
                "Cantidad de personas ingresadas: " + personasIngresadas + "\n" +
                "Cantidad de personas mayores de edad: " + personasMayoresEdad + "\n" +
                "Cantidad de personas menores de edad: " + personasMenoresEdad);
    }
}
