
import java.util.HashMap;
import java.sql.Date;
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, HashMap<String, String>> Citas = new HashMap<>();

        System.out.println("Registro cita");

        System.out.println("Ingrese su documento:");
        String documento = scanner.nextLine();

        HashMap<String, String> datoCitas = new HashMap<>();

        System.out.println("Ingrese su nombre:");
        datoCitas.put("nombre", scanner.nextLine());

        System.out.println("Ingrese fecha de su cita:");
        datoCitas.put("fecha", scanner.nextLine());

        System.out.println("Ingrese la hora de su cita:");
        datoCitas.put("hora", scanner.nextLine());

        Citas.put(documento, datoCitas);
        System.out.println("sus datos se han registrado correctamente!");

        System.out.println("---------| CONSULTA DE CITA |---------");

        System.out.println("Ingrese su documento:");
        String documentoConsulta = scanner.nextLine();
        if (Citas.containsKey(documentoConsulta)) {
            HashMap<String, String> informacion = Citas.get(documentoConsulta);

            System.out.println("nombre: " + informacion.get("nombre"));
            System.out.println("cita: " +  " " + informacion.get("fecha") + " " + " a las "+ informacion.get("hora"));
            System.out.println("desea cambiar los datos con la cita");

            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("si")) {

                System.out.print("Nueva fecha: ");
                informacion.put("fecha", scanner.nextLine());

                System.out.print("Nueva hora: ");
                informacion.put("hora", scanner.nextLine());

                System.out.println("Cambio realizado con éxito.");
                System.out.println("Nueva cita:");
                System.out.println(informacion.get("fecha") + " a las " + informacion.get("hora"));
            }
        } else {
            System.out.println("documento no encontrado");
        }

    }
}