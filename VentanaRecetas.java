import javax.swing.*;
import java.awt.event.*;

public class VentanaRecetas extends JFrame {
    public VentanaRecetas() {
        setTitle("Gestor de Recetas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btnAgregar = new JButton("Agregar Receta");
        add(btnAgregar);
        setVisible(true);
    }
}