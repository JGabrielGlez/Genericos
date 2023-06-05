package ProyectoFinal;
import static javax.swing.JOptionPane.*;

public class Inventario {

    private String nombreArticulo;
    private int cantidad;

    public void leer(){
        nombreArticulo=showInputDialog("Ingrese el nombre del artículo: ");
        cantidad=Integer.parseInt(showInputDialog("Ingrese la cantidad del producto: "));
    }

    public void mostrar(){showMessageDialog(null, toString());}

    public String toString(){
        return "Nombre del artículo: " + nombreArticulo + "\nCantidad del artículo: " + cantidad;
    }

    
}
