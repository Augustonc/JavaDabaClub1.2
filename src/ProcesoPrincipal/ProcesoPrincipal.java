
package ProcesoPrincipal;
import static Buscador.Buscador.buscarporsocio;
import static Informacion.Informacion.informacion;
import java.awt.AWTException;
import java.io.*;
import java.util.Scanner;
import static pantalladeinicio.pantalladeinicio.pantalladeinicio;
import static unir.unir.unir;
public class ProcesoPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        
        int opcion = 0, n = 0, reemplazar = 0, i = 0, delete = 0;
        
        Scanner eleccion = new Scanner(System.in);
        
        String[] registro = new String[100];
        
        System.out.println("Hola, por favor, maximiza esta ventana y presiona ENTER");
         int read = System.in.read();
         pantalladeinicio();
        
       private static void ejecutarOpcion(RegistroSocios registroSocios, int opcion, Scanner eleccion) {
    switch (opcion) {
        case 1:
            String nuevoRegistro = unir();
            registroSocios.agregarRegistro(nuevoRegistro);
            System.out.println("Registro exitoso!!!. El número de registro es [" + registroSocios.obtenerCantidadRegistros() + "]");
            break;
        case 2:
            registroSocios.mostrarRegistros();
            break;
        case 3:
            System.out.println("Por favor, ingrese el número de registro que desea eliminar");
            int numeroRegistroEliminar = eleccion.nextInt();
            registroSocios.borrarRegistro(numeroRegistroEliminar);
            System.out.println("Registro eliminado con éxito!!!");
            break;
        case 4:
            System.out.println("Por favor, ingrese el número de registro que desea reemplazar");
            int numeroRegistroReemplazar = eleccion.nextInt();
            String nuevoRegistroReemplazo = unir();
            registroSocios.sobreescribirRegistro(numeroRegistroReemplazar, nuevoRegistroReemplazo);
            System.out.println("Registro sobreescrito con éxito!!!");
            break;
        case 5:
            buscarporsocio(registroSocios.obtenerRegistros(), registroSocios.obtenerCantidadRegistros());
            break;
        case 6:
            informacion();
            break;
    }
}

    } //Metodo main
} //Clase ProcesoPrincipal
