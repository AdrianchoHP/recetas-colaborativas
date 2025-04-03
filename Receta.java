public class Receta {
    private String nombre;
    private String[] ingredientes;
    private String instrucciones;
    
    public Receta(String nombre, String[] ingredientes, String instrucciones) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }
    
    public String getNombre() { return nombre; }
    public String[] getIngredientes() { return ingredientes; }
    public String getInstrucciones() { return instrucciones; }

    private String categoria;

    public Receta(String nombre, String[] ingredientes, String instrucciones, String categoria) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria; }

}