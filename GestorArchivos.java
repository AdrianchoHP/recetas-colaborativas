import java.io.*;
import java.util.List;

public class GestorArchivos {
    public static void guardarRecetas(List<Receta> recetas, String archivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(recetas);
        }
    }

    public static List<Receta> cargarRecetas(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Receta>) in.readObject();
        }
    }
}

