class RegistrarSocioOpcion implements OpcionMenu {
    public void ejecutar(RegistroSocios registroSocios, Scanner eleccion) {
        int registroNuevo = unir();
        registroSocios.agregarRegistro(registroNuevo);
        System.out.println("Registro exitoso!!!. Número de registro: " + registroSocios.obtenerCantidadRegistros());
    }
}
