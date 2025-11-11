import java.util.Scanner;

public class ciclos7_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuarioCorrecto = "usuario";
        String contraseñaCorrecta = "1234";
        
        
        boolean accesoExitoso = false;
        int intentos = 3;
        
        while (intentos > 0 && !accesoExitoso) {
            System.out.println("\nIntentos restantes: " + intentos);
            
            System.out.print("Ingrese  su usuario: ");
            String usuario = scanner.nextLine();
            
            System.out.print("Ingrese su contraseña: ");
            String password = scanner.nextLine();
            
            if (usuario.equals(usuarioCorrecto) && password.equals(contraseñaCorrecta)) {
                accesoExitoso = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                intentos--;
            }
        }
        
        if (accesoExitoso) {
            System.out.println("¡Bienvenido al sistema!");
        } else {
            System.out.println("Cuenta bloqueada. Ha excedido el número de intentos.");
        }
        scanner.close();
        }
        
    }

