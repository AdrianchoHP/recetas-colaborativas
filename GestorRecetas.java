import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GestorRecetas {
    private List<Receta> recetas = new ArrayList<>();
    
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }
    public List<Receta> obtenerRecetas() {
        return recetas;
    }
    public void eliminarReceta(String nombre) {
        recetas.removeIf(receta -> receta.getNombre().equalsIgnoreCase(nombre));
    }   
    public List<Receta> buscarPorIngrediente(String ingrediente) {
        return recetas.stream()
                     .filter(r -> Arrays.asList(r.getIngredientes()).contains(ingrediente))
                     .collect(Collectors.toList());
    }
    
}