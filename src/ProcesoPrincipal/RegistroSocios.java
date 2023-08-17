public class RegistroSocios {
    private List<String> registros;

    public RegistroSocios() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public void mostrarRegistros() {
        for (int i = 0; i < registros.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + registros.get(i));
        }
    }

    // Otros métodos para manipular la colección de registros...
}
