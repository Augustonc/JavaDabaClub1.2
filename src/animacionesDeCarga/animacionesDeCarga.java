package animacionesDeCarga;

public class animacionesDeCarga {
    public static void animaciondecarga1() throws InterruptedException {
        animarCarga("...JAVA DABA CLUB...");
    }

    public static void animaciondecarga2() throws InterruptedException {
        animarCarga("...BUSCANDO SOCIO...");
    }

    private static void animarCarga(String mensaje) throws InterruptedException {
        int contador = 0;
        int i = 0;

        System.out.println("Ingresando al sistema");

        while (contador < mensaje.length()) {
            System.out.print(mensaje.substring(i, i + 1));
            Thread.sleep((long) (Math.floor(Math.random() * 200)));
            contador = contador + 1;
            i = i + 1;
        }
    }
}

